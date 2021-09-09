package PageObject;

import NHSBSA.LoadProperty;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class UniversalCreditClaimPage extends Utils
{   LoadProperty loadProperty = new LoadProperty();
    private By _clickYes = By.cssSelector("#label-yes");

    public void universalCreditClaim()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/universal-credit-claim";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProperty.getProperty("universalCreditClaimMessage"));
        //click on yes
        clickOnElement(_clickYes);
    }
}
