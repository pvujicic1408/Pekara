package pekara;
import java.util.*;

public class Hlebara {
	List<Proizvodi> hleb = new ArrayList<>();
	List<Proizvodi> kifla = new ArrayList<>();
	
	public void napravi(int norma) {
		for(int i =0; i < norma; i++) {
			hleb.add(Proizvodi.HLEB);
			kifla.add(Proizvodi.KIFLA);
		}
	}
	
	public void isporuci() {
		
	}
	
}
