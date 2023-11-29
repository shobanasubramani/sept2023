package salesforceloginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class sfloginpage extends Basepagesf {
	
	
	public static void Loginhomepage()throws InterruptedException
	{
		System.out.println("******Loginhomepage automation script started***********");
		String expected="Shobana Subramani";
		launchBrowser("firefox");
		goToUrl("https://login.salesforce.com/");
		maximiseBrowser();
		WebElement UserNameEle=driver.findElement(By.id("username"));
		enterText(UserNameEle,"shoba@sf.com","username textbox");
		WebElement passwordEle=driver.findElement(By.id("password"));
		enterText(passwordEle,"salesforce123","password textbox");
		waitForVisibility(passwordEle,10,"passwordtextbox");
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(2000);
		WebElement Username=driver.findElement(By.id("userNavLabel"));
		waitForVisibility(Username,10,"usernametextbox");
		String actual=Username.getText();
		if(actual.equals(expected))
		{
			System.out.println("test passed");
		}else
		{
			System.out.println("test passed");
		}
		closeBrowser();
	}
	
	
	
	public static void Loginnopassword()throws InterruptedException
	{
		launchBrowser("firefox");
		goToUrl("https://login.salesforce.com/");
		
		
		WebElement UsernameEle=driver.findElement(By.id("username"));
		waitForVisibility(UsernameEle,5,"username textbox");
		enterText(UsernameEle,"shoba@sf.com","username textbox");
		
		driver.findElement(By.id("Login")).click();
		
	}

	public static void Loginrememberme()throws InterruptedException
	{
		System.out.println("***********Logininrememberme started***********");
		launchBrowser("firefox");
		goToUrl("https://login.salesforce.com/");
	
		WebElement UsernameEle=driver.findElement(By.id("username"));
		enterText(UsernameEle,"shoba@sf.com","username textbox");
		
		WebElement passwordEle=driver.findElement(By.id("password"));
		enterText(passwordEle,"salesforce123","password textbox");
		waitForVisibility(passwordEle,15,"passwordtextbox");
		
		driver.findElement(By.id("rememberUn")).click();
		WebElement login=driver.findElement(By.id("Login"));
				login.click();
		waitForVisibility(login,20,"logintextbox");
		System.out.println("login clicked");
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.id("userNavLabel"));
				username.click();
				waitForVisibility(username,15,"usernametextbox");
				
		Actions a= new Actions(driver);
		WebElement mainmenu=driver.findElement(By.id("userNavLabel"));
		a.moveToElement(mainmenu).build().perform();
		WebElement Sub = driver.findElement(By.linkText("Logout"));    
		a.moveToElement(Sub).click().perform();
		
		WebElement passwordEle1=driver.findElement(By.id("password"));
		enterText(passwordEle1,"salesforce123","password textbox");
		waitForVisibility(passwordEle1,10,"passwordtextbox");

		driver.findElement(By.id("Login")).click();
	closeBrowser();
		}

	public static void Loginwronguserpass() throws InterruptedException
	{   
		System.out.println("***********Loginwronguserpass**************");
		launchBrowser("firefox");
	    goToUrl("https://login.salesforce.com/");
	
	    WebElement UsernameEle=driver.findElement(By.id("username"));
	    enterText(UsernameEle,"shoba@sd.com","username textbox");
		
		WebElement passwordEle=driver.findElement(By.id("password"));
		enterText(passwordEle,"salesforce12","password textbox");
		waitForVisibility(passwordEle,15,"passwordtextbox");
		driver.findElement(By.id("Login")).click();	
	}
	
	
	public static void Loginforgotpassword() throws InterruptedException
	{
		
		System.out.println("***********Loginforgotpassword**************");
		launchBrowser("firefox");
	    goToUrl("https://login.salesforce.com/");
		WebElement forgotpasswrd=driver.findElement(By.id("forgot_password_link"));
		forgotpasswrd.click();
		
		}
	

	public static void main(String[] args) throws InterruptedException{
		//Loginhomepage();
	//	Loginnopassword();
		Loginrememberme();	
		//Loginwronguserpass();
	//	Loginforgotpassword();		
		
		}
}
