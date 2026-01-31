package ru.praktikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FactoryDriver extends ExternalResource {

    public FactoryDriver(){
        super();
    }

    @Override
    protected void before() throws Throwable{
        initDriver();
    }

    @Override
    protected void after(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

    private WebDriver driver;

    public void initDriver(){
        if("firefox".equals(System.getProperty("browser"))){
            startFirefox();
        } else {
            startChrome();
        }
    }

    public void startFirefox(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public void startChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }



}