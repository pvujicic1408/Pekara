package pekara;

import java.util.*;

public class Prodavacica {

	private Pogon pogon;

	public Prodavacica(Pogon pogon) {
		this.pogon = pogon;
	}

	Random rand = new Random();

	public void usluzi(int i) {
		System.out.println();
		System.out.println("Dobar dan, kupac broj " + (i + 1) + ". Sta zelite da kupite?");
	}

	public boolean pitajPogon(Proizvodi proizvod) {
		boolean dostupno = false;
		return dostupno = pogon.proveri(proizvod);
	}
}
