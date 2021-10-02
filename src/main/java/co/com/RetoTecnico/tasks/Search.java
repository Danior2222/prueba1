package co.com.RetoTecnico.tasks;

import co.com.RetoTecnico.userinterface.RetoSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private String course;


    public Search(String course) {

        this.course = course;

    }


    public static Search the(String course){
        return Tasks.instrumented(Search.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(course).into(RetoSearchPage.INPUT_FN  ),
                Enter.theValue(course).into(RetoSearchPage.INTUP_LN   ),
                Enter.theValue(course).into(RetoSearchPage.INPUT_MAIL   ),
                Click.on(RetoSearchPage.SELECT_COURSE),
                Click.on(RetoSearchPage.NAME_COURSE),
                Click.on(RetoSearchPage.SELECT_COURSE1),
                Click.on(RetoSearchPage.NAME_COURSE1),
                Click.on(RetoSearchPage.SELECT_COURSE2),
                Click.on(RetoSearchPage.NAME_COURSE2),
                Click.on(RetoSearchPage.BUTTON_NEXT),
                Enter.theValue(course).into(RetoSearchPage.INPUT_CT  ),
                Enter.theValue(course).into(RetoSearchPage.INPUT_CP  ),
                Click.on(RetoSearchPage.BUTTON_NEXT1),
                Click.on(RetoSearchPage.SELECT_COURSE3),
                Click.on(RetoSearchPage.NAME_COURSE3),
                Click.on(RetoSearchPage.SELECT_COURSE4),
                Click.on(RetoSearchPage.NAME_COURSE4),
                Click.on(RetoSearchPage.SELECT_COURSE5),
                Click.on(RetoSearchPage.NAME_COURSE5),
                Click.on(RetoSearchPage.BUTTON_NEXT3),
                Enter.theValue(course).into(RetoSearchPage.INPUT_PWS ),
                Enter.theValue(course).into(RetoSearchPage.INPUT_CPWS ),
                Click.on(RetoSearchPage.CHECK_NEXT),
                Click.on(RetoSearchPage.CHECK_NEXT1),
                Click.on(RetoSearchPage.CHECK_NEXT2),
                Click.on(RetoSearchPage.BUTTON_NEXT4),
                Enter.theValue(course).into(RetoSearchPage.INPUT_PWS ),
                Enter.theValue(course).into(RetoSearchPage.INPUT_CPWS ));

    }
}
