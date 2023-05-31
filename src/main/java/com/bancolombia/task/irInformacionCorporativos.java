package com.bancolombia.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import java.time.Duration;

import static com.bancolombia.userinterfaces.BancolombiaAcercaNosotros.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class irInformacionCorporativos implements Task {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Switch.toDefaultContext());
        INFORMACION_CORPORATIVA.waitingForNoMoreThan(Duration.ofSeconds(10)).isVisibleFor(actor);
        actor.attemptsTo(Click.on(INFORMACION_CORPORATIVA));
    }

    public static irInformacionCorporativos options(){
        return instrumented(irInformacionCorporativos.class);
    }
}
