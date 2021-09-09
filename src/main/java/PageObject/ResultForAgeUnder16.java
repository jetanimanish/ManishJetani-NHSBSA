package PageObject;

import NHSBSA.LoadProperty;
import NHSBSA.Utils;

public class ResultForAgeUnder16 extends Utils
{   LoadProperty loadProperty = new LoadProperty();

    public void resultPageWithInformation()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/result-under-16";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProperty.getProperty("resultForAgeUnder16"));
    }
}
