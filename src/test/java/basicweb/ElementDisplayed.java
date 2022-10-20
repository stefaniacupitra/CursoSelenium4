package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ElementDisplayed {
    WebDriver driver;
    // Adding code for JS
    private JavascriptExecutor js;
    String baseUrl1;
    String baseUrl2;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        // Adding code for JS
        js = (JavascriptExecutor) driver;
        baseUrl1 = "https://courses.letskodeit.com/practice";
        baseUrl2 = "http://www.expedia.com";
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void testLetsKodeIt() throws InterruptedException {
        driver.get(baseUrl1);

        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println("Cuadro de texto mostrado: " + textBox.isDisplayed());

        Thread.sleep(3000);

        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        hideButton.click();
        System.out.println("Hizo clic en el botón ocultar");
        System.out.println("Cuadro de texto mostrado: " + textBox.isDisplayed());

        Thread.sleep(3000);

        // Se agregó código para desplazarse hacia arriba porque el elemento se escondía detrás del menú de navegación superior
        // Aprenderá sobre el desplazamiento en futuras conferencias.
        js.executeScript("window.scrollBy(0, -190);");
        WebElement showButton = driver.findElement(By.id("show-textbox"));
        showButton.click();
        System.out.println("Hizo clic en el botón Mostrar");
        System.out.println("Cuadro de texto mostrado: " + textBox.isDisplayed());
    }

    @Test
    public void testExpedia() throws InterruptedException {
        driver.get(baseUrl2);

        WebElement childDropdown = driver.findElement(By.id("countryCode"));
        System.out.println("Desplegable secundario mostrado: " + childDropdown.isDisplayed());
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
