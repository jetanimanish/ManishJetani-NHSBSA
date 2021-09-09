package PageObject;

import NHSBSA.LoadProperty;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class UniversalCreditPage extends Utils
{   LoadProperty loadProperty = new LoadProperty();
    private By _clickYes = By.xpath("//label[@for='yes-universal']");

    public void universalCreditPaid()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/paid-universal-credit";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProperty.getProperty("universalCreditPaidMessage"));
        //click on yes
        clickOnElement(_clickYes);
    }
}
