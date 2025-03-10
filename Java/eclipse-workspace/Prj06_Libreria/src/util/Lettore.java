package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lettore {

	//static -> che appartiene alla classe
	
	private static Scanner scanner;
	
	public static String[][] leggiFile(String nomeFile){
		
		File f = new File(nomeFile);
		
		String[][] lettura = new String[23][5];//scatola vuota
		
		try {
			scanner = new Scanner(f);
			
			int indice = 0;
			
			while (scanner.hasNextLine()) {//per ogni riga del file
				
				String rigaFile = scanner.nextLine();//memorizzzo la riga
				
				String[] parole = rigaFile.split(",");//spezzo la riga in parti
				
				lettura[indice][0] = parole[0]; //id
				lettura[indice][1] = parole[1]; //titolo
				lettura[indice][2] = parole[2]; //prezzo
				lettura[indice][3] = parole[3]; //pagine
				lettura[indice][4] = parole[4]; //editore_id
				indice++;//incremento indice delle righe
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Spiacenti! Il file non è raggiungibile");
		}
		
		
		return lettura; //dovrebbe contenere tutte le righe del file divise per colonna
		
	}
	
	
	
	
}
