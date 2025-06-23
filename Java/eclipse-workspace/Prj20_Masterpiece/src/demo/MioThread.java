package demo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.time.Duration;

public class MioThread extends Thread {

	private int volte;
	private int durataSleep;
	private String nome;
	private String indirizzoWeb;
	
	public MioThread() {
		this.volte = 5;
		this.durataSleep = 2000;
		this.nome = "Generico thread";
	}
	
	
	
	public int getVolte() {
		return volte;
	}




	public void setVolte(int volte) {
		this.volte = volte;
	}




	public int getDurataSleep() {
		return durataSleep;
	}




	public void setDurataSleep(int durataSleep) {
		this.durataSleep = durataSleep;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getIndirizzoWeb() {
		return indirizzoWeb;
	}




	public void setIndirizzoWeb(String indirizzoWeb) {
		this.indirizzoWeb = indirizzoWeb;
	}




	@Override
	public void run() {
		for (int i = 1; i <= this.volte; i++) {
			try {
				System.out.println(this.nome + " " + i + " volte!");
				System.out.println(this.indirizzoWeb);

				StringBuilder lettura = new StringBuilder();

				lettura = leggiStream(this.indirizzoWeb);
				
				boolean fatto = scriviStream(lettura, this.nome);			
			
				sleep(this.durataSleep);
				
			} catch (IOException e) {
				System.err.println("Il messaggio è " + e.getMessage() );
			} catch (InterruptedException e) {
				System.err.println("Il messaggio è " + e.getMessage() );
			}
			
		}
		
	}



	private boolean scriviStream(StringBuilder lettura, String nome2) {

		try (PrintWriter pw = new PrintWriter(new File(nome2));) {
			pw.print(lettura);
			pw.close();
			return true;
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
		return false;
	}



	private StringBuilder leggiStream(String indirizzoWeb2) throws IOException {
		StringBuilder lettura = new StringBuilder();

		InputStream is;
		BufferedInputStream bis;
		URL url = new URL(indirizzoWeb2);
		is = url.openStream();
		bis = new BufferedInputStream(is);
		
		while (true) {
			
			int i = bis.read();
			
			if (i == -1) {
				break;
			}
			
			lettura.append((char)i);
			
		}
 		
		return lettura;
	}

	
	
	
}
