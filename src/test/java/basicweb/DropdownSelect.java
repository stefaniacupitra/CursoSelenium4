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

public class DropdownSelect {
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
    public void testDropdown() throws Exception {
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.id("carselect"));
        Select sel = new Select(element);

        Thread.sleep(2000);
        System.out.println("Seleccionar Benz por valor");
        sel.selectByValue("benz");

        Thread.sleep(2000);
        System.out.println("Seleccionar Honda por índice");
        sel.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Seleccionar BMW por texto visible");
        sel.selectByVisibleText("BMW");

        Thread.sleep(2000);
        System.out.println("Imprimir la lista de todas las opciones");
        List<WebElement> options = sel.getOptions();
        int size = options.size();

        for (int i=0; i<size; i++) {
            String optionName = options.get(i).getText();
            System.out.println(optionName);
        }
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
