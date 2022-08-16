import pageobjectpackage.MainPage;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//класс с автотестами, проверяющими раздел "Вопросы о важном"
public class TestQuestionsAboutImportant {

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
    public void testQuestionOne() throws InterruptedException {
        //Создать драйвер для браузера
        this.driver = new ChromeDriver();

        //Переходим на тестовый сайт
        driver.get("https://qa-scooter.praktikum-services.ru/");

        //Создать объект главной страницы
        MainPage page = new MainPage(driver);

        //Получить веб-элемент и проскроллить до него
        page.scrollToElement(page.getQuestionNumberOne(), 500);

        page.clickQuestionNumberOne();
        String textAnswerNumberOne = page.getAnswerNumberOne();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertEquals(expected, textAnswerNumberOne);
    }

    @Test
    public void testQuestionTwo() throws InterruptedException {

        this.driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPage page = new MainPage(driver);
        page.scrollToElement(page.getQuestionNumberTwo(), 500);

        page.clickQuestionNumberTwo();
        String textAnswerNumberTwo = page.getAnswerNumberTwo();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        assertEquals(expected, textAnswerNumberTwo);
    }

    @Test
    public void testQuestionThree() throws InterruptedException {

        this.driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPage page = new MainPage(driver);
        page.scrollToElement(page.getQuestionNumberThree(), 500);

        page.clickQuestionNumberThree();
        String textAnswerNumberThree = page.getAnswerNumberThree();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals(expected, textAnswerNumberThree);
    }

    @Test
    public void testQuestionFour() throws InterruptedException {

        this.driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPage page = new MainPage(driver);
        page.scrollToElement(page.getQuestionNumberFour(), 500);

        page.clickQuestionNumberFour();
        String textAnswerNumberFour = page.getAnswerNumberFour();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        assertEquals(expected, textAnswerNumberFour);
    }

    @Test
    public void testQuestionFive() throws InterruptedException {

        this.driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPage page = new MainPage(driver);
        page.scrollToElement(page.getQuestionNumberFive(), 500);

        page.clickQuestionNumberFive();
        String textAnswerNumberFive = page.getAnswerNumberFive();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        assertEquals(expected, textAnswerNumberFive);
    }

    @Test
    public void testQuestionSix() throws InterruptedException {

        this.driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPage page = new MainPage(driver);
        page.scrollToElement(page.getQuestionNumberSix(), 500);

        page.clickQuestionNumberSix();
        String textAnswerNumberSix = page.getAnswerNumberSix();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        assertEquals(expected, textAnswerNumberSix);
    }

    @Test
    public void testQuestionSeven() throws InterruptedException {

        this.driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPage page = new MainPage(driver);
        page.scrollToElement(page.getQuestionNumberSeven(), 500);

        page.clickQuestionNumberSeven();
        String textAnswerNumberSeven = page.getAnswerNumberSeven();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        assertEquals(expected, textAnswerNumberSeven);
    }

    @Test
    public void testQuestionEight() throws InterruptedException {

        this.driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPage page = new MainPage(driver);
        page.scrollToElement(page.getQuestionNumberEight(), 500);

        page.clickQuestionNumberEight();
        String textAnswerNumberEight = page.getAnswerNumberEight();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertEquals(expected, textAnswerNumberEight);
    }
}
