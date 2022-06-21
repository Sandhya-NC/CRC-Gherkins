package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAffiliatePage 
{
	WebDriver driver;
	

	public AddAffiliatePage(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}




	@FindBy(xpath = "(//a[@class='main-a '])[2]")
	public WebElement AffiliateTab;

	@FindBy(xpath = "(//a[@id='mySmallModalLabel'])[1]")
	public WebElement AddAffiliateButton;

	@FindBy(xpath = "//h2[@class = 'heading-h2 m-t-0 m-b-24 affilite_heading']")
	public WebElement AddAffiliateHeading;

	@FindBy(xpath = "//input[@id='fname']")
	public WebElement FirstName;
	
	@FindBy(xpath = "//input[@name='lname']")
	public WebElement LastName;
	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement Email;
	
	@FindBy(xpath = "//input[@name='mobile']")
	public WebElement PhoneNumber;
	
	@FindBy(xpath = "//input[@name='phone_ext']")
	public WebElement PhoneExtension;
	
	@FindBy(xpath = "//span[@id='select2-status-container']")
	public WebElement Status;
	
	@FindBy(xpath = "//span[@id = 'select2-portal_access-container']")
	public WebElement PortalAccess;

	@FindBy(xpath = "//input[@id = 'submit']")
	public WebElement SubmitButton;

	@FindBy(xpath = "((//span[@class = 'select2-dropdown select2-dropdown--below'])[1]")
	public WebElement StatusDropdown;

	@FindBy(xpath = "(//span[@class = 'select2-dropdown select2-dropdown--below'])[2]")
	public WebElement PortalAccessDropdown;

	@FindBy(xpath = "(//span[@class = 'select2-dropdown select2-dropdown--below'])[1]//li")
	public List<WebElement> StatusDropdowncontent;

	@FindBy(xpath = "(//span[@class = 'select2-results'])//ul//li")
	public List<WebElement> PortalAccessDropdowncontent;

	@FindBy(xpath = "//div[@id='flash-message']")
	public WebElement SuccessToastMessage;



}
