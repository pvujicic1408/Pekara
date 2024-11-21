package pekara;

import java.util.*;

public class Kupac {
	Random rand = new Random();

	public Proizvodi naruci() {
		int randomIndeks = rand.nextInt(Proizvodi.values().length) + 1;
		Proizvodi proizvod = Proizvodi.izOpcije(randomIndeks);
		return proizvod;
	}
}
