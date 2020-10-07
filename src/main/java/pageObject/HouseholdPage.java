package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HouseholdPage {
    public HouseholdPage(WebDriver driver) {
        this.driver = driver;
    }
    private static WebDriver driver;

    //Using By as a locator to locate the home appliances subcategory
    private static By homeApplianceButton = By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/ul[1]/li[2]/a[1]/span[1]/span[1]");

    public static HomeAppliancePage clickHomeApplianceButton(){
        //Click the home appliance button
        driver.findElement(homeApplianceButton).click();
        return new HomeAppliancePage(driver);

    }

}
