package com.agibank.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.agibank.core.DriverFactory.getDriver;

public class BasePage {

    public void escrever(String class_campo, String texto) {
        getDriver().findElement(By.className(class_campo)).sendKeys(texto);
    }

    public void clicar(By by) {
        getDriver().findElement(by).click();
    }

    public void clicar(String seletor, String identificador) {
        if (seletor == "id") {
            clicar(By.id(identificador));
        } else if (seletor == "class")
            clicar(By.className(identificador));
    }

    public String obterTexto(By by) {
        return getDriver().findElement(by).getText();
    }

    public String obterTexto(String className) {
        return obterTexto(By.className(className));
    }

}
