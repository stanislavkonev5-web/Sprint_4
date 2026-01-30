package ru.praktikum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    private final WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    private final By topOrderButton = By.className("Button_Button__ra12g");
    private final By bottomOrderButton = By.xpath(".//div[contains(@class, 'Home_FinishButton')]/button");
    private final By cookieButton = By.id("rcc-confirm-button");
    private final String faqQuestionIdTemplate = "accordion__heading-%d";
    private final String faqAnswerIdTemplate = "accordion__panel-%d";
    private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";

    public void acceptCookies() {
        if (driver.findElements(cookieButton).size() > 0) {
            driver.findElement(cookieButton).click();
        }
    }

    public void openPage(){
            driver.get(PAGE_URL);
    }

    public void clickFaqQuestion(int index) {
        By faqQuestions = By.id(String.format(faqQuestionIdTemplate, index));
        WebElement element = driver.findElement(faqQuestions);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);

        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(element));

        element.click();
    }

    public String getFaqAnswerText(int index){
        By faqAnswers = By.id(String.format(faqAnswerIdTemplate, index));
        return driver.findElement(faqAnswers).getText();
    }

    public void clickTopOrderButton(){
        driver.findElement(topOrderButton).click();
    }

    public void clickBottomOrderButton(){
        WebElement element = driver.findElement(bottomOrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
        element.click();
    }

}
