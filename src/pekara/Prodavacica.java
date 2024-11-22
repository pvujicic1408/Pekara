package pekara;

import java.util.*;

public class Prodavacica {

	private int pazar = 0;
	private Pogon pogon;
	Random rand = new Random();

	public Prodavacica(Pogon pogon) {
		this.pogon = pogon;
	}

	public void usluzi(int i) {
		System.out.println("\nDobar dan, kupac broj " + (i + 1) + ". Sta zelite da kupite?");
	}

	public boolean pitajPogon(Proizvodi proizvod) {
		return pogon.proveri(proizvod);
	}

	public void naplati(Proizvodi proizvod) {
		pazar += proizvod.getCena();
	}

	public int getPazar() {
		return pazar;
	}
}
