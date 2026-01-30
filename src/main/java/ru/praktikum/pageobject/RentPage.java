package ru.praktikum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RentPage {
    private final WebDriver driver;

    public RentPage(WebDriver driver){
        this.driver = driver;
    }

    private final By dateInput = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private final By rentDuration = By.className("Dropdown-control");
    private final By orderButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    private final By confirmButton = By.xpath(".//button[text()='Да']");
    private final By orderSuccessHeader = By.xpath(".//div[contains(text(), 'Заказ оформлен')]");

    public void fillRentData(String date, String duration){
        driver.findElement(dateInput).sendKeys(date);
        driver.findElement(By.xpath(".//body")).click();
        driver.findElement(rentDuration).click();
        driver.findElement(By.xpath(".//div[text()='" + duration + "']")).click();
        driver.findElement(orderButton).click();
        driver.findElement(confirmButton).click();
    }

    public boolean isSuccessWindowDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(orderSuccessHeader));
        return driver.findElement(orderSuccessHeader).isDisplayed();
    }

}
