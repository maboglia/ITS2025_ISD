package collezioni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProvaListe {

	public static void main(String[] args) {

		String[] treRe = {"Romolo", "Romolo", "Numa Pompilio", "Tullo Ostilio"};

		List<String> reDiRoma3 = Arrays.asList(treRe);
		
		
		ArrayList<String> reDiRoma = new ArrayList<>(reDiRoma3);
		
		Set<String> setDiRe = new HashSet<String>(reDiRoma);
		
		Set<String> reOrdinati = new TreeSet<>(reDiRoma3);
		
		System.out.println("----------------LIST------------");
		for (String re : reDiRoma) {
			System.out.println(re);
		}
		
		System.out.println("----------------SET------------");
		
		for (String re : setDiRe) {
			System.out.println(re);
		}
		
		System.out.println("----------------TREESET------------");
		
		for (String re : reOrdinati) {
			System.out.println(re);
		}
		
		
		
		List<String> reDiRoma2 = new ArrayList<>();
		List<String> reDiRoma4 = new LinkedList<>();
		
		
		

	}

}
