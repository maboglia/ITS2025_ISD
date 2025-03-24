package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StampanteScanner {

	private static Scanner scanner;
	private static PrintWriter stampante;
	
	public static List<String[]> leggiFile(File f){
		List<String[]> lettura = new ArrayList<>();
		try {
			scanner = new Scanner(f);
			
			while(scanner.hasNextLine()) {
				//String[] riga = scanner.nextLine().split(",");
				lettura.add(scanner.nextLine().split(","));
			}
			
		} catch(FileNotFoundException e) {
			System.err.println("Ci dispiace, la lettura del file non è andata a buon fine");
		}
		
		return lettura;
	}
	
}
