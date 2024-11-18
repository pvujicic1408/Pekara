package pekara;

public enum Proizvodi {
	HLEB(50), KIFLA(20), BUREK_SA_SIROM(100), BUREK_SA_MESEM(120), PITA_SA_JABUKAMA(70), PITA_SA_VISNJAMA(90);

	private final int cena;

	private Proizvodi (int cena) {
		this.cena = cena;
	}
	
	public int getCena() {
		return cena;
	}
}
