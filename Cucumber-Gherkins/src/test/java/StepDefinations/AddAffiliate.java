package StepDefinations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import POM.AddAffiliatePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AddAffiliate 
{
	WebDriver driver;
	AddAffiliatePage affiliate;
	
	@Given("Select the affiliate tab")
	public void select_the_affiliate_tab() {
		affiliate = new AddAffiliatePage(Login.driver);
		affiliate.AffiliateTab.click();
	}
	@When("Click on the Add Affiliate button")
	public void click_on_the_add_affiliate_button() {
		affiliate.AddAffiliateButton.click();
	}
	@Then("^Should be able to enter (.*)$")
	public void should_be_able_to_enter_new(String Fname) {
		affiliate.FirstName.sendKeys(Fname);
	}
	@Then("^Should enter the (.*)$")
	public void should_enter_the_affiliate(String Lname) {
		affiliate.LastName.sendKeys(Lname);
	}
	@Then("^pass the (.*)$")
	public void pass_the_newaffiliate_yopmail_com(String mailid) {
		affiliate.Email.sendKeys(mailid);
	}
	@Then("^provide the (.*)$")
	public void provide_the_phonenumber(java.math.BigInteger int1) {
		affiliate.PhoneNumber.sendKeys(String.valueOf(int1));
	}
	@Then("Select the affiliate status")
	public void select_the_affiliate_status() {
		affiliate.Status.click();
		affiliate.StatusDropdowncontent.get(1).click();
	}
	@Then("Select the portal access")
	public void select_the_portal_access() {
		((JavascriptExecutor)Login.driver).executeScript("window.scrollBy(0,600)","");
		affiliate.PortalAccess.click();
		affiliate.PortalAccessDropdowncontent.get(2).click();;
	}

	@Then("Submit the affiliate details")
	public void submit_the_affiliate_details() {
		affiliate.SubmitButton.click();
	}

	@Then("Check affiliate created or not")
	public void check_affiliate_created_or_not() {
		org.junit.Assert.assertTrue("Affiliate added successfully", affiliate.SuccessToastMessage.isDisplayed()); 
		System.out.println("Affiliate added successfully");
	}



}
