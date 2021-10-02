package co.com.RetoTecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features="src/test/resources/features/RetoTecnicoUtest.feature",
                 tags = "@stories",
                 glue = "co.com.RetoTecnico.stepdefinition",
snippets = SnippetType.CAMELCASE)

public class RunnerTags {

}

