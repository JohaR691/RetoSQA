package task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static userInterface.CreacionRegistroUserInterface.*;

public class CreacionRegistroTask implements Task {

    private final String Username;
    private final String Email;
    private final String Password;

    public CreacionRegistroTask(String username, String email, String password) {
        this.Username = username;
        this.Email = email;
        this.Password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(IconoInicioSesion,isVisible()).forNoMoreThan(5).seconds(),
                Click.on(IconoInicioSesion),
                WaitUntil.the(BotonCrearCuenta,isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BotonCrearCuenta),
                Enter.keyValues(Username).into(IngresoNombre),
                Enter.keyValues(Email).into(IngresoCorreo),
                Enter.keyValues(Password).into(IngresoContrasena),
                Enter.keyValues(Password).into(ConfirmacionContrasena),
                WaitUntil.the(AceptarTerminos,isClickable()).forNoMoreThan(10).seconds(),
                Click.on(AceptarTerminos),
                WaitUntil.the(BotonRegistrarse,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BotonRegistrarse),
                WaitUntil.the(NombreUsuarioCreado,isVisible()).forNoMoreThan(5).seconds()


               /* Enter.keyValues("Johanna").into(Nombre),
                Enter.keyValues("Rodriguez").into(Apellido),
                Enter.keyValues("31123123").into(Telefono),
                WaitUntil.the(Colombia, isPresent()).forNoMoreThan(60).seconds(),
                SelectFromOptions.byVisibleText("Colombia").from(Pais)*/
        );

    }

    public static Performable CrearRegistro (String username, String email, String password) {
        return Tasks.instrumented (CreacionRegistroTask.class, username, email,password);
    }
}
