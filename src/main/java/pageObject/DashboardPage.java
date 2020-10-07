package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage  {

    public DashboardPage(WebDriver driver) {
        this.driver = driver;

    }
    private WebDriver driver;

    //Using By to locate the element to select household in the categories
    private By householdButton = By.cssSelector("#nav-menu-item-3339 > a");

    public HouseholdPage clickHouseholdButton () {
        //Select household in the categories
        driver.findElement(householdButton).click();
        return new HouseholdPage(driver);
    }
}
