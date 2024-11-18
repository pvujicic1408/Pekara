package pekara;

import java.util.List;

public class Prodavacica {
	private final int DNEVNA_NORMA_ZA_SVAKI_PROIZVOD = 340;
	
	Hlebara hlebara = new Hlebara();
	Burekara burekara = new Burekara();
	Pitara pitara = new Pitara();
	
	public void napraviProizvode() {
		hlebara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
		burekara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
		pitara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
	}
}
