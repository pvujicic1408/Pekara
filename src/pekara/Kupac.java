package pekara;

import java.util.*;

public class Kupac {
	Random rand = new Random();

	public Proizvodi naruci(List<Proizvodi> dostupniProizvodi) {
		Proizvodi proizvod = dostupniProizvodi.get(rand.nextInt(dostupniProizvodi.size()));
		System.out.println("Zelim " + proizvod.getNaziv() + "!");
		return proizvod;
	}
}
