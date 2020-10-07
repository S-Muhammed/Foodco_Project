package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected DashboardPage dashboardPage;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private static WebDriver driver;

    //Using By as a locator to locate the preferred location element
    private static By lagosButton = By.cssSelector("body > div.wh_flybox_popup > div.wh_flybox_popup_content > div.wh_flybox_warehouses_list > form > label.wh_flybox_button.Lagos");


    //Using By to locate the required element
    private By accountButton = By.cssSelector("#nav-menu-item-20267 > a");


    public static void clickLagosButton() {
        driver.findElement(lagosButton).click();
    }

    public SigninPage clickAccountButton () {
        driver.findElement(accountButton).click();
        return new SigninPage(driver);

    }
}
