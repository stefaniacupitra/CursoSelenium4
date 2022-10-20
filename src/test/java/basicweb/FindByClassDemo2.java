package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByClassDemo2 {

    public static void main(String[] args) throws Exception {
        WebDriver driver;
        driver = new ChromeDriver();
        String baseURL = "https://www.facebook.com";
        driver.manage().window().maximize();
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.className("inputtext")).sendKeys("Cleopatra Quintero Reyes");
        Thread.sleep(2000);
        driver.findElement(By.className("_42ft")).click();
        //driver.findElement(By.name("login")).click();
        Thread.sleep(8000);
        driver.close();
    }
}
