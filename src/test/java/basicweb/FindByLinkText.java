package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByLinkText {

    public static void main(String[] args) throws Exception {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver",
                "/Users/scupitr/Documents/Automatizacion/CursoSelenium/Drivers/geckodriver");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String baseURL = "https://letskodeit.teachable.com/";
        driver.get(baseURL);

        /*driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);*/

        driver.findElement(By.partialLinkText("Pract")).click();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("https://courses.lets")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
