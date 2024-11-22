/*Pekara prodaje hleb, kifle, burek sa sirom, burek sa mesom, pitu sa jabukama i pitu sa višnjama. 
Unutar pekare postoje tri podjedinice – jedna prozvodi hleb i kifle (u daljem tekstu : Hlebara), 
jedna prozvoidi Burek (Burekara) a treća pravi pite (Pitara). Svakog dana se, od svakog od ovih proizvoda, 
napravi po 340 komada.

Cenovnik :
Hleb : 50 din
Kifla : 20 din
Burek sa sirom : 100 din
Burek sa mesom : 120 din
Pita sa jabukama : 70 din
Pita sa višnjama : 90 din.

Tokom dana u pekaru uđe 1000 kupaca. Svaki kupac kupi tačno dva proizvoda (pretpostavićemo da kupac bira 
proizvode slučajnim izborom).

Kada kupac zatraži robu, prodavačica se obrati onim „podjedinicama“ (Hlebari, Burekari i Pitari) i 
zatraži da joj dostave odgovarajuće proizvode. Ako nekog proizvoda više nema na stanju, prodavačica kaže 
kupcu da odabere nešto drugo.

Nakon što je kupac „uspešno“ odabrao dva proizvoda, prodavačica mu ih daje i naplaćuje mu odgovarajući račun.

Napisati program koji simulira rad prodavačice u pekari (u goreopisanoj situaciji) i, na kraju, ispisuje 
ukupnu vrednost dnevnog pazara.
*/

package pekara;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		final int BROJ_KUPACA = 1000;
		final int BROJ_PROIZVODA_KOJE_KUPUJE_SVAKI_KUPAC = 2;

		Pogon pogon = new Pogon();
		Prodavacica prodavacica = new Prodavacica(pogon);
		Kupac kupac = new Kupac();

		System.out.println("Dobro jutro! Pocetak smene. Pravljenje prozivoda...");

		pogon.napravi();

		kupci: for (int i = 0; i < BROJ_KUPACA; i++) {
			List<Proizvodi> dostupniProizvodi = new ArrayList<>(Arrays.asList(Proizvodi.values()));
			prodavacica.usluzi(i);
			for (int j = 0; j < BROJ_PROIZVODA_KOJE_KUPUJE_SVAKI_KUPAC; j++) {
				boolean dostupno = false;

				while (!dostupno) {
					Proizvodi proizvod = kupac.naruci(dostupniProizvodi);
					dostupno = prodavacica.pitajPogon(proizvod);

					if (dostupno) {
						pogon.isporuci(proizvod);
						prodavacica.naplati(proizvod);
					} else {
						System.out.println(Character.toUpperCase(proizvod.getNaziv().charAt(0))
								+ proizvod.getNaziv().substring(1) + " je rasprodat! Želite li nešto drugo?");
						dostupniProizvodi.remove(proizvod);
					}

					if (dostupniProizvodi.isEmpty()) {
						System.out.println("\nNema vise nijednog proizvoda na stanju. Pekara je zatvorena!");
						break kupci;
					}
				}
			}
		}

		System.out.println("\nDanasnji pazar je " + prodavacica.getPazar() + " din");

	}
}
