package uk.harrow.gov.testsuit;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.harrow.gov.pages.HomePage;
import uk.harrow.gov.pages.loginpage.LoginPage;
import uk.harrow.gov.testbase.TestBase;

/**
 * Created by Chaitanya
 */
//login test class extends with test base class
public class LoginTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void verifyUserShouldNotNavigateToLoginPage() {
        //below methods calling from pages package
        homePage.clickOnLoginLink();

        //compare expected with actual result
        String expectedResult = "Log in";
        String actualResult = loginPage.loginWelcomeText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}