package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultipleSelect {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver",
                "/Users/scupitr/Documents/Automatizacion/CursoSelenium/Drivers/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://courses.letskodeit.com/practice";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testMultiSelect() throws Exception {
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select sel = new Select(element);

        Thread.sleep(2000);
        System.out.println("Seleccionar naranja por valor");
        sel.selectByValue("orange");

        Thread.sleep(2000);
        System.out.println("Deseleccionar naranja por valor");
        sel.deselectByValue("orange");

        Thread.sleep(2000);
        System.out.println("Seleccionar melocotón por índice");
        sel.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Seleccionar Apple por texto visible");
        sel.selectByVisibleText("Apple");

        Thread.sleep(2000);
        System.out.println("Imprimir todas las opciones seleccionadas");
        List<WebElement> selectedOptions = sel.getAllSelectedOptions();
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }

        Thread.sleep(2000);
        System.out.println("Anular la selección de todas las opciones seleccionadas");
        sel.deselectAll();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
