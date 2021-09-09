package PageObject;

import NHSBSA.LoadProperty;
import NHSBSA.Utils;

public class ResultForAge16ToUnder19 extends Utils
{   LoadProperty loadProperty = new LoadProperty();

    public void resultWithInformation()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/result-full-time-education";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProperty.getProperty("resultForAge16ToUnder19"));
    }

}
