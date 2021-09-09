package PageObject;

import NHSBSA.LoadProperty;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class HomePage extends Utils
{
    LoadProperty loadProperty = new LoadProperty();
    private By _cookiesButton = By.cssSelector("button#nhsuk-cookie-banner__link_accept");
    private By _startNowButton = By.cssSelector("#next-button");

    public void verifyURL()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProperty.getProperty("homePageMessage"));
        //cookies accepted
        clickOnElement(_cookiesButton);
    }
    public void clickOnStartNowButton()
    {   //click on Start now button
        clickOnElement(_startNowButton);
    }
}
