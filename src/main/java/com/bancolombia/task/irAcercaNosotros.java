package com.bancolombia.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.bancolombia.userinterfaces.BancolombiaPersonas.ACERCA_NOSOTROS;
import static com.bancolombia.userinterfaces.BancolombiaPersonas.AVISO_PRIVACIDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class irAcercaNosotros implements Task {


    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AVISO_PRIVACIDAD));
        actor.attemptsTo(Click.on(ACERCA_NOSOTROS));
    }

  public static irAcercaNosotros home(){
        return instrumented(irAcercaNosotros.class);
  }
}
