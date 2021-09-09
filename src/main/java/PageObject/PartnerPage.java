package PageObject;

import NHSBSA.LoadProperty;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class PartnerPage extends Utils
{   LoadProperty loadProperty = new LoadProperty();
    private By _clickOnYesButton = By.id("label-yes");

    public void liveWithPartner()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/partner";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProperty.getProperty("partnerPageMessage"));
        //click on yes
        clickOnElement(_clickOnYesButton);
    }

}
