package uk.harrow.gov.pages;


import org.openqa.selenium.By;
import uk.harrow.gov.utility.Utility;

/**
 * Created by Chaitanya
 */
public class HomePage extends Utility {
    //below locators for elements on home page
    By loginLink = By.className("icon-fallback");
    By searchSymbolLink = By.xpath("//span[@class='icon toggle-icon toggle-icon--search']");
    By servicesButton = By.xpath("//span[@class='button__text'][contains(text(),'Services')]");
    By councilTaxButton = By.xpath("//div[@class='widget-row widget-row--flush widget-row--full-width']//a[2]");


    //below method creation for web elements and doing action on elements
    public void clickOnLoginLink() {
        clickonElement(loginLink);
    }

    public void clickOnSearchButton() {
        clickonElement(searchSymbolLink);
    }

    public void clickOnServiceButton() {
        clickonElement(servicesButton);
    }

    public void clickOnCouncilTaxFeature() {
        clickonElement(councilTaxButton);
    }


}