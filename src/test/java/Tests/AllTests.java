package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.*;
import setUp.setUps;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class AllTests extends setUps {

    @Test (priority = 1)
    public void testSetUp() {
        String pageURL = "https://foodco.ng/";
        if (pageURL.equalsIgnoreCase("https://foodco.ng/")) {
            System.out.println("The webpage URL is " + pageURL);
        } else {
            System.out.println("Invalid URL. Actual webpage URL IS " + pageURL);
        }
    }
    @Test (priority = 2)
    //Test for the Homepage
    public void testVerifyAccountButton () {
        HomePage.clickLagosButton();
        SigninPage signinPage = homePage.clickAccountButton();
    }
    @Test (priority = 3)
    //Test for the Sign in page
    public void testVerifyPageTitle ()  {
        SigninPage.enterEmail("");
        SigninPage.enterPassword("");
        DashboardPage dashboardPage = SigninPage.clickLogInButton();

        //Test for the dashboard page
        HouseholdPage householdPage = dashboardPage.clickHouseholdButton();
    }
    //Test for the household page
    @Test (priority = 4)
    public void testVerifyHomeApplianceButton () {
        HomeAppliancePage homeAppliancePage = HouseholdPage.clickHomeApplianceButton();
        homeAppliancePage.clickLogOutButton();
        SigninPage signinPage = homeAppliancePage.clickConfirmLogOutButton();

        //Print a log out message
        String pageLogOut = "Account logged out.";
        if (pageLogOut.equalsIgnoreCase("Account logged out.")) {
            System.out.println("The log out message is " + pageLogOut);
        } else {
            System.out.println("The log out message is incorrect. Actual page title is " + pageLogOut);}

        //Assert the location Pop up window
        int windowCount = driver.getWindowHandles().size();
        assertEquals(windowCount, driver.getWindowHandles().size());

    }
    @Test
    //Assert three items on the list
    public void testAssertList () {
        List<String> actual = Arrays.asList ("Kenwood Blender Blp10", "Saisho Dry Iron S-1000b", "Binatone 18″ Standing Fan Ts1880 Mk2");
        List <String> expected = Arrays.asList ("Kenwood Blender Blp10", "Saisho Dry Iron S-1000b", "Binatone 18″ Standing Fan Ts1880 Mk2");
        Assert.assertEquals(actual,expected);


    }







}