package com.agibank.core;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.agibank.core.DriverFactory.getDriver;
import static com.agibank.core.DriverFactory.killDriver;

public class BaseTest{

    @Before
    public void inicializa(){
        getDriver().get("https://blogdoagi.com.br/");
    }

    @After
    public void finaliza() throws InterruptedException {
        Thread.sleep(5000);
        killDriver();
    }
}
