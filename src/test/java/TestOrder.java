import PageObjectPackage.MainPage;
import PageObjectPackage.FirstPageOrder;
import PageObjectPackage.SecondPageOrder;
import static org.junit.Assert.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestOrder {

    private WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }

    @Test
    public void orderByButtonCenter() throws InterruptedException {
        //Создать драйвер для браузера
        this.driver = new ChromeDriver();

        //Переходим на тестовый сайт
        driver.get("https://qa-scooter.praktikum-services.ru/");

        //Создать объект главной страницы
        MainPage pageMain = new MainPage(driver);

        //Проскроллить до кнопки "Заказать" вниз по странице
        pageMain.scrollToElement(pageMain.getOrderButtonCenter(), 500);

        //Кликнуть по кнопке "Заказать" в правом верхнем углу
        pageMain.clickOrderButtonCenter();

        //Создать объект первой страницы заказа
        FirstPageOrder pageOrderOne = new FirstPageOrder(driver);
        pageOrderOne.continueToOrder("Анна", "Прохорова", "Ольховская улица, дом 5, квартира 3", "79888888888");
        pageOrderOne.clickOrderFarther();

        //Создать объект второй страницы заказа
        SecondPageOrder pageOrderTwo = new SecondPageOrder(driver);
        pageOrderTwo.finishToOrder("Не звоните в домофон, ребёнок спит.");
        pageOrderTwo.askToFinishOrder();

        String orderCompleted = pageOrderTwo.getPopupOrderProcessed();
        String expected = "Заказ оформлен";
        assertEquals(expected, orderCompleted.split("\n")[0]);
    }

    @Test
    public void orderByButtonInRightCorner() throws InterruptedException {
        //Создать драйвер для браузера
        this.driver = new ChromeDriver();

        //Переходим на тестовый сайт
        driver.get("https://qa-scooter.praktikum-services.ru/");

        //Создать объект главной страницы
        MainPage pageMain = new MainPage(driver);

        //Кликнуть по кнопке "Заказать" в правом верхнем углу
        pageMain.clickOrderButtonRightCorner();

        //Создать объект первой страницы заказа
        FirstPageOrder pageOrderOne = new FirstPageOrder(driver);
        pageOrderOne.continueToOrder("Ананас", "Петрович", "Комсомольская улица, дом 10, квартира 1", "79999999999");
        pageOrderOne.clickOrderFarther();

        //Создать объект второй страницы заказа
        SecondPageOrder pageOrderTwo = new SecondPageOrder(driver);
        pageOrderTwo.finishToOrder("Не звоните в домофон, ребёнок спит.");
        pageOrderTwo.askToFinishOrder();

        String orderCompleted = pageOrderTwo.getPopupOrderProcessed();
        String expected = "Заказ оформлен";
        assertEquals(expected, orderCompleted.split("\n")[0]);
    }
}
