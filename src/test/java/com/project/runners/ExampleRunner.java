package com.project.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/example.feature"},
        glue = {"com.project.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class ExampleRunner {

}