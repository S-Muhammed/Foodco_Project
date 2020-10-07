package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObject.HomePage;

import java.util.concurrent.TimeUnit;

public class setUps {
    //Create a login page object
    protected HomePage homePage;
    //Create a webDriver object
    public WebDriver driver;

@BeforeTest
public void setUp (){
    //Importation of chromedriver
    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

    //Instantiate a webdriver object
     driver = new ChromeDriver();

    //Maximize window size
    driver.manage().window().maximize();

    //Launch the website
    driver.get("https://foodco.ng/");

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //Instantiate the login page after launching the website
    homePage = new HomePage(driver);

}
    @AfterTest
    public void closeBrowser (){
        driver.quit();

    }

}
