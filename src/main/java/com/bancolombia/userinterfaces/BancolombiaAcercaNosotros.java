package com.bancolombia.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancolombiaAcercaNosotros extends PageObject {
    public static final Target INFORMACION_CORPORATIVA= Target.the("información corporativa").located(By.xpath("//a[@class='dropdown-toggle']"));
    public static final Target SOSTENIBILIDAD= Target.the("sostenibilidad").located(By.xpath("//*[@id='navbar-collapse-grid']/ul/li[3]/ul/li/div[1]/ul[3]/li[1]/a"));
    public static final Target RECICLAJE= Target.the("reciclaje").located(By.xpath("//a[contains(text(),'Reciclaje')]"));

    public static final Target IMPORTANCIA_RECICLAR= Target.the("reciclaje").located(By.id("¿Porqué es importante reciclar?"));


}

