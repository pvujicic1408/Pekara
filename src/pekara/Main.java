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

public class Main {

	public static void main(String[] args) {
		final int BROJ_KUPACA = 1000;
		final int BROJ_PROIZVODA_KOJE_KUPUJE_SVAKI_KUPAC = 2;

		Pogon pogon = new Pogon();
		Prodavacica prodavacica = new Prodavacica(pogon);
		Kupac kupac = new Kupac();

		System.out.println("Dobro jutro! Pocetak smene. Pravljenje prozivoda...");

		pogon.napravi();
		int pazar = 0;

		for (int i = 0; i < BROJ_KUPACA; i++) {
			prodavacica.usluzi(i);
			for (int j = 0; j < BROJ_PROIZVODA_KOJE_KUPUJE_SVAKI_KUPAC; j++) {
				boolean dostupno = false;

				while (!dostupno) {
					Proizvodi proizvod = kupac.naruci();
					dostupno = prodavacica.pitajPogon(proizvod);
					System.out.println("Kupac " + (i + 1) + " je naručio " + proizvod.getNaziv() 
					+ (dostupno ? "" : ", ali on je rasprodat. Želite li nešto drugo?"));
					if (dostupno) {
						pogon.isporuci(proizvod);
						pazar += proizvod.getCena();
					}
				}
			}
		}

		System.out.println();
		System.out.println("Danasnji pazar je " + pazar + " din");

	}
}
