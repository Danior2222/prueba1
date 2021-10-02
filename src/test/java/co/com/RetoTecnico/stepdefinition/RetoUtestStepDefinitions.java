package co.com.RetoTecnico.stepdefinition;

import co.com.RetoTecnico.model.RetoData;
import co.com.RetoTecnico.tasks.Login;
import co.com.RetoTecnico.tasks.OpenUp;
import co.com.RetoTecnico.tasks.Search;
import co.com.RetoTecnico.questions.AnswerReto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoUtestStepDefinitions {
    @Before
    public void SetStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^que quiero registrarme  en  la pagina de Utest!$")
    public void queQuieroRegistrarmeEnLaPaginadeUtest(List<RetoData> retoData) throws Exception{
        OnStage.theActorCalled("D").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }
    @When("^voy a ingresar mis datos personales es necesario usar$")
    public void voyaIngresarMisDatosPersonalesEsNecesarioUsar(List<RetoData> retoData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(retoData.get(0).getStrCourse()));

    }
    @Then("^voy a buscar los respectivos course para arrojar resultados(.*)$")
    public void voyaBuscarLosRespectivosCourseParaArrojarResultados(List<RetoData> retoData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerReto.toThe(retoData.get(0).getStrCourse())));

    }
}
