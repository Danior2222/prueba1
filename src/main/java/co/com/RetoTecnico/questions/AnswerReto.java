package co.com.RetoTecnico.questions;

import co.com.RetoTecnico.userinterface.RetoSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerReto implements Question<Boolean> {
    private String question;
    public AnswerReto(String question) {
        this.question = question;
    }


    public static AnswerReto toThe(String question){
        return new AnswerReto(question);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse= Text.of(RetoSearchPage.NAME_COURSE).viewedBy(actor).asString();
        if(question.equals(nameCourse)) {
            result = true;
        }
        else{
            result = false;
        }
        return null;
    }
}
