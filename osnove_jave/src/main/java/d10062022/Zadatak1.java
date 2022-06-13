package d10062022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Zadatak1 {
    //Napisati program koji:
    //Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
    //Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao sa stranice i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
    //POMOC: Brisite elemente odozdo.
    //(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        String url = "https://s.bootsnipp.com/iframe/Dq2X";
        driver.manage().window().maximize();
        driver.navigate().to(url);


        List<WebElement> listaElemenata = driver.findElements(By.xpath("//button[contains(@class, 'close')]"));
        boolean elementPostoji  = false;
        for (int i = listaElemenata.size() - 1; i > 0; i--) {
            listaElemenata.get(i).click();
            try {
                WebElement e = driver.findElement(By.xpath("//button[contains(@class, 'close')]"));
                        elementPostoji= true;
            }catch (Exception e){
                elementPostoji = false;
            }
            if (elementPostoji) {
                System.out.println("Element postoji.");
            } else {
                System.out.println("Element ne postoji.");
            }
        }
        driver.quit();
    }
}

