package PageObject;

import NHSBSA.LoadProperty;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class CountryResidentPage extends Utils
{
    LoadProperty loadProperty = new LoadProperty();
    private By _radioButton = By.id("label-wales");
    private By _clickOnNextButton = By.id("next-button");

    public void clickOnRadioButton()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/where-you-live";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProperty.getProperty("countryResidentMessage"));
        //click on country
        clickOnElement(_radioButton);
    }
    public void clickOnNextButton()
    {   //click on next button
        clickOnElement(_clickOnNextButton);
    }

}
