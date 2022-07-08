package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackage.HomePage;
import pomPackage.LogIn;

public class TestClassWithTNG 
{
	 WebDriver driver;
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
	}
	
	@BeforeMethod
	public void Login()
	{
		LogIn login = new LogIn(driver);
		login.sendUserName();
		login.sendPassword();
		login.clickOnSigninButton();
	}
	
	@Test
	public void ValidateHomePage()
	{
		HomePage home= new HomePage(driver);
				home.validateAdminTab();
				home.validatePIMTab();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		HomePage home= new HomePage(driver);
		         home.ClickOnAvtar();
		         home.ClickOnLogout();
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
	

}
