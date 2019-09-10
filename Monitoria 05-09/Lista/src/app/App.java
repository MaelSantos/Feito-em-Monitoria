package app;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class App {

	
	public static void main(String[] args) {
		
		ArrayList<Filha> usuarios = new ArrayList<Filha>();
		
		List<Filha> filhas = new ArrayList<Filha>();
		
		Filha filha = new Filha("Rafaela", "000");
		Filha filha2 = new Filha("Eduarda", "111");
		
		filhas.add(filha);
		filhas.add(filha2);

		System.out.println(filhas.remove(new Filha("", "111")));
		
		System.out.println(filhas);
		
//		filhas.addAll(new ArrayList<>());
//		filhas.removeAll(new ArrayList<>());
		
		System.out.println(filhas.contains(new Filha("", "000")));
		
//		for(int i = 0; i < 10; i++)
//		{
//			filhas.add(new Filha());
//		}
//		
//		for(Filha filha : filhas){
//			filha.me();
//		}
		
//		Avo avo = new Avo("Mael", "222");
//				
//		if (avo instanceof Filha) {
//			System.out.println(avo+" É um avo");
//		}
//		else
//			System.out.println(avo+" Não é um avo");
		
	}
	
}
