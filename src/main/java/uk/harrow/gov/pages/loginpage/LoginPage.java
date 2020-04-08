package uk.harrow.gov.pages.loginpage;

import org.openqa.selenium.By;
import uk.harrow.gov.utility.Utility;

/**
 * Created by Chaitanya
 */
public class LoginPage extends Utility {
    //locators for element
    By loginFeatureWelComeText = By.xpath("//h2[contains(text(),'Log in')]");


    //below return type method to compare expected and actual result
    public String loginWelcomeText() {
        return getTextFromElement(loginFeatureWelComeText);
    }
}
