package com.bancolombia.stepdefinitions;

import com.bancolombia.userinterfaces.BancolombiaPersonas;
import com.bancolombia.task.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class stepdefinition {
     @Managed(driver = "firefox", uniqueSession = true)
     //@Managed(driver = "chrome", uniqueSession = true)
    public WebDriver hisBrowser;
    private final Actor user = Actor.named("Mariana").whoCan(BrowseTheWeb.with(hisBrowser));
    BancolombiaPersonas bancolombiaPersonas;


    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        user.whoCan(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
    }

    @Given("ingresa a la pagina web de bancolombia personas")
    public void ingresaALaPaginaWebDeBancolombiaPersonas() {
        user.wasAbleTo(Open.browserOn().the(bancolombiaPersonas));;
    }

    @When("ir acerca de nosotros")
    public void irAcercaDeNosotros() {
      user.attemptsTo(irAcercaNosotros.home());

    }

    @And("ir a informacion coporativa")
    public void irAInformacionCoporativa() {
        user.attemptsTo(irInformacionCorporativos.options());
    }

    @And("ir a sostenibilidad")
    public void irASostenibilidad() {
        user.attemptsTo(irSostenibilidad.seccion());
    }

    @And("ir a reciclaje")
    public void irAReciclaje() {

        user.attemptsTo(irReciclaje.seccion());
    }

    @And("selecciona la opcion ¿Por que es importante reciclar?")
    public void seleccionaLaOpcionPorQueEsImportanteReciclar() {
        user.attemptsTo(seleccionarImportancia.toRecycle());
    }

    @Then("se genera la ventana emergente correspondiente")
    public void seGeneraLaVentanaEmergenteCorrespondiente() {
    }
}
