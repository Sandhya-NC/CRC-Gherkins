package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAffiliatePage 
{
	WebDriver driver;
	public DeleteAffiliatePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[@class='heading-h2 m-t-0 m-b-24 affilite_heading']")
	public WebElement affiliateheading;
	
	@FindBy(xpath = "//input[@id='affname']")
	public WebElement searchfield;
	
	@FindBy(xpath = "//input[@id='search']")
	public WebElement searchbutton;
	
	
	@FindBy(xpath = "//span[@id='dropdownMenuButton1']")
	public List<WebElement> dropdownmenubutton;
	
	@FindBy(xpath = "//span[@id='dropdownMenuButton1']")
	public WebElement dropdownmenubutton1;
	
	@FindBy(xpath = "(//a[@href='https://qa.creditrepaircloud.com/affiliate/edit/1757'])[2]")
	public WebElement editbutton;
	
	@FindBy(xpath = "(//a[@class='dropdown-item dropdown-padding'])[6]")
	public WebElement deletebutton;
	
	@FindBy(xpath = "//a[@id='delete_affiliate']")
	public WebElement deleteaffiliatebutton;
	
	@FindBy(xpath = "//a[@id='inactive_affiliate']")
	public WebElement inactiveaffiliatebutton;
	
	@FindBy(xpath = "(//button[@class='close'])[11]")
	public WebElement closebutton;
	
}
