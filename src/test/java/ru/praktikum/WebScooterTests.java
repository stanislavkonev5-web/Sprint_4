package ru.praktikum;

import org.junit.Before;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;


public class WebScooterTests {

    @Rule
    public FactoryDriver factoryDriver = new FactoryDriver();
    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = factoryDriver.getDriver();
    }


}

