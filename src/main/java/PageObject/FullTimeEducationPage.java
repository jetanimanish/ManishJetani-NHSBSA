package PageObject;

import NHSBSA.LoadProperty;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class FullTimeEducationPage extends Utils
{   LoadProperty loadProperty = new LoadProperty();
    private By _clickOnButton = By.id("label-yes");

    public void fullTimeEducation()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/full-time-education";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProperty.getProperty("fullTimeEducationMessage"));
        //click yes
        clickOnElement(_clickOnButton);
    }

}
