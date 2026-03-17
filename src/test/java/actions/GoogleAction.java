package actions;

import Pages.GooglePage;
import hooks.Hook;
import org.openqa.selenium.WebDriver;

public class GoogleAction {


    GooglePage googlePage;
    WebDriver driver;
    Hook hook;

    public GoogleAction(GooglePage googlePage, WebDriver driver, Hook hook) {
        this.driver = driver;
        this.googlePage = new GooglePage(driver);
        this.hook = new Hook();

    }

    public void iniciarDriver() {
        driver = hook.getDriver();
        hook.abrirNavegador();
        driver.get(googlePage.url);
    }
}
