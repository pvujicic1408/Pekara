package pekara;

import java.util.*;

public class Hlebara {
	List<Proizvodi> hleb = new ArrayList<>();
	List<Proizvodi> kifla = new ArrayList<>();

	public void napravi(int norma) {
		for (int i = 0; i < norma; i++) {
			hleb.add(Proizvodi.HLEB);
			kifla.add(Proizvodi.KIFLA);
		}
	}

	public boolean proveri(List<Proizvodi> proizvod) {
		return !proizvod.isEmpty();
	}

	public void isporuci(List<Proizvodi> proizvod) {
		Proizvodi prodatiProizvod = proizvod.remove(proizvod.size() - 1);
		System.out.println("Proizvod " + prodatiProizvod.getNaziv() + " je isporučen. Ostalo je " + proizvod.size()
				+ " komada " + prodatiProizvod.getNaziv());
	}
}
