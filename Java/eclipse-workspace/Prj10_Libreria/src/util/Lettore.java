package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lettore {

	//static -> che appartiene alla classe
	
	private static Scanner scanner;
	
	public static ArrayList<String[]> leggiFile(String nomeFile){
		
		File f = new File(nomeFile);
		
		ArrayList<String[]> lettura = new ArrayList<>();//scatola vuota
		
		try {
			scanner = new Scanner(f);
			
			int indice = 0;
			
			while (scanner.hasNextLine()) {//per ogni riga del file
				
				String rigaFile = scanner.nextLine();//memorizzzo la riga
				
				String[] parole = rigaFile.split(",");//spezzo la riga in parti
				
				lettura.add(parole);
		
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Spiacenti! Il file non è raggiungibile");
		}
		
		
		return lettura; //dovrebbe contenere tutte le righe del file divise per colonna
		
	}
	
	
	public static void main(String[] args) {
		leggiFile("files/libri.csv");
	}
	
}
