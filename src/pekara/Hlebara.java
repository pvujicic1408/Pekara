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
	
	public boolean zatrazi(List<Proizvodi> proizvod) {
		if(!proizvod.isEmpty()) {
			isporuci(proizvod);
			return true;	
		}
		return false;
	}
	
	
	public void isporuci(List<Proizvodi> proizvod) {
		 proizvod.remove(proizvod.size() - 1); 
		 System.out.println("proizvod isporucen");
	}	
}
