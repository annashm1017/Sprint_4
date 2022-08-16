package pageobjectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondPageOrder {
    private WebDriver driver;

    private By dateOfOrder = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By menuDateOfOrder = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--020 react-datepicker__day--selected react-datepicker__day--weekend']");
    private By rentalPeriod = By.className("Dropdown-placeholder");
    private By colorScooter = By.id("black");
    private By commentForCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private By buttonOrderFinish = By.xpath(".//button[contains(text(),'Заказать') and contains(@class,'Button_Middle__1CSJM')]");
    private By popupOrderComplete = By.className("Order_ModalHeader__3FDaJ");
    private By buttonConfirmation = By.xpath(".//button[text()='Да']");
    private By popupOrderProcessed = By.className("Order_ModalHeader__3FDaJ");

    public SecondPageOrder(WebDriver driver) {
        this.driver = driver;
    }

    //Выбрать дату, когда привезут самокат
    public void selectDateOfOrder() {
        driver.findElement(dateOfOrder).sendKeys("20.08.2022");
    }

    public void clickDateOfOrder() {
        driver.findElement(menuDateOfOrder).click();
    }

    //Выбрать срок аренды
    public void clickRentalPeriod() {
        driver.findElement(rentalPeriod).click();
    }

    public void selectRentalPeriod() {
        driver.findElements(By.className("Dropdown-option")).get(0).click();
    }

    //Выбрать цвет самоката
    public void clickColorScooter() {
        driver.findElement(colorScooter).click();
    }

    //Написать комментарий курьеру
    public void setCommentForCourier(String comment) {
        driver.findElement(commentForCourier).sendKeys(comment);
    }

    //Клик на кнопку "Заказать" после заполнения всей формы
    public void clickButtonOrderFinish() {
        driver.findElement(buttonOrderFinish).click();
    }

    //Попап подтверждения заказа
    public String getPopupOrderComplete() {
        return driver.findElement(popupOrderComplete).getText();
    }

    //Клик по кнопке подтверждения оформления заказа
    public void clickButtonConfirmation() {
        driver.findElement(buttonConfirmation).click();
    }

    //Проверить, что заказ оформлен
    public String getPopupOrderProcessed() {
        return driver.findElement(popupOrderProcessed).getText();
    }

    //Закончить оформление заказа
    public void finishToOrder(String comment) {
        selectDateOfOrder();
        clickDateOfOrder();
        clickRentalPeriod();
        selectRentalPeriod();
        clickColorScooter();
        setCommentForCourier(comment);
        clickButtonOrderFinish();
    }

    //Подтвердить оформление заказа
    public void askToFinishOrder() {
        //getPopupOrderComplete();
        clickButtonConfirmation();
    }
}
