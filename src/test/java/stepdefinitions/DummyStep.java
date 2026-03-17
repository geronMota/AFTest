package stepdefinitions;

import Pages.GooglePage;
import actions.GoogleAction;
import hooks.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class DummyStep {

    private final Hook hook;
    private GooglePage googlePage;   // só declara, não cria aqui
    private WebDriver driver;
    GoogleAction googleAction;

    public DummyStep(Hook hook) {
        this.hook = hook;

    }

    @Given("que eu esteja na pagina do google")
    public void que_eu_esteja_na_pagina_do_google() {
        // Configura automaticamente o ChromeDriver (sem precisar baixar manualmente)
        hook.abrirNavegador();
        this.driver = hook.getDriver();
        this.googlePage = new GooglePage(this.driver);


    }
    @When("digitar {string}")
    public void digitar(String string) {
        googlePage.googleSearch.sendKeys(string + Keys.ENTER);
    }
    @Then("deve ser exibia a cotacao do dolar")
    public void deve_ser_exibia_a_cotacao_do_dolar() {

        System.out.println("Tela exibida corretamente");

        }



}
