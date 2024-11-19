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
	
	public void napraviProizvode() {
		hlebara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
		burekara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
		pitara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
	}

	public void usluzi() {
		
		for (int i = 0; i < BROJ_KUPACA; i++) {
			System.out.println("Dobar dan, kupac broj " + (i+1) + ". Sta zelite da kupite?");
			
			List<Integer> indeksiIzabranihProizvoda = new ArrayList<>();
			
			for(int j = 0; j < BROJ_PROIZVODA_KOJI_KUPUJE_SVAKI_KUPAC; j++) {
				indeksiIzabranihProizvoda.add(rand.nextInt(5) + 1);
			}
			
			List<Proizvodi> izabraniProizvodi = new ArrayList<>();
			
			for(int j = 0; j < BROJ_PROIZVODA_KOJI_KUPUJE_SVAKI_KUPAC; j++) {
				Proizvodi izabraniProizvod = Proizvodi.izOpcije(indeksiIzabranihProizvoda.get(j));
				izabraniProizvodi.add(izabraniProizvod);
			}
			
			zatraziProizvode(izabraniProizvodi);
		}
	}
	
	public void zatraziProizvode(List<Proizvodi> izabraniProizvodi) {
		
		
		
	}

}
