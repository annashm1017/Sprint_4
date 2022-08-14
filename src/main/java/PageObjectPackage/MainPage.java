package PageObjectPackage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    private By questionNumberOne = By.id("accordion__heading-0");
    private By answerNumberOne = By.id("accordion__panel-0");

    private By questionNumberTwo = By.id("accordion__heading-1");
    private By answerNumberTwo = By.id("accordion__panel-1");

    private By questionNumberThree = By.id("accordion__heading-2");
    private By answerNumberThree = By.id("accordion__panel-2");

    private By questionNumberFour = By.id("accordion__heading-3");
    private By answerNumberFour = By.id("accordion__panel-3");

    private By questionNumberFive = By.id("accordion__heading-4");
    private By answerNumberFive = By.id("accordion__panel-4");

    private By questionNumberSix = By.id("accordion__heading-5");
    private By answerNumberSix = By.id("accordion__panel-5");

    private By questionNumberSeven = By.id("accordion__heading-6");
    private By answerNumberSeven = By.id("accordion__panel-6");

    private By questionNumberEight = By.id("accordion__heading-7");
    private By answerNumberEight = By.id("accordion__panel-7");

    private By orderButtonRightCorner = By.xpath(".//button[contains(text(),'Заказать') and contains(@class,'Button_Button__ra12g')]");
    private By orderButtonCenter = By.className("Button_Middle__1CSJM");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    //Возвращает переменную вопроса №1
    public By getQuestionNumberOne(){
        return this.questionNumberOne;
    }

    //Проскроллить до любого элемента с учетом обработчика исключения
    public void scrollToElement(By byElement, int sleepElement) throws InterruptedException {
        WebElement webElement = driver.findElement(byElement);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
        Thread.sleep(sleepElement);
    }

    //Клик на первый вопрос
    public void clickQuestionNumberOne() {
        driver.findElement(questionNumberOne).click();
    }

    //Ответ на первый вопрос
    public String getAnswerNumberOne() {
        return driver.findElement(answerNumberOne).getText();
    }

    //Возвращает переменную вопроса №2
    public By getQuestionNumberTwo(){
        return this.questionNumberTwo;
    }

    //Клик на второй вопрос
    public void clickQuestionNumberTwo(){
        driver.findElement(questionNumberTwo).click();
    }

    //Ответ на второй вопрос
    public String getAnswerNumberTwo() {
        return driver.findElement(answerNumberTwo).getText();
    }

    //Возвращает переменную вопроса №3
    public By getQuestionNumberThree(){
        return this.questionNumberThree;
    }

    //Клик на третий вопрос
    public void clickQuestionNumberThree(){
        driver.findElement(questionNumberThree).click();
    }

    //Ответ на третий вопрос
    public String getAnswerNumberThree() {
        return driver.findElement(answerNumberThree).getText();
    }

    //Возвращает переменную вопроса №4
    public By getQuestionNumberFour(){
        return this.questionNumberFour;
    }

    //Клик на четвертый вопрос
    public void clickQuestionNumberFour(){
        driver.findElement(questionNumberFour).click();
    }

    //Ответ на четвертый вопрос
    public String getAnswerNumberFour() {
        return driver.findElement(answerNumberFour).getText();
    }

    //Возвращает переменную вопроса №5
    public By getQuestionNumberFive(){
        return this.questionNumberFive;
    }

    //Клик на пятый вопрос
    public void clickQuestionNumberFive(){
        driver.findElement(questionNumberFive).click();
    }

    //Ответ на пятый вопрос
    public String getAnswerNumberFive() {
        return driver.findElement(answerNumberFive).getText();
    }

    //Возвращает переменную вопроса №6
    public By getQuestionNumberSix(){
        return this.questionNumberSix;
    }

    //Клик на шестой вопрос
    public void clickQuestionNumberSix(){
        driver.findElement(questionNumberSix).click();
    }

    //Ответ на шестой вопрос
    public String getAnswerNumberSix() {
        return driver.findElement(answerNumberSix).getText();
    }

    //Возвращает переменную вопроса №7
    public By getQuestionNumberSeven(){
        return this.questionNumberSeven;
    }

    //Клик на седьмой вопрос
    public void clickQuestionNumberSeven(){
        driver.findElement(questionNumberSeven).click();
    }

    //Ответ на седьмой вопрос
    public String getAnswerNumberSeven() {
        return driver.findElement(answerNumberSeven).getText();
    }

    //Возвращает переменную вопроса №8
    public By getQuestionNumberEight(){
        return this.questionNumberEight;
    }

    //Клик на восьмой вопрос
    public void clickQuestionNumberEight(){
        driver.findElement(questionNumberEight).click();
    }

    //Ответ на восьмой вопрос
    public String getAnswerNumberEight() {
        return driver.findElement(answerNumberEight).getText();
    }

    //Клик на кнопку "Заказать" в правом верхнем углу
    public void clickOrderButtonRightCorner(){
        driver.findElement(orderButtonRightCorner).click();
    }

    //Получить кнопку "Заказать" в середине страницы
    public By getOrderButtonCenter(){
        return this.orderButtonCenter;
    }

    //Клик на кнопку "Заказать" в центре страницы
    public void clickOrderButtonCenter(){
        driver.findElement(orderButtonCenter).click();
    }
}