package collezioni;

import java.util.ArrayList;
import java.util.Collections;

public class ProvaArrayList {

	public static void main(String[] args) {

		ArrayList<String> nani = new ArrayList<String>();
		
		nani.add("pisolo");
		nani.add("eolo");
		nani.add("cucciolo");
		nani.add("dotto");
		nani.add("brontolo");
		nani.add("mammolo");
		nani.add("gongolo");
		
		System.out.println("I nani sono " + nani.size());
		System.out.println("E precisamente");
		
		Collections.sort(nani);
		
		for (String nano : nani) {//foreach
			System.out.println(nano.toUpperCase());
		}
		

	}

}
