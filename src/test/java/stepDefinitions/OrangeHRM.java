package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM 
{
	WebDriver driver;
	
	
	@Given("i open browser with url {string}")
	public void i_open_browser_with_url(String url) 
	{
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(url);
	}
	@Then("i Should see Login Page")
	public void i_should_see_login_page() 
	{
		if(driver.findElement(By.id("btnLogin")).isDisplayed())
		{
		System.out.println("system display login page");
		}
	}
	@When("i enter valid user name as {string}")
	public void i_enter_valid_user_name_as(String String)
	{
	    driver.findElement(By.id("txtUsername")).sendKeys(String);
	}
	@When("i enter password as {string}")
	public void i_enter_password_as(String String) 
	{
		driver.findElement(By.id("txtPassword")).sendKeys(String);
	}
	@When("i click login")
	public void i_click_login() 
	{
	   driver.findElement(By.id("btnLogin")).click();
	}
	@Then("i should see Admin module")
	public void i_should_see_admin_module() 
	{
	    if(driver.findElement(By.linkText("Admin")).isDisplayed())
	    {
	    	System.out.println("Admin login success");
	    }
	    
	}
	@When("i click Logout")
	public void i_click_logout() 
	{
	    driver.findElement(By.partialLinkText("Welcome")).click();
	    driver.findElement(By.linkText("Logout")).click();
	}
	@When("i close the browser")
	public void i_close_the_browser()
	{
	    driver.close();
	}

}
