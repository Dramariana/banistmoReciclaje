package com.bancolombia.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import java.time.Duration;

import static com.bancolombia.userinterfaces.BancolombiaAcercaNosotros.IMPORTANCIA_RECICLAR;
import static com.bancolombia.userinterfaces.BancolombiaAcercaNosotros.SOSTENIBILIDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class seleccionarImportancia implements Task {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Switch.toDefaultContext());
        IMPORTANCIA_RECICLAR.waitingForNoMoreThan(Duration.ofSeconds(10)).isVisibleFor(actor);
        actor.attemptsTo(Click.on(IMPORTANCIA_RECICLAR));
    }

    public static seleccionarImportancia toRecycle (){

        return instrumented(seleccionarImportancia.class);
    }
}
