package Cucumber.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class FBLoginScenario1 {

	WebDriver driver=null;
	@Given("user is on FB login page")
	public void user_is_on_fb_login_page() {
		System.out.println("Inside Step - user is on login page");
	    System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	}

	@Given("username and password fields are enabled")
	public void username_and_password_fields_are_enabled() {
		System.out.println("Inside Step - username and passord fileds are enabled ");
		
	}

	@When("user enters correct credentials")
	public void user_enters_correct_credentials() {
		 System.out.println("Inside Step - user enters correct credentials ");
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("adsuweerl123");
		 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1234");
	}

	@When("click on login button")
	public void click_on_login_button() {
		 System.out.println("Inside Step - click on login button");
		 driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Inside Step - user is navigate to home page ");
	}

}
