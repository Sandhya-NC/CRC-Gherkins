package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	WebDriver driver;
	
		public LoginPage(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//input[@id='username']")
		public WebElement emailtextfield;
		
		@FindBy(xpath = "//input[@id='password']")
		public WebElement passwordtextfield;
		
		@FindBy(xpath = "//input[@id='signin']")
		public WebElement Loginbutton;
		
		@FindBy(xpath = "//h2[@class= 'm-auto heading-h2 m-t-0 m-b-40']")
		public WebElement heading;
		
}
