package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {

    public SigninPage(WebDriver driver) {
        this.driver = driver;


    }
    private static WebDriver driver;

    //Using By to locate the required elements to sign in.
    private static By email = By.id("username");
    private static By password = By.id("password");
    private static By logInButton = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/button");


    public static void enterEmail(String uEmail){
        //Find the username element and enter the username
        driver.findElement(email).sendKeys(uEmail);

    }
    public static void enterPassword(String uPwd){
        //Find the password element and enter the password
        driver.findElement(password).sendKeys(uPwd);
    }

    public static DashboardPage clickLogInButton(){
        //Find the login element, click and return a new dashboard page
        driver.findElement(logInButton).click();
        return new DashboardPage(driver);
    }
}
