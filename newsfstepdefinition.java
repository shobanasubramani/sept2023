package com.cucumber.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class newsfstepdefinition {
	
	WebDriver driver;
	String expected="Home Page ~ Salesforce - Developer Edition";
	
	@Given("the url")
	public void the_url()throws Throwable {
		driver=new ChromeDriver();
	    driver.get("https://login.salesforce.com/");
    
	    
	}

	@When("I enter correct username and correct password")
	public void i_enter_correct_username_and_correct_password()throws Throwable {
		driver.findElement(By.id("username")).sendKeys("shoba@sf.com");
		  driver.findElement(By.id("password")).sendKeys("salesforce123");
	    
	}

	@Then("click on login button")
	public void click_on_login_button()throws Throwable {
		driver.findElement(By.id("Login")).click();
	}

	@Then("homepage is seen")
	public void homepage_is_seen()throws Throwable {
	    String actual=driver.getTitle();
	    System.out.println(actual);
	    if(actual.equals(expected))
	    {
	    	System.out.println("passed");
	    }else
	    {
	    	System.out.println("failed");
	    }
	}

	@When("I enter wrong username and wrong password")
	public void i_enter_wrong_username_and_wrong_password() throws Throwable
	{
		driver.findElement(By.id("username")).sendKeys("shobpp@sf.com");
		  driver.findElement(By.id("password")).sendKeys("salesf123");
	}

	@Then("error message is displayed")
	public void error_message_is_displayed() throws Throwable{
		driver.findElement(By.id("error")).getText();
	}

	@When("I enter correct username and wrong password")
	public void i_enter_correct_username_and_wrong_password()throws Throwable {

		driver.findElement(By.id("username")).sendKeys("shoba@sf.com");
		  driver.findElement(By.id("password")).sendKeys("salesf123");
	}

	@Then("click remember me button")
	public void click_remember_me_button() throws Throwable{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("rememberUn")).click();
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement mainmenu=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		mainmenu.click();
		Actions a= new Actions(driver);
		a.moveToElement(mainmenu).build().perform();
		WebElement Sub = driver.findElement(By.linkText("Logout"));    
		a.moveToElement(Sub).click().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement passwordEle1=driver.findElement(By.id("password"));
		passwordEle1.sendKeys("salesforce123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Login")).click();
	}

	@Then("go to username and logout")
	public void go_to_username_and_logout() throws Throwable{
		driver.findElement(By.id("username")).sendKeys("shoba@sf.com");
		driver.findElement(By.id("Login")).click();
	}
	

	@Then("we see username on usertextbox")
	public void we_see_username_on_usertextbox()throws Throwable {
		driver.findElement(By.id("idcard-identity")).getText();
	}

	@When("I enter correct username")
	public void i_enter_correct_username() throws Throwable{
		driver.findElement(By.id("username")).sendKeys("shoba@sf.com");
	}




}
