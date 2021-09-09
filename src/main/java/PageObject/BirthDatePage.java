package PageObject;

import NHSBSA.LoadProperty;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class BirthDatePage extends Utils
{   LoadProperty loadProperty = new LoadProperty();
    private By _dayOfBirth = By.cssSelector("#dob-day");
    private By _monthOfBirth = By.cssSelector("#dob-month");
    private By _yearOfBirth = By.cssSelector("#dob-year");


    public void dateOfBirth()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/date-of-birth";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProperty.getProperty("dateOfBirthMessage"));
        //type day of birth
        enterText(_dayOfBirth,loadProperty.getProperty("dateOfBirth"));
        //type month of birth
        enterText(_monthOfBirth,loadProperty.getProperty("monthOfBirth"));
        //type year of birth
        enterText(_yearOfBirth,loadProperty.getProperty("yearOfBirth"));
    }

}
