package pekara;

public enum Proizvodi {
	HLEB(1, 50), KIFLA(2, 20); //BUREK_SA_SIROM(3, 100), BUREK_SA_MESOM(4, 120), PITA_SA_JABUKAMA(5, 70), PITA_SA_VISNJAMA(6, 90);

	private final int indeksProizvoda;
	private final int cena;

	private Proizvodi (int indeksProizvoda, int cena) {
		this.indeksProizvoda = indeksProizvoda;
		this.cena = cena;
	}
	
	public static Proizvodi izOpcije(int indeksProizvoda) {
		for(Proizvodi pr : Proizvodi.values()) {
			if(pr.getIndeksProizvoda() == indeksProizvoda) {
				return pr;
			}
		}
		return null;
	}
	
	public String getNaziv() {
		String naziv = name().replace("_", " ").toLowerCase();
        return Character.toUpperCase(naziv.charAt(0)) + naziv.substring(1);
	}
	
	public int getIndeksProizvoda() {
		return indeksProizvoda;
	}
	
	public int getCena() {
		return cena;
	}
}
