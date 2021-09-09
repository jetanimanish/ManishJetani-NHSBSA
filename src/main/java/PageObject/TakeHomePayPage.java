package PageObject;

import NHSBSA.LoadProperty;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class TakeHomePayPage extends Utils
{   LoadProperty loadProperty = new LoadProperty();
    private By _clickYes = By.id("label-yes");

    public void takeHomePay()
    {   //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/universal-credit-take-home-pay";
        //verify url
        assertCurrentURL(url);
        //message
        System.out.println(loadProperty.getProperty("takeHomePayMessage"));
        //click on yes
        clickOnElement(_clickYes);

    }

}
