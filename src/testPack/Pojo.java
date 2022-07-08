package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo
{
		
	public static void OpenChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	
	}
}
