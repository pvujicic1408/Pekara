package pekara;

import java.util.*;

public class Prodavacica {
	private final int DNEVNA_NORMA_ZA_SVAKI_PROIZVOD = 49;
	private final int BROJ_PROIZVODA_KOJI_KUPUJE_SVAKI_KUPAC = 2;
	private final int BROJ_KUPACA = 100;

	Random rand = new Random();
	
	Hlebara hlebara = new Hlebara();
//	Burekara burekara = new Burekara();
//	Pitara pitara = new Pitara();
	
	Kupac kupac = new Kupac();
	
	public void napraviProizvode() {
		hlebara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
	//	burekara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
	//	pitara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
	}

	public void usluzi() {
		
		for (int i = 0; i < BROJ_KUPACA; i++) {
			System.out.println("Dobar dan, kupac broj " + (i+1) + ". Sta zelite da kupite?");
			List<Proizvodi> izabraniProizvodi = kupac.naruci();
			zatraziProizvode(izabraniProizvodi);
		}
	}

	public void zatraziProizvode(List<Proizvodi> izabraniProizvodi) {
		for (int j = 0; j < BROJ_PROIZVODA_KOJI_KUPUJE_SVAKI_KUPAC; j++) {
			boolean dostupan = false;
			while (!dostupan) {

				switch (izabraniProizvodi.get(j)) {
				case HLEB:
					dostupan = hlebara.zatrazi(hlebara.hleb);
					if (!dostupan) {
						izabraniProizvodi.set(j, Proizvodi.values()[rand.nextInt(Proizvodi.values().length)]);
						break;
					}
					break;
				case KIFLA:
					dostupan = hlebara.zatrazi(hlebara.kifla);
					if (!dostupan) {
						izabraniProizvodi.set(j, Proizvodi.values()[rand.nextInt(Proizvodi.values().length)]);
						break;
					}
					break;

				default:
					break;
				}
			}
		}
	}
}
