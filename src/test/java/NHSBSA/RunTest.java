package NHSBSA;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@age16toUnder19",format = {"pretty","html:target/destination"})

public class RunTest
{
}
