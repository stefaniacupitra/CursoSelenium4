package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByIdXPathDemo {

    public static void main(String[] args) throws InterruptedException {
        String baseURL = "https://learn.letskodeit.com";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("letskodeit@gmail.com");
        Thread.sleep(3000);
        driver.close();
    }
}
