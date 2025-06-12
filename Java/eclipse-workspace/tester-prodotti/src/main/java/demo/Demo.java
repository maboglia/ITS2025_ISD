package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// Inizializza il WebDriver
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://localhost:8080/prodotti/add");
        
        List<String> frutti = List.of("Mela", "Pera", "Banana", "Fragola");
        
        for (String frutto : frutti) {
        	Thread.sleep(1500);
        	tantiTest(driver, frutto);
			
		}
        
        

	}

	private static void tantiTest(WebDriver driver, String frutto) {
		WebElement nome = driver.findElement(By.id("nome"));
        nome.sendKeys(frutto + " Torres");
        WebElement categoria = driver.findElement(By.id("categoria"));
        categoria.sendKeys("Frutta");        
        WebElement origine = driver.findElement(By.id("origine"));
        origine.sendKeys("Aula 8");        
        WebElement prezzo = driver.findElement(By.id("prezzoKg"));
        prezzo.sendKeys("2");        
        WebElement disponibilita = driver.findElement(By.id("disponibilita"));
        disponibilita.sendKeys("Alta");
        WebElement bottone = driver.findElement(By.cssSelector("button"));
        
        bottone.click();
	}

}
