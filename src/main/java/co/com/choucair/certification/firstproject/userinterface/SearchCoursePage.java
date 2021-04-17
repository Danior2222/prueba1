package co.com.choucair.certification.firstproject.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class SearchCoursePage {
    public static final Target INPUT_FN = Target.the("Ingresar primer nombre").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/input,'Daniel Orlando"));
    public static final Target INTUP_LN = Target.the("Ingresar apellido").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[2]/input, 'Garzon Pinzon"));
    public static final Target INPUT_MAIL = Target.the("Ingresar Direccion de correo").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[3]/input, 'danielorlandogarzonpinzon@rocketmail.com'"));
    public static final Target SELECT_COURSE = Target.the("Dar click en el combobox Mes").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));
    public static final Target NAME_COURSE = Target.the("Seleccionar opcion mes").located(By.xpath("(//div[contains(.,'November')])[12]"));
    public static final Target SELECT_COURSE1 = Target.the("Dar click en el combobox dia").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select"));
    public static final Target NAME_COURSE1 = Target.the("Seleccionar opcion dia").located(By.xpath("(//div[contains(.,'9')])[10]"));
    public static final Target SELECT_COURSE2 = Target.the("Dar click en el combobox año").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select"));
    public static final Target NAME_COURSE2 = Target.the("Seleccionar opcion dia").located(By.xpath("(//div[contains(.,'1993')])[12]"));
    public static final Target BUTTON_NEXT = Target.the("Boton siquiente").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target INPUT_CT = Target.the("Ingresar Ciudad").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[1]/input,'Bogota"));
    public static final Target INPUT_CP = Target.the("Ingresar Codigo postal    ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[3]/input,'111921"));
    public static final Target BUTTON_NEXT1 = Target.the("Boton siquiente 2").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target SELECT_COURSE3 = Target.the("Marca de Celular").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));
    public static final Target NAME_COURSE3 = Target.the("Selecciona Opcion").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[90]/span/div"));
    public static final Target SELECT_COURSE4 = Target.the("Modelo de Celular").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));
    public static final Target NAME_COURSE4 = Target.the("Selecciona Opcion").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[88]/span/div"));
    public static final Target SELECT_COURSE5 = Target.the("Sistema operarivo Celular").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target NAME_COURSE5 = Target.the("Selecciona Opcion").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target BUTTON_NEXT3 = Target.the("Boton siquiente").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target INPUT_PWS = Target.the("Crear password").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[1]/input,'Garzon_2021"));
    public static final Target INPUT_CPWS= Target.the("Confirmar password").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[2]/input,'Garzon_2021"));
    public static final Target CHECK_NEXT = Target.the("Check confirmacion").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_NEXT1 = Target.the("Check confirmacion").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_NEXT2 = Target.the("Check confirmacion").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_NEXT4 = Target.the("Boton siquiente").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
