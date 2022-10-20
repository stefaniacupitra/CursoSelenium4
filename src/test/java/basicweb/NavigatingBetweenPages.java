package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class NavigatingBetweenPages {
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
        String title = driver.getTitle();
        System.out.println("El titulo de la pagina es: " + title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("La URL actual es:" + currentUrl);

        String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?reset_purchase_session=1";
        driver.navigate().to(urlToNavigate);
        System.out.println("Navegando para iniciar sesión");
        currentUrl = driver.getCurrentUrl();
        System.out.println("La URL actual es:" + currentUrl);

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navegar hacia atrás");
        currentUrl = driver.getCurrentUrl();
        System.out.println("La URL actual es:" + currentUrl);

        Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println("Navegar hacia adelante");
        currentUrl = driver.getCurrentUrl();
        System.out.println("La URL actual es:" + currentUrl);

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navegar hacia atrás");
        currentUrl = driver.getCurrentUrl();
        System.out.println("La URL actual es: " + currentUrl);

        driver.navigate().refresh();
        System.out.println("Navegar Actualizar");
        driver.get(currentUrl);
        System.out.println("Navegar Actualizar");

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
