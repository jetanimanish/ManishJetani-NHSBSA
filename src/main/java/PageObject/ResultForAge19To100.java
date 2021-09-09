package PageObject;

import NHSBSA.LoadProperty;
import NHSBSA.Utils;

public class ResultForAge19To100 extends Utils
{   LoadProperty loadProperty = new LoadProperty();

    public void resultWithRelevantInformation()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/result-claiming-qualifying-universal-credit";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProperty.getProperty("resultForAge19To100"));
    }

}
