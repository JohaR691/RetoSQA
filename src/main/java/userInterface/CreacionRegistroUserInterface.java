package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")

public class CreacionRegistroUserInterface extends PageObject {
    public static Target IconoInicioSesion = Target.the("Inicio de sesion").located(By.id("menuUser"));
    public static Target BotonCrearCuenta = Target.the("Crear cuenta").located(By.linkText("CREATE NEW ACCOUNT"));
    public static Target IngresoNombre = Target.the("Nombre del usuario").located(By.name("usernameRegisterPage"));
    public static Target IngresoCorreo = Target.the("Ingreso correo").located(By.name("emailRegisterPage"));
    public static Target IngresoContrasena = Target.the("Ingreso contraseña").located(By.name("passwordRegisterPage"));
    public static Target ConfirmacionContrasena = Target.the("Confirmacion Contraseña").located(By.name("confirm_passwordRegisterPage"));
    public static Target Nombre = Target.the("Ingreso nombre").located(By.name("first_nameRegisterPage"));
    public static Target Apellido = Target.the("Ingreso apellido").located(By.name("last_nameRegisterPage"));
    public static Target Telefono = Target.the("Ingreso Telefono").located(By.name("phone_numberRegisterPage"));
    public static Target Pais = Target.the("Ingreso Pais").located(By.name("countryListboxRegisterPage"));
    public static Target Colombia = Target.the("Select").located(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select/option[45]"));
    public static Target Ciudad = Target.the("Ingreso Ciudad").located(By.name("cityRegisterPage"));
}
