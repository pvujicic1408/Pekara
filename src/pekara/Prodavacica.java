package pekara;

import java.util.*;

public class Prodavacica {
	private final int DNEVNA_NORMA_ZA_SVAKI_PROIZVOD = 340;
	private final int BROJ_PROIZVODA_KOJI_KUPUJE_SVAKI_KUPAC = 2;
	private final int BROJ_KUPACA = 1000;

	Random rand = new Random();

	Hlebara hlebara = new Hlebara();
	Burekara burekara = new Burekara();
	Pitara pitara = new Pitara();

	Kupac kupac = new Kupac();

	public void napraviProizvode() {
		hlebara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
		burekara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
		pitara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
	}

	public void usluzi() {
		for (int i = 0; i < BROJ_KUPACA; i++) {
			System.out.println();
			System.out.println("Dobar dan, kupac broj " + (i + 1) + ". Sta zelite da kupite?");
			List<Proizvodi> izabraniProizvodi = kupac.naruci();
			zatrazi(izabraniProizvodi);
		}
	}

	public void zatrazi(List<Proizvodi> izabraniProizvodi) {

		for (int j = 0; j < BROJ_PROIZVODA_KOJI_KUPUJE_SVAKI_KUPAC; j++) {
			boolean dostupan = false;
			while (!dostupan) {
				Proizvodi trenutniProizvod = izabraniProizvodi.get(j);

				switch (trenutniProizvod) {

				case HLEB -> dostupan = hlebara.proveri(hlebara.hleb);
				case KIFLA -> dostupan = hlebara.proveri(hlebara.kifla);
				case BUREK_SA_SIROM -> dostupan = burekara.proveri(burekara.burekSir);
				case BUREK_SA_MESOM -> dostupan = burekara.proveri(burekara.burekMeso);
				case PITA_SA_JABUKAMA -> dostupan = pitara.proveri(pitara.pitaJabuka);
				case PITA_SA_VISNJAMA -> dostupan = pitara.proveri(pitara.pitaVisnja);
				default -> {
					break;
				}
				}

				if (dostupan) {
					switch (trenutniProizvod) {
					case HLEB -> hlebara.isporuci(hlebara.hleb);
					case KIFLA -> hlebara.isporuci(hlebara.kifla);
					case BUREK_SA_SIROM -> burekara.isporuci(burekara.burekSir);
					case BUREK_SA_MESOM -> burekara.isporuci(burekara.burekMeso);
					case PITA_SA_JABUKAMA -> pitara.isporuci(pitara.pitaJabuka);
					case PITA_SA_VISNJAMA -> pitara.isporuci(pitara.pitaVisnja);

					}
				} else {
					zameni(izabraniProizvodi, j);
				}
			}
		}
	}

	public void zameni(List<Proizvodi> izabraniProizvodi, int j) {
		System.out.println(izabraniProizvodi.get(j).getNaziv() + " vise nije dostupan. Odaberite nesto drugo!");
		izabraniProizvodi.set(j, Proizvodi.values()[rand.nextInt(Proizvodi.values().length)]);
		System.out.println("Zamenski artikal je " + izabraniProizvodi.get(j));
	}
}
