package NHSBSA;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utils
{   //object for BrowserSelector class
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser()
    {   //open browser
        browserSelector.openBrowser();
        //open url
        driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
    }
    @After
    public void closeBrowser()
    {   //close browser
        //driver.quit();
    }
}
