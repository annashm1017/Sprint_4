package PageObjectPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class FirstPageOrder {
    private WebDriver driver;

    private By userName = By.xpath(".//input[@placeholder='* Имя']");
    private By userSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    private By userAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By userMetroStation = By.className("select-search__input");
    private By userPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By orderFarther = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public FirstPageOrder(WebDriver driver){
        this.driver = driver;
    }

    //Заполнить поле "Имя"
    public void setUserName(String username){
        driver.findElement(userName).sendKeys(username);
    }

    //Заполнить поле "Фамилия"
    public void setUserSurname(String surname) {
        driver.findElement(userSurname).sendKeys(surname);
    }

    //Заполнить поле "Адрес: куда привезти заказ"
    public void setUserAddress(String address) {
        driver.findElement(userAddress).sendKeys(address);
    }

    //Выбрать станцию метро в выпадающем списке поля "Станция метро"
    public void selectUserMetroStation(){
        driver.findElement(userMetroStation).click();
        driver.findElements(By.className("Order_Text__2broi")).get(0).click();
    }

    //Заполнить поле "Телефон: на него позвонит курьер"
    public void setUserPhone(String phone) {
        driver.findElement(userPhone).sendKeys(phone);
    }

    //Клик по кнопке "Далее"
    public void clickOrderFarther(){
        driver.findElement(orderFarther).click();
    }

    //Перейти на следующую страницу оформления заказа
    public void continueToOrder(String username, String surname, String address, String phone) {
        setUserName(username);
        setUserSurname(surname);
        setUserAddress(address);
        selectUserMetroStation();
        setUserPhone(phone);
        clickOrderFarther();
    }
}
