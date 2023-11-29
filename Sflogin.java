package testng.aututwo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Sflogin {
	
	
	@Test(priority=1)
	public static void Loginhomepage()throws InterruptedException
		{
	WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			Thread.sleep(2000);
			WebElement UsernameEle=driver.findElement(By.id("username"));
			UsernameEle.sendKeys("shoba@sf.com");
			WebElement passwordEle=driver.findElement(By.id("password"));
			passwordEle.sendKeys("salesforce123");
			Thread.sleep(5000);
			driver.findElement(By.id("Login")).click();
			driver.close();
		}
	
	
	
	
	
	@Test(priority=3)
		public static void Loginnopassword()throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			Thread.sleep(2000);
			WebElement UsernameEle=driver.findElement(By.id("username"));
			UsernameEle.clear();
			UsernameEle.sendKeys("shoba@sf.com");
			
			Thread.sleep(5000);
			driver.findElement(By.id("Login")).click();
			driver.close();
		}

	
	
	
	@Test(priority=2)
		public static void Loginremeberme()throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			Thread.sleep(2000);
			WebElement UsernameEle=driver.findElement(By.id("username"));
			UsernameEle.clear();
			UsernameEle.sendKeys("shoba@sf.com");
			WebElement passwordEle=driver.findElement(By.id("password"));
			passwordEle.sendKeys("salesforce123");
			Thread.sleep(5000);
			driver.findElement(By.id("rememberUn")).click();
			driver.findElement(By.id("Login")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("userNavLabel")).click();
			Actions a= new Actions(driver);
			WebElement mainmenu=driver.findElement(By.id("userNavLabel"));
			a.moveToElement(mainmenu).build().perform();
			WebElement Sub = driver.findElement(By.linkText("Logout"));    
			a.moveToElement(Sub).click().perform();
			Thread.sleep(5000);
			WebElement passwordEle1=driver.findElement(By.id("password"));
			passwordEle1.sendKeys("salesforce123");
			Thread.sleep(5000);
			driver.findElement(By.id("Login")).click();
			driver.close();
			}

		public static void Loginwronguserpass() throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			Thread.sleep(2000);
			WebElement UsernameEle=driver.findElement(By.id("username"));
			UsernameEle.sendKeys("shoba@sd.com");
			WebElement passwordEle=driver.findElement(By.id("password"));
			passwordEle.sendKeys("salesforce12");
			Thread.sleep(5000);
			driver.findElement(By.id("Login")).click();	
			driver.close();
		}
		
		
		
		
		@Test(priority=4)
		public static void Loginforgotpassword() throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			Thread.sleep(2000);
			WebElement forgotpasswrd=driver.findElement(By.id("forgot_password_link"));
			forgotpasswrd.click();
			driver.close();
			
			}
		

		

	}


