package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium4NewSyntax {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        /* Implicit Wait
        Implicit Wait le dirá al WebDriver que espere cierta cantidad de tiempo antes de que lance una excepción
        de «No Such Element Exception». La configuración predeterminada es 0. Una vez que configuremos el tiempo,
        el WebDriver esperará ese tiempo antes de lanzar una excepción.
        En el ejemplo siguiente hemos declarado una Implicit Wait con el marco de tiempo de 10 segundos. Esto
        significa que si el elemento no está situado en la página web dentro de ese marco de tiempo, se producirá
        una excepción.*/

        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /* Explicit Wait
        Explicit Wait se utiliza para decirle al WebDriver que espere ciertas condiciones (Expected Conditions) o el
        tiempo máximo excedido antes de lanzar una excepción «ElementNotVisibleException».
        Explicit Wait es un tipo inteligente de espera, pero sólo se puede aplicar para los elementos especificados.
        La espera explícita ofrece mejores opciones que la de una espera implícita, ya que esperará los elementos
        Ajax cargados dinámicamente.
        Una vez declarada la espera explícita tenemos que utilizar «ExpectedCondtions» o podemos configurar con qué
        frecuencia queremos comprobar la condición con Fluent Wait.
        En el ejemplo siguiente, estamos creando la espera de referencia para la clase «WebDriverWait» y la creación
        de instancias usando la referencia «WebDriver», y estamos dando un plazo máximo de 20 segundos.*/

        //WebDriverWait wait = new WebDriverWait(driver,20);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/login']")));

        // Capacidades deseadas -> Obsoleto. Reemplazado con Opciones
        // DesiredCapabilities caps = DesiredCapabilities.firefox();
        // Example
        ChromeOptions options = new ChromeOptions();
    }
}
