package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeAppliancePage  {
    public HomeAppliancePage(WebDriver driver) {
        this.driver = driver;

    }
    private WebDriver driver;

    //Using By to locate the element for the log out button
    private By logOutButton = By.xpath("//*[@id=\"nav-menu-item-6558\"]/a");
    private By confirmLogOutButton = By.cssSelector("#content > article > div > div > div.woocommerce-message > a");




    public void clickLogOutButton (){
        //log Out
        driver.findElement(logOutButton).click();
    }
    public SigninPage clickConfirmLogOutButton (){
        //Click to confirm log out.
        driver.findElement(confirmLogOutButton).click();
        return new SigninPage(driver);
    }
}
