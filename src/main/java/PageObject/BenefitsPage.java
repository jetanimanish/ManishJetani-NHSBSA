package PageObject;

import NHSBSA.LoadProperty;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class BenefitsPage extends Utils
{   LoadProperty loadProperty = new LoadProperty();
    private By _clickYes = By.cssSelector("#label-yes");

    public void BenefitOrTaxCredits()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/claim-benefits-tax-credits";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProperty.getProperty("benefitOrTaxCreditMessage"));
        //click yes
        clickOnElement(_clickYes);

    }

}
