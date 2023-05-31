package com.bancolombia.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import java.time.Duration;

import static com.bancolombia.userinterfaces.BancolombiaAcercaNosotros.INFORMACION_CORPORATIVA;
import static com.bancolombia.userinterfaces.BancolombiaAcercaNosotros.SOSTENIBILIDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class irSostenibilidad implements Task {

    public <T extends Actor> void performAs(T actor) {

        SOSTENIBILIDAD.waitingForNoMoreThan(Duration.ofSeconds(10)).isVisibleFor(actor);
        actor.attemptsTo(Click.on(SOSTENIBILIDAD));
    }

    public static irSostenibilidad seccion(){

        return instrumented(irSostenibilidad.class);
    }
}
