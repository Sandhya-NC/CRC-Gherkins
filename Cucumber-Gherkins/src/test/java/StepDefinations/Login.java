package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login 
{
	static WebDriver driver;
	LoginPage login;

	@Given("^Enter the (.*)$")
	public void enter_the_url(String url) {
		System.out.println("chrome browser is open");
		String projectpath = System.getProperty("user.dir");
		System.out.println("Project path is ="+ projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/drivers/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

	@And("I am on the login page")
	public void i_am_on_the_login_page() 
	{
		String title = driver.getTitle();
		if(title.contains("Credit Repair Cloud")) 
		{
			System.out.println("im in the login page");
		}
	}

	@When("^I enter (.*) and (.*)$")
	public void i_enter_username(String email, String password) throws InterruptedException {
		login = new LoginPage(driver);
		login.emailtextfield.sendKeys(email);
		Thread.sleep(3000);
		login.passwordtextfield.sendKeys(password);

	}


	@And("I click on the login button")
	public void i_click_on_the_login_button() {

		login.Loginbutton.click();
	}

	@Then("I should login successfull and should land on the home screen")
	public void i_should_login_successfull_and_should_land_on_the_home_screen() {

		Assert.assertTrue("Admin is in home page", login.heading.isDisplayed());
	}





}
