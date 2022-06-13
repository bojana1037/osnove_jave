package d09062022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.overlay.model.LineStyle;

import java.util.List;
import java.util.Scanner;

public class Zadatak1 {
//Maksimizirati prozor
//Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//Dohvatite dugmice za rejting kao listu. XPath za trazenje treba da bude preko id atributa i za ovo trebace vam contains u xpath-u
//Od korisnika ucitati broj (preko scannera) na koju zvezdicu je potrebno kliknuti (u rasponu od 1 do 5)
//I izvrsite akciju klik na odgovarajuci element preko indeksa
//Na kraju programa ugasite pretrazivac.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Scanner s = new Scanner(System.in);
        System.out.println("Uneti broj od 1 do 5: ");
        int x = s.nextInt();

        driver.manage().window().maximize();
        String url = "https://s.bootsnipp.com/iframe/WaXlr";
        driver.navigate().to(url);

        List< WebElement >nizDugmica= driver.findElements(By.xpath("//button[contains(@id,'rating-star-')]"));

        nizDugmica.get(x - 1).click();
        driver.quit();
}
}
