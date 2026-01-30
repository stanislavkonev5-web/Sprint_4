package ru.praktikum;

import org.openqa.selenium.By;

public class MainPageElements {

    //ШАПКА
    //Логотип "Яндекс"
    private final By yandexLogo = By.className("Header_LogoYandex__3TSOI");
    //Логотип "Самокат"
    private final By scooterLogo = By.className("Header_LogoScooter__3lsAR");
    //Дисклеймер "Учебный тренажер"
    private final By disclaimer = By.className("Header_Disclaimer__3VEni");
    //Верхняя кнопка "Заказать"
    private final By topOrderButton = By.className("Button_Button__ra12g");
    //Кнопка "Статус заказа"
    private final  By statusButton = By.className("Header_Link__1TAG7");
    //Поле ввода номера заказа
    private final By orderNumberEnterField = By.className("Input_Input__1iN_Z");
    //Кнопка "Go!"
    private final By goButton = By.xpath("//*[contains(@class, 'Button_Button__ra12g Header_Button__28dPO')]");

    //ЦЕНТРАЛЬНАЯ СЕКЦИЯ
    //Заголовок "Самокат на пару дней"
    private final By homeHeader = By.xpath(".//div[contains(text(), 'Самокат на пару дней')]");
    //Подзаголовок
    private final By firstSubHeader = By.xpath(".//div[contains(text(), 'Привезём его прямо к вашей двери')]");
    //Описание самоката, сменяющее подзаголовок при скролле
    private final By secondSubHeader = By.xpath(".//div[contains(text(), 'нежно барабанить пальцами по рулю')]");
    //Блок с техническими характеристиками самоката
    private final By techSpecifications = By.className("Home_Table__2kPxP");
    //Изображение самоката
    private final By scooterImage = By.xpath(".//img[@alt='Scooter']");

    //СЕКЦИЯ "Как это работает"
    //Заголовок "Как это работает"
    private final By howItWorksHeader = By.xpath(".//div[text()='Как это работает']");
    //Алгоритм заказа
    private final By stepOrder = By.xpath(".//div[text()='Заказываете самокат']");
    private final By stepDelivery = By.xpath(".//div[text()='Курьер привозит самокат']");
    private final By stepRide = By.xpath(".//div[text()='Катаетесь']");
    private final By stepReturn = By.xpath(".//div[text()='Курьер забирает самокат']");

    //Нижняя кнопка "Заказать"
    private final By bottomOrderButton = By.xpath(".//div[contains(@class, 'Home_FinishButton')]/button");

    //СЕКЦИЯ "Вопросы о важном"
    //Заголовок "Вопросы о важном"
    private final By faqHeader = By.xpath(".//div[text()='Вопросы о важном']");
    //Список вопросов (аккордеон)
    private final String faqQuestionIdTemplate = "accordion__heading-%d";
    //Список ответов
    private final String faqAnswerIdTemplate = "accordion__panel-%d";

    //БАННЕР COOKIE
    //Текст уведомления об использовании куки
    private final By cookieText = By.className("App_CookieText__1sbqp");
    //Кнопка принятия куки "да все привыкли"
    private final By cookieButton = By.id("rcc-confirm-button");

}
