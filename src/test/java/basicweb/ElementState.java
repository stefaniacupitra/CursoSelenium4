package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ElementState {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com";
        driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void test() {
        WebElement e1 = driver.findElement(By.className("RNNXgb"));
        System.out.println("E1 está habilitado? " + e1.isEnabled());

        WebElement e2 = driver.findElement(By.className("CcAdNb"));
        System.out.println("E2 está habilitado? " + e2.isEnabled());

        WebElement e3 = driver.findElement(By.className("gLFyf"));
        System.out.println("E3 está habilitado? " + e3.isEnabled());

        e3.sendKeys("letskodeit");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
