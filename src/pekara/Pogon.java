package pekara;

public class Pogon {
	
	private final int DNEVNA_NORMA_ZA_SVAKI_PROIZVOD = 340;

    Hlebara hlebara = new Hlebara();
    Burekara burekara = new Burekara();
    Pitara pitara = new Pitara();

    public void napravi() {
        hlebara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
        burekara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
        pitara.napravi(DNEVNA_NORMA_ZA_SVAKI_PROIZVOD);
    }

    public boolean proveri(Proizvodi trenutniProizvod) {
        boolean dostupan = false;

        switch (trenutniProizvod) {
            case HLEB -> dostupan = hlebara.proveri(hlebara.hleb);
            case KIFLA -> dostupan = hlebara.proveri(hlebara.kifla);
            case BUREK_SA_SIROM -> dostupan = burekara.proveri(burekara.burekSir);
            case BUREK_SA_MESOM -> dostupan = burekara.proveri(burekara.burekMeso);
            case PITA_SA_JABUKAMA -> dostupan = pitara.proveri(pitara.pitaJabuka);
            case PITA_SA_VISNJAMA -> dostupan = pitara.proveri(pitara.pitaVisnja);
        }

        return dostupan;
    }

    public void isporuci(Proizvodi trenutniProizvod) {
        switch (trenutniProizvod) {
            case HLEB -> hlebara.isporuci(hlebara.hleb);
            case KIFLA -> hlebara.isporuci(hlebara.kifla);
            case BUREK_SA_SIROM -> burekara.isporuci(burekara.burekSir);
            case BUREK_SA_MESOM -> burekara.isporuci(burekara.burekMeso);
            case PITA_SA_JABUKAMA -> pitara.isporuci(pitara.pitaJabuka);
            case PITA_SA_VISNJAMA -> pitara.isporuci(pitara.pitaVisnja);
        }
    }
}

