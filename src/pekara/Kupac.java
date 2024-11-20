package pekara;

import java.util.*;

public class Kupac {
	private List<Proizvodi> izabraniProizvodi = new ArrayList<>();
	Random rand = new Random();

	public List<Proizvodi> naruci() {
		izabraniProizvodi.clear();

		for (int j = 0; j < 2; j++) {
			int randomIndeks = rand.nextInt(Proizvodi.values().length) + 1;
			Proizvodi izabraniProizvod = Proizvodi.izOpcije(randomIndeks);
			izabraniProizvodi.add(izabraniProizvod);
		}
		System.out.println("Kupac je narucio: " + izabraniProizvodi);
		return izabraniProizvodi;
	}
}
