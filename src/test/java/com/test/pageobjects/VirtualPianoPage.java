package com.test.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.musicca.com/es/piano")
public class VirtualPianoPage extends PageObject {

    public static final By VIRTUALPIANO_LABEL = By.xpath("//h1[contains(text(),'Piano virtual')]");

    public static final By B3NOTE_KEY = By.xpath("//span[@data-note='3b']");
    
}
