package com.bancolombia.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/recsiclaje.feature",
        glue = "com.bancolombia.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class reciclajeRunner {
}
