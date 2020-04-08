package uk.harrow.gov.testsuit;
import org.testng.Assert;
import org.testng.annotations.Test;
import uk.harrow.gov.pages.HomePage;
import uk.harrow.gov.testbase.TestBase;

/**
 * Created by Chaitanya
 */
//home test class extends test base class
public class HomeTest extends TestBase {
    //object created for home page to call homepage methods here
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToSearchFeature() {
        //below methods calling from pages package
        homePage.clickOnSearchButton();
    }

    @Test
    public void verifyUserShouldNavigateToServicesFeature() {
        //below methods calling from pages package
        homePage.clickOnServiceButton();
    }


}