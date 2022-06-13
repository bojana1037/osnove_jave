package d10062022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Zadatak2 {
    //Napisati program koji ucitava stranicu https://geodata.solutions/
    //Bira proizvoljan Country, State i City
    //Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
    //I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
    //Izabrerit Country, State i City tako da imate podatke da selektujete!
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = "https://geodata.solutions/";
        driver.manage().window().maximize();
        driver.navigate().to(url);

        Select s1 = new Select(driver.findElement(By.id("countryId")));
        List<WebElement> country = s1.getOptions();
        Random random1 = new Random();
        int indexCountry = random1.nextInt(country.size());
        s1.selectByIndex(indexCountry);
        Thread.sleep(1000);

        Select s2 = new Select(driver.findElement(By.id("stateId")));
        List<WebElement> state = s2.getOptions();
        Random random2 = new Random();
        int indexState = random2.nextInt(state.size());
        s2.selectByIndex(indexState);
        Thread.sleep(1000);

        Select s3 = new Select(driver.findElement(By.id("cityId")));
        List<WebElement> city = s3.getOptions();
        Random random3 = new Random();
        int indexCity = random3.nextInt(city.size());
        s3.selectByIndex(indexCity);
        Thread.sleep(2000);

        driver.quit();


    }
}