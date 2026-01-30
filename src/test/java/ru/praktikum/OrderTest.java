package ru.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.praktikum.pageobject.MainPage;
import ru.praktikum.pageobject.OrderPage;
import ru.praktikum.pageobject.RentPage;

@RunWith(Parameterized.class)
public class OrderTest extends WebScooterTests {
    private final String buttonType;
    private final String name;
    private final String surname;
    private final String address;
    private final String metro;
    private final String phone;
    private final String date;
    private final String duration;

    public OrderTest(String buttonType, String name, String surname, String address, String metro, String phone, String date, String duration){
        this.buttonType = buttonType;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metro = metro;
        this.phone = phone;
        this.date = date;
        this.duration = duration;
    }

    @Parameterized.Parameters
    public static Object[][] data(){
        return new Object[][]{
        {"top", "Анна", "Андреева", "ул. Новослободская 31", "Менделеевская", "79999999999", "20.02.2026", "сутки"},
        {"bottom", "Ольга", "Чернова", "ул. Большая Никитская 43", "Баррикадная", "77777777777", "08.03.2026", "двое суток"}
    };
}

@Test
public void testOrderFlow() {

    MainPage mainPage = new MainPage(driver);
    mainPage.openPage();
    mainPage.acceptCookies();

    if ("top".equals(buttonType)) {
        mainPage.clickTopOrderButton();
    }
    else {
        mainPage.clickBottomOrderButton();
    }

    new OrderPage(driver).fillClientData(name, surname, address, metro, phone);
    RentPage rentPage = new RentPage(driver);
    rentPage.fillRentData(date, duration);

    Assert.assertTrue("Окно с сообщением об успешном создании заказа не появилось", rentPage.isSuccessWindowDisplayed());
  }

}



