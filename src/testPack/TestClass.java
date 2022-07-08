package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.LogIn;

public class TestClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	
		System.out.println("Validate Login Functionality");
	
		
	
		System.out.println("Validate HomePage");
//		HomePage home = new HomePage(driver);
//		home.ValidateAdminTab();
//		home.ValidatePIMTab();
//		home.ValidateTimeTab();

	
	
	}
	
	
	
	
	
	
}
