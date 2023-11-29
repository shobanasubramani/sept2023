package salesforceloginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class usermenudropsf  extends Basepagesf{

	public static void usermenu()throws InterruptedException
	{
		System.out.println("******usermenu automation script started***********");
		String expected="User menu for Shobana Subramani";
		launchBrowser("firefox");
		goToUrl("https://login.salesforce.com/");
		maximiseBrowser();
		WebElement UserNameEle=driver.findElement(By.id("username"));
		enterText(UserNameEle,"shoba@sf.com","username textbox");
		WebElement passwordEle=driver.findElement(By.id("password"));
		enterText(passwordEle,"salesforce123","password textbox");
		
		waitForVisibility(passwordEle,10,"passwordtextbox");
		driver.findElement(By.id("Login")).click();
		System.out.println("login clicked");
		
		Thread.sleep(2000);
		
		WebElement Username=driver.findElement(By.id("userNavLabel"));
		waitForVisibility(Username,15,"usernametextbox");
		Username.click();
		String actual=driver.getTitle();
		if(actual.equals(expected))
		{
			System.out.println("test passed");
		}else
		{
			System.out.println("test passed");
		}
		closeBrowser();
		
		}
	
	
	public static void userLogOut()throws InterruptedException
	{
		System.out.println("******userLogOut automation script started***********");
		String expected="https://sfcom-69a-dev-ed.develop.my.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom";
		launchBrowser("firefox");
		goToUrl("https://login.salesforce.com/");
		maximiseBrowser();
		WebElement UserNameEle=driver.findElement(By.id("username"));
		enterText(UserNameEle,"shoba@sf.com","username textbox");
		WebElement passwordEle=driver.findElement(By.id("password"));
		enterText(passwordEle,"salesforce123","password textbox");
		
		waitForVisibility(passwordEle,10,"passwordtextbox");
		driver.findElement(By.id("Login")).click();
		System.out.println("login clicked");
		
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		WebElement Username=driver.findElement(By.id("userNavLabel"));
		action.moveToElement(Username).perform();
		waitForVisibility(Username,15,"usernametextbox");
		action.click().build().perform();
		Thread.sleep(2000);
        WebElement log=driver.findElement(By.xpath("//*[text()='Logout']"));
		
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(log).perform();
		action.click().build().perform();
		String actual=driver.getCurrentUrl();
		System.out.println(actual);
		if(actual.equals(expected))
		{
			System.out.println("LogoutTest passed");
		}else 
			System.out.println("LogoutTest failed");
		
		driver.close();
	}
	
	
	
	
	
	public static void usermenudevconsole()throws InterruptedException
	{
		System.out.println("******usermenudevconsole automation script started***********");
		String expected="https://sfcom-69a-dev-ed.develop.my.salesforce.com/_ui/common/apex/debug/ApexCSIPage";
		launchBrowser("firefox");
		goToUrl("https://login.salesforce.com/");
		maximiseBrowser();
		WebElement UserNameEle=driver.findElement(By.id("username"));
		enterText(UserNameEle,"shoba@sf.com","username textbox");
		WebElement passwordEle=driver.findElement(By.id("password"));
		enterText(passwordEle,"salesforce123","password textbox");
		
		waitForVisibility(passwordEle,10,"passwordtextbox");
		driver.findElement(By.id("Login")).click();
		System.out.println("login clicked");
		
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		WebElement Username=driver.findElement(By.id("userNavLabel"));
		action.moveToElement(Username).perform();
		waitForVisibility(Username,15,"usernametextbox");
		action.click().build().perform();
		Thread.sleep(2000);
		WebElement dev=driver.findElement(By.xpath("//*[text()='Developer Console']"));
		
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(dev).perform();
		action.click().build().perform();
		
		String winHandleBefore = driver.getWindowHandle();
		
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
		
		Thread.sleep(2000);
		String actual=driver.getCurrentUrl();
		
		if(actual.equals(expected))
		{
			System.out.println("Test passed");
		}else 
			System.out.println("Test failed");
		
		driver.close();

		
		driver.switchTo().window(winHandleBefore);

		driver.close();
		System.out.println("closed");
		
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		//usermenu();
		//usermenudevconsole();
		userLogOut();
	}
}