package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import task.CreacionRegistroTask;
import userInterface.CreacionRegistroUserInterface;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CreacionRegistroDefinition {
    CreacionRegistroUserInterface Registro = new CreacionRegistroUserInterface();


    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("el usuario se encuentra en la pagina de login")
    public void el_usuario_se_encuentra_en_la_pagina_de_login() {
        theActorCalled("Usuario").wasAbleTo(Open.browserOn(Registro));
    }

    @Cuando("inicia la creacion del registro")
    public void inicia_la_creacion_del_registro() {
       theActorCalled("Usuario")
       .attemptsTo(CreacionRegistroTask.CrearRegistro("prueba03", "prueba@gmail.com", "Morado123"));
    }

    @Entonces("puede crear el registro correctamente")
    public void puede_crear_el_registro_correctamente() {
    theActorCalled("usuario").attemptsTo(
            Ensure.that(CreacionRegistroUserInterface.NombreUsuarioCreado).textContent().contains("prueba03")
    );
    }





}
