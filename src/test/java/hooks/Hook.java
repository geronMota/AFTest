package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hook {

    private WebDriver driver;

    @Before
    public void abrirNavegador() {
        // Configura automaticamente o ChromeDriver (sem precisar baixar manualmente)
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Opcional: tempo máximo para carregar a página
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        System.out.println("Navegador aberto com sucesso!");
    }

    @After
    public void tearDown() {

        driver.quit();
        System.out.println("Navegador fechado.");


    }

    public WebDriver getDriver() {
        return driver;
    }





}
