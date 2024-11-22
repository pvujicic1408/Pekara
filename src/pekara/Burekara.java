package pekara;

import java.util.*;

public class Burekara {
	List<Proizvodi> burekSir = new ArrayList<>();
	List<Proizvodi> burekMeso = new ArrayList<>();

	public void napravi(int norma) {
		for (int i = 0; i < norma; i++) {
			burekSir.add(Proizvodi.BUREK_SA_SIROM);
			burekMeso.add(Proizvodi.BUREK_SA_MESOM);
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
