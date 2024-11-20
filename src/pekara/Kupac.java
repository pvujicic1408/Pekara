package pekara;

import java.util.*;

public class Kupac {
	private List<Proizvodi> izabraniProizvodi = new ArrayList<>();
	Random rand = new Random();
	
	public List<Proizvodi> naruci() {
	    izabraniProizvodi.clear();

		for(int j = 0; j < 2; j++) {
			Proizvodi izabraniProizvod = Proizvodi.izOpcije(rand.nextInt(Proizvodi.values().length)+1);
			izabraniProizvodi.add(izabraniProizvod);
		}
		System.out.println(izabraniProizvodi);
	 return izabraniProizvodi;
}
}
