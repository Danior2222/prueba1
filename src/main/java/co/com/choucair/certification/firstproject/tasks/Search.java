package co.com.choucair.certification.firstproject.tasks;

import co.com.choucair.certification.firstproject.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private String course;
    private String course1;
    private String course2;
    private String course3;
    private String course4;
    private String course5;
    private String course6;

    public Search(String course, String course1, String course2, String course3, String course4, String course5, String course6) {

        this.course = course;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.course4 = course4;
        this.course5 = course5;
        this.course6 = course6;
    }


    public static Search the(String course){
        return Tasks.instrumented(Search.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(course1).into(SearchCoursePage.INPUT_FN  ),
                Enter.theValue(course).into(SearchCoursePage.INTUP_LN   ),
                Enter.theValue(course2).into(SearchCoursePage.INPUT_MAIL   ),
                Click.on(SearchCoursePage.SELECT_COURSE),
                Click.on(SearchCoursePage.NAME_COURSE),
                Click.on(SearchCoursePage.SELECT_COURSE1),
                Click.on(SearchCoursePage.NAME_COURSE1),
                Click.on(SearchCoursePage.SELECT_COURSE2),
                Click.on(SearchCoursePage.NAME_COURSE2),
                Click.on(SearchCoursePage.BUTTON_NEXT),
                Enter.theValue(course3).into(SearchCoursePage.INPUT_CT  ),
                Enter.theValue(course4).into(SearchCoursePage.INPUT_CP  ),
                Click.on(SearchCoursePage.BUTTON_NEXT1),
                Click.on(SearchCoursePage.SELECT_COURSE3),
                Click.on(SearchCoursePage.NAME_COURSE3),
                Click.on(SearchCoursePage.SELECT_COURSE4),
                Click.on(SearchCoursePage.NAME_COURSE4),
                Click.on(SearchCoursePage.SELECT_COURSE5),
                Click.on(SearchCoursePage.NAME_COURSE5),
                Click.on(SearchCoursePage.BUTTON_NEXT3),
                Enter.theValue(course5).into(SearchCoursePage.INPUT_PWS ),
                Enter.theValue(course6).into(SearchCoursePage.INPUT_CPWS ),
                Click.on(SearchCoursePage.CHECK_NEXT),
                Click.on(SearchCoursePage.CHECK_NEXT1),
                Click.on(SearchCoursePage.CHECK_NEXT2),
                Click.on(SearchCoursePage.BUTTON_NEXT4),
                Enter.theValue(course5).into(SearchCoursePage.INPUT_PWS ),
                Enter.theValue(course6).into(SearchCoursePage.INPUT_CPWS ));


    }
}
