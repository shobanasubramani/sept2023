package salesforceloginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AccountSf extends Basepagesf
{

	
		public static void accountCreate() throws InterruptedException
		{
			System.out.println("******accountCreate automation script started***********");
			String expected="Account: Shobana ~ Salesforce - Developer Edition";
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
			WebElement accnt=driver.findElement(By.xpath("//*[text()='Accounts']"));
		    Actions act = new Actions(driver);
			act.moveToElement(accnt).perform();
			act.click().build().perform();
			Thread.sleep(2000);
			
			WebElement newButton=driver.findElement(By.name("new"));
			newButton.click();
			System.out.println("newbutton is clicked");
			
			
			Thread.sleep(2000);
			WebElement accntName=driver.findElement(By.id("acc2"));
			
			Actions actionName = new Actions(driver);
			actionName.moveToElement(accntName).perform();
			actionName.click().build().perform();
			Thread.sleep(2000);
			actionName.sendKeys(accntName, "Shobana").perform();
			System.out.println("Shobana is entered in name");
			
			Thread.sleep(5000);

			WebElement typeButton=driver.findElement(By.id("acc6"));
			
			Actions actionType = new Actions(driver);
			actionType.moveToElement(typeButton).perform();
			actionType.click().build().perform();
			
			
			Select typebutt = new Select(driver.findElement(By.id("acc6")));
			System.out.println("type button is found");
			
			Actions acttype=new Actions(driver);
			acttype.scrollToElement(typeButton).perform();
			acttype.click().build().perform();
			typebutt.selectByVisibleText("Technology Partner");
			System.out.println("Tecnology partner selected");
			
			
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			
			Thread.sleep(2000);
			WebElement Customerpri=driver.findElement(By.id("00NHs00000O771E"));
			Actions actcust = new Actions(driver);
			actcust.moveToElement(Customerpri).perform();
			actcust.click().build().perform();
			
			
			Select custPributt = new Select(driver.findElement(By.id("00NHs00000O771E")));
			custPributt.selectByVisibleText("High");
			System.out.println("High priority selected");
			
			
			
			Thread.sleep(2000);
			WebElement SaveButton=driver.findElement(By.name("save"));
			SaveButton.click();
			
			String winHandleBefore = driver.getWindowHandle();
			
			for(String winHandle : driver.getWindowHandles())
			{
			    driver.switchTo().window(winHandle);
			}
			
			Thread.sleep(2000);
			String actual=driver.getTitle();
			System.out.println(actual);
			
			if(actual.equals(expected))
			{
				System.out.println("Test passed");
			}else 
				System.out.println("Test failed");
			
			driver.close();
			

		}
		
		
		
		
		
		
		

		public static void accountCreateNewView() throws InterruptedException
		{
			System.out.println("******accountCreateNewView automation script started***********");
			String expected="Accounts ~ Salesforce - Developer Edition";
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
			WebElement accnt=driver.findElement(By.xpath("//*[text()='Accounts']"));
		    Actions act = new Actions(driver);
			act.moveToElement(accnt).perform();
			act.click().build().perform();
			Thread.sleep(2000);
			
			WebElement createnewviewbutt=driver.findElement(By.xpath("//*[text()='Create New View']"));
			createnewviewbutt.click();
			
			WebElement viewNameButton=driver.findElement(By.id("fname"));
			viewNameButton.click();
			viewNameButton.sendKeys("Sanath");
			WebElement viewUniqueNameButton=driver.findElement(By.id("fname"));
			viewUniqueNameButton.click();
			viewUniqueNameButton.sendKeys("sana");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)", "");
			WebElement SaveButton=driver.findElement(By.name("save"));
			SaveButton.click();
			
			String winHandleBefore = driver.getWindowHandle();
			
			for(String winHandle : driver.getWindowHandles())
			{
			    driver.switchTo().window(winHandle);
			}
			
			Thread.sleep(2000);
			String actual=driver.getTitle();
			System.out.println(actual);
			
			if(actual.equalsIgnoreCase(expected))
			{
				System.out.println("Test passed");
			}else 
				System.out.println("Test failed");
			
			driver.close();
			}
		
		public static void accountViewButton() throws InterruptedException
		{
			System.out.println("******accountViewButton automation script started***********");
			String expected="Accounts ~ Salesforce - Developer Edition";
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
			WebElement accnt=driver.findElement(By.xpath("//*[text()='Accounts']"));
		    Actions act = new Actions(driver);
			act.moveToElement(accnt).perform();
			act.click().build().perform();
			Thread.sleep(2000);
			
			
			
			
			WebElement editButton=driver.findElement(By.xpath("//*[text()='Edit']"));
			editButton.click();
			WebElement viewNameButton=driver.findElement(By.id("fname"));
			viewNameButton.click();
			viewNameButton.sendKeys("Sanathtest1");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)", "");
			WebElement SaveButton=driver.findElement(By.name("save"));
			SaveButton.click();
           
			String winHandleBefore = driver.getWindowHandle();
			
			for(String winHandle : driver.getWindowHandles())
			{
			    driver.switchTo().window(winHandle);
			}
			
			Thread.sleep(2000);
			String actual=driver.getTitle();
			System.out.println(actual);
			
			if(actual.equalsIgnoreCase(expected))
			{
				System.out.println("Test passed");
			}else 
				System.out.println("Test failed");
			
			driver.close();
			}
		   
			
			
			
	
		
		
		
		public static void main(String[] args) throws InterruptedException
	{
		
		//accountCreate();
		//accountCreateNewView();
		accountViewButton();
		WebElement viewButton=driver.findElement(By.id("00BHs00000J5AxU_listSelect"));
		viewButton.click();
		Select viewbutton = new Select(driver.findElement(By.id("00NHs00000O771E")));
		viewbutton.selectByVisibleText("");
		
		
	}

}
