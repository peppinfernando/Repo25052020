package com.portal.toolbox.step_definitions;

import com.portal.toolbox.BaseStepDef;
import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import com.portal.toolbox.framework.toolboxUtil;
import com.portal.toolbox.datahadlers.*;
import org.assertj.core.api.SoftAssertions;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.portal.toolbox.pages.*;


public class sample extends BaseStepDef {

    private toolboxUtil toolboxUtil = new toolboxUtil();

    @Given("^I launch '(.+)' Business Onboarding & Account Opening application$")
    public void iLaunchNatewestBusinessOnboardingAccountOpeningApplication(String brandName) throws Throwable {
        switch (brandName) {
            case "RBS":
                getDriver().get(System.getProperty("ENV").replace("natwest.com", "rbs.co.uk"));
                break;
            case "Ulster":
                getDriver().manage().deleteAllCookies();
                getDriver().get(System.getProperty("ENV").replace("natwest.com/content/#/onboarding/login", "rbs.co.uk/content/ubn.html#/onboarding/login?applicationType=BB&brand=UBN"));
                break;

            default:
                getDriver().get(System.getProperty("ENV"));
                break;

        }
    }

    @When("^I login with '(.+)' to the application and navigate to homepage$")
    public void iLoginWithCredencialsToTheApplicationAndNavigateToHomepage(String credencials) throws Throwable {
        toolboxUtil.login(credencials);
        toolboxUtil.agreement();
    }

    @And("^I start New application and enter '(.+)','(.+)','(.+)','(.+)','(.+)'and'(.+)'information$")
    public void iStartNewApplicationAndEnterPersonalDetailsOrganizationDetailBusinessDetailsBusinessFinancialsAndTeamDetalsInformations(String personalDetails, String organizationDetail, String businessDetails, String businessfinancials, String teamDetals, String manageAccounts) throws Throwable {
        toolboxUtil.startNewApplication(personalDetails, organizationDetail, businessDetails, businessfinancials, teamDetals, manageAccounts);
    }

    @Then("^I should get navigate reviewapplication page$")
    public void iShouldGetNavigateManageaccountPage() throws Throwable {
        System.out.println("test completed");
    }

    @When("^Customer login with '(.+)' to the application and navigate to homepage$")
    public void CustomerLoginWithCredencialsToTheApplicationAndNavigateToHomepage(String credencials) throws Throwable {
        toolboxUtil.login(credencials);
    }


    @And("^enter personal details as '(.+)' select entity as '(.+)' and fill business contact as '(.+)' in getting started pages$")
    public void enterPersonalDetailsAsPersonaldetailsSelectEntityAsEntityAndFillBusinessContactAsBusiness_contactdetailsInGettingStartedPages(String personaldetails, String entity, String business_contactdetails) throws Throwable {
        toolboxUtil.getStarted(personaldetails, entity);
        toolboxUtil.businessContact(business_contactdetails);
    }


    @And("^enter financial details as '(.+)' , payment details as '(.+)' and '(.+)'in your business pages$")
    public void enterFinancialDetailsAsBusinessfinancialsPaymentDetailsAsBusinesspaymentAndBusinessaccoutInYourBusinessPages(String businessfinancials, String businesspayment, String businessaccount) throws Throwable {

        toolboxUtil.yourbusiness(businessfinancials, businesspayment, businessaccount);

    }

    @And("^enter team details as '(.+)' in your team section and '(.+)' detail in manage account section$")
    public void enterTeamDetailsAsTeamdetailsInYourTeamSectionAndAccountpermissionDetailInManageAccountSection(String teamdetails, String acountpermission) throws Throwable {
        toolboxUtil.youteam(teamdetails, acountpermission);
    }


    @And("^select account services options as '(.+)' and select '(.+)' option$")
    public void selectAccountServicesOptionsAsAccountservicesAndSelectAddtionalproductsOption(String accountservices, String addtionalproducts) throws Throwable {
        toolboxUtil.manageyouraccounts(accountservices, addtionalproducts);
    }


    @When("^I login to the application and navigate to homepage$")
    public void iLoginToTheApplicationAndNavigateToHomepage(List<LoginDetails> LoginDetaillist) throws AWTException {

        toolboxUtil.newlogin(LoginDetaillist);

    }

    @And("^enter personal details select entity and fill business contact in getting started pages$")
    public void enterPersonalDetailsSelectEntityAndFillBusinessContactInGettingStartedPages(List<CoustomerDetails> CoustomerDetails) throws AWTException {
        toolboxUtil.newgetStarted(CoustomerDetails);
    }
}
