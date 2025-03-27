package eccezioni;

public class EccezioneArray {
	  public static void main(String[] args) {
		  int[] a = {5,3,6,5,4};
		  // attenzione al <=...
		  try {
		  for (int i=0; i<=a.length; i++) 
			  System.out.println(a[i]);
		  } catch (ArrayIndexOutOfBoundsException e) {
			  System.out.println("Si è verificata un'eccezione");
			  System.err.println("Il tipo di eccezione: " + e.getMessage());
			  System.err.println("L'ho catturata per te e adesso il programma prosegue");
		  }
		  
		  System.out.println("Ciao"); 
	  }
	}