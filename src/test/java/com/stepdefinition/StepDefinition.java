package com.stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public static WebDriver driver;
	@Given("user launch the browser")
	public void user_launch_the_browser() {
	   WebDriverManager.edgedriver().setup();
	   driver = new EdgeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	}
	@When("User enter the username as {string}")
	public void user_enter_the_username_as(String User) throws Throwable {
		Thread.sleep(2000);
	   WebElement element = driver.findElement(By.name("username"));
	   element.sendKeys(User);
	}
	@When("User enter the password as {string}")
	public void user_enter_the_password_as(String pwd) {
		WebElement Element1 = driver.findElement(By.name("password"));
		Element1.sendKeys(pwd);
	}
	@When("user click the login button")
	public void user_click_the_login_button() throws Throwable {
		Thread.sleep(2000);
	    WebElement Element2 = driver.findElement(By.xpath("//button[@type='submit']"));
	    Element2.click();
	}
	@Then("user should navigate to the dashboard page")
	public void user_should_navigate_to_the_dashboard_page() {
		String Actual = driver.getCurrentUrl();
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(Actual, expected);
	}

}
