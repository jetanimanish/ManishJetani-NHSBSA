package NHSBSA;

import PageObject.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs
{   //object for class
    HomePage homePage = new HomePage();
    CountryResidentPage countryResidentPage = new CountryResidentPage();
    BirthDatePage birthDatePage = new BirthDatePage();
    FullTimeEducationPage fullTimeEducationPage = new FullTimeEducationPage();
    PartnerPage partnerPage = new PartnerPage();
    BenefitsPage benefitsPage = new BenefitsPage();
    UniversalCreditPage universalCreditPage = new UniversalCreditPage();
    UniversalCreditClaimPage universalCreditClaimPage = new UniversalCreditClaimPage();
    TakeHomePayPage takeHomePayPage = new TakeHomePayPage();
    ResultForAgeUnder16 resultForAgeUnder16 = new ResultForAgeUnder16();
    ResultForAge16ToUnder19 resultForAge16ToUnder19 = new ResultForAge16ToUnder19();
    ResultForAge19To100 resultForAge19To100 = new ResultForAge19To100();

    @Given("^user is on NHS Cost Checker tool$")
    public void userIsOnNHSCostCheckerTool()
    {
        homePage.verifyURL();
    }

    @When("^user click on start button$")
    public void userClickOnStartButton()
    {
        homePage.clickOnStartNowButton();
    }

    @And("^user select wales country$")
    public void userSelectWalesCountry()
    {
        countryResidentPage.clickOnRadioButton();
    }

    @And("^user click on next button$")
    public void userClickOnNextButton()
    {
        countryResidentPage.clickOnNextButton();
    }

    @And("^user type date of birth$")
    public void userTypeDateOfBirth()
    {
        birthDatePage.dateOfBirth();
    }

    @And("^user select Yes in full time education$")
    public void userSelectYesInFullTimeEducation()
    {
        fullTimeEducationPage.fullTimeEducation();
    }

    @And("^user select Yes in Do you live with a partner\\?$")
    public void userSelectYesInDoYouLiveWithAPartner()
    {
        partnerPage.liveWithPartner();
    }

    @And("^user select Yes in Do you or your partner claim any benefits or tax credits\\?$")
    public void userSelectYesInDoYouOrYourPartnerClaimAnyBenefitsOrTaxCredits()
    {
        benefitsPage.BenefitOrTaxCredits();
    }

    @And("^user select Yes in Do you or your partner get paid universal credit\\?$")
    public void userSelectYesInDoYouOrYourPartnerGetPaidUniversalCredit()
    {
        universalCreditPage.universalCreditPaid();
    }

    @And("^user select Yes in As part of your joint universal credit, do you have any of these\\?$")
    public void userSelectYesInAsPartOfYourJointUniversalCreditDoYouHaveAnyOfThese()
    {
        universalCreditClaimPage.universalCreditClaim();
    }

    @And("^user select Yes in Did you and your partner have a combined take home pay of amount or less in your last universal credit period\\?$")
    public void userSelectYesInDidYouAndYourPartnerHaveACombinedTakeHomePayOfAmountOrLessInYourLastUniversalCreditPeriod()
    {
        takeHomePayPage.takeHomePay();
    }

    @Then("^user should be able to see message from NHS about help with treatment$")
    public void userShouldBeAbleToSeeMessageFromNHSAboutHelpWithTreatment()
    {
        resultForAgeUnder16.resultPageWithInformation();
    }


    @Then("^user should be able to see message from NHS for help with treatment$")
    public void userShouldBeAbleToSeeMessageFromNHSForHelpWithTreatment()
    {
        resultForAge16ToUnder19.resultWithInformation();
    }

    @Then("^user should be able to see message from NHS about help for treatment$")
    public void userShouldBeAbleToSeeMessageFromNHSAboutHelpForTreatment()
    {
        resultForAge19To100.resultWithRelevantInformation();
    }
}
