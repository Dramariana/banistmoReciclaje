package com.bancolombia.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas")

public class BancolombiaPersonas extends PageObject {
    public static final Target ACERCA_NOSOTROS= Target.the("acerca nosotros").located(By.xpath("//a[contains(text(),'Acerca de nosotros')]"));
    public static final Target AVISO_PRIVACIDAD= Target.the("aviso e privacidad").located(By.id("btn-aceptar-cookies"));
}
