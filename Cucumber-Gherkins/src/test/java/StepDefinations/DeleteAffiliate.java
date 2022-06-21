package StepDefinations;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import POM.DeleteAffiliatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ExcelReader;

public class DeleteAffiliate 
{
	WebDriver driver;
	DeleteAffiliatePage deleteaffiliate;
	String data;
	@Given("Navigate to affiliate tab")
	public void navigate_to_affiliate_tab() {
		deleteaffiliate =new DeleteAffiliatePage(Login.driver);
	   Assert.assertTrue(deleteaffiliate.affiliateheading.isDisplayed());
	   System.out.println("user is in affilate page");
	}
//	@And("Search the affiliate by filling the affiliate Email from given sheetname {string} and rownumber {int}")
//	public void search_the_affiliate_by_filling_the_affiliate_email_from_given_sheetname_and_rownumber(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
//	   ExcelReader reader = new ExcelReader();
//	   List<Map<String,String>> testData = reader.getData("./src/test/resources/data/testing.0ds", "Affiliate");
//	   String emailid = testData.get(rownumber).get("Email");
//	   deleteaffiliate.searchfield.sendKeys(emailid);
//	   deleteaffiliate.searchbutton.click();
//	}
	
//	@And("Search the affiliate by EmailId")
//	public void search_the_affiliate_by_affiliate_Email(String EmailId) throws IOException, ParseException {
//		JSONParser jsonparser = new JSONParser();
//		FileReader reader = new FileReader("./src/Data/affiliatedata.json");
//		Object obj = jsonparser.parse(reader);
//		JSONObject clientdetailsobj = (JSONObject)obj;
//		JSONArray clientdetailsArray = (JSONArray)clientdetailsobj.get("EmailId");
//		
//		String arr[] = new String[clientdetailsArray.size()];
//		
//		for(int i=0;i<clientdetailsArray.size();i++)
//		{
//			JSONObject client = (JSONObject)clientdetailsArray.get(i);
//			String affiliatemail = (String) client.get("affiliate_mail");
//			
//			arr[i]= affiliatemail;
//			data = arr[i];
//		}
//		String[] data1 = data.split(",");
//		
//		deleteaffiliate.searchfield.sendKeys(data1[0]);
//	}
	
	@And("^Search the affiliate by (.*)$")
	public void search_the_affiliate_by_affiliate_Email(String EmailId)
	{
		deleteaffiliate.searchfield.sendKeys(EmailId);
		deleteaffiliate.searchbutton.click();
	}
	
	
	
	
	
	
	@When("Click on the menu dropdown")
	public void click_on_the_menu_dropdown() throws InterruptedException {
		Assert.assertTrue(deleteaffiliate.dropdownmenubutton1.isDisplayed());
		System.out.println("menu dropdown icon is displaying successfully");
		Thread.sleep(4000);
	   deleteaffiliate.dropdownmenubutton1.click();
	}
	@And("Select the delete option")
	public void select_the_delete_option() {
	   deleteaffiliate.deletebutton.click();
	}
	@And("Confirm the deletion of affiliate")
	public void confirm_the_deletion_of_affiliate() {
	   deleteaffiliate.deleteaffiliatebutton.click();
	}
	@Then("verify affiliate is deleted or not")
	public void verify_affiliate_is_deleted_or_not() {
		System.out.println("affiliate deleted successfully");
	}


}
