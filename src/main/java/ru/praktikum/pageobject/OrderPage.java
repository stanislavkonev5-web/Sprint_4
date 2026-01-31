package ru.praktikum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private final WebDriver driver;

    public OrderPage(WebDriver driver){
        this.driver = driver;
    }

    private final By nameField = By.xpath(".//input[@placeholder='* Имя']");
    private final By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By metroStationField = By.className("select-search__input");
    private final By phoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By nextButton = By.xpath(".//button[text()='Далее']");

    public void fillClientData(String name, String surname, String address, String metro, String phone){
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(surnameField).sendKeys(surname);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(metroStationField).click();
        driver.findElement(By.xpath(".//div[text()='" + metro + "']")).click();
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(nextButton).click();

    }
}
