package pekara;
import java.util.*;

public class Pitara {
	List<Proizvodi> pitaVisnja = new ArrayList<>();
	List<Proizvodi> pitaJabuka = new ArrayList<>();
	
	public void napravi(int norma) {
		for(int i =0; i < norma; i++) {
			pitaVisnja.add(Proizvodi.PITA_SA_VISNJAMA);
			pitaJabuka.add(Proizvodi.PITA_SA_JABUKAMA);
		}
	}
	
	public void isporuci() {
		
	}
	
}