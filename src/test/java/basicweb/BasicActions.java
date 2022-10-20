package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BasicActions {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://letskodeit.teachable.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
        System.out.println("Hizo clic en iniciar sesión");
        driver.findElement(By.id("email")).sendKeys("test@email.com");
        System.out.println("Envío de claves al campo de nombre de usuario");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("test");
        System.out.println("Envío de claves al campo de contraseña");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).clear();
        System.out.println("Borrar el campo de nombre de usuario");
        Thread.sleep(2000);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
