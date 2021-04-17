package co.com.choucair.certification.firstproject.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.utest.com/")
public class ChoucairAcademyPage extends PageObject {
    public static final Target SIGNUP_BUTTON= Target.the("button that shows the form to signup").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

}
