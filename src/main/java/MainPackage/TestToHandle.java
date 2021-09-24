package MainPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestToHandle
{
	WebDriver driver1;
	HandleMultipleWindows windows;
	  @BeforeMethod
		public void setUp()
		{
			System.setProperty("webdriver.chrome.driver","C:\\PerfLogs\\chromedriver_win32\\chromedriver.exe");
			driver1=new ChromeDriver();
			driver1.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
			windows=new HandleMultipleWindows(driver1);
		}
	  @Test
		public void isOk()
		{
			windows.getWindows();
			
		}
		@AfterMethod
		public void tearDown()
		{
			driver1.quit();
		}
}
