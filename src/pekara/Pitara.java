package pekara;

import java.util.*;

public class Pitara {
	List<Proizvodi> pitaVisnja = new ArrayList<>();
	List<Proizvodi> pitaJabuka = new ArrayList<>();

	public void napravi(int norma) {
		for (int i = 0; i < norma; i++) {
			pitaVisnja.add(Proizvodi.PITA_SA_VISNJAMA);
			pitaJabuka.add(Proizvodi.PITA_SA_JABUKAMA);
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
