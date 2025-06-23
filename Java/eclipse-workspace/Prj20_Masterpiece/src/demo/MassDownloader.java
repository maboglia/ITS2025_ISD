package demo;

public class MassDownloader {

	public static void main(String[] args) throws InterruptedException {

		String basePath = "C:\\Users\\m.bogliaccino\\Desktop\\";
		
		MioThread t1 = new MioThread();
		t1.setDurataSleep(1000);
		t1.setVolte(1);
		t1.setNome(basePath +  "sito_finanza.html");
		t1.setIndirizzoWeb("https://www.milanofinanza.it/mercati");

		MioThread t2 = new MioThread();
		t2.setDurataSleep(1000);
		t2.setVolte(1);
		t2.setNome(basePath + "sito_yahoo.html");
		t2.setIndirizzoWeb("https://it.finance.yahoo.com/mercati/titoli/i-pi%c3%b9-scambiati/");

		
		
		t1.start();
		t2.start();
		
		Runnable r = () -> System.out.println();

		System.out.println("Il processo di download è iniziato");
		
		Thread.sleep(3000);
		System.out.println("Il processo è terminato!!!");

	}

}
