package pekara;

public enum Proizvodi {
	HLEB(1, 50), KIFLA(2, 20), BUREK_SA_SIROM(3, 100), BUREK_SA_MESOM(4, 120), PITA_SA_JABUKAMA(5, 70),
	PITA_SA_VISNJAMA(6, 90);

	private final int indeks;
	private final int cena;

	private Proizvodi(int indeks, int cena) {
		this.indeks = indeks;
		this.cena = cena;
	}

	public static Proizvodi izOpcije(int indeks) {
		for (Proizvodi pr : Proizvodi.values()) {
			if (pr.getIndeks() == indeks) {
				return pr;
			}
		}
		return null;
	}

	public String getNaziv() {
		String naziv = name().replace("_", " ").toLowerCase();
		return Character.toLowerCase(naziv.charAt(0)) + naziv.substring(1);
	}

	public int getIndeks() {
		return indeks;
	}

	public int getCena() {
		return cena;
	}
}
