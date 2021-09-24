package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class validateGmail {
	WebDriver driver1;
	 TermsPage page;
	  @BeforeMethod
		public void setUp()
		{
			System.setProperty("webdriver.chrome.driver","C:\\PerfLogs\\chromedriver_win32\\chromedriver.exe");
			driver1=new ChromeDriver();
			driver1.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
			page=new TermsPage(driver1);
		}
	  @Test
		public void isSame()
		{
			page.clickOnTerms();
			page.clickOnPrivacy();
			
		}
		@AfterMethod
		public void tearDown()
		{
			driver1.quit();
		}

}
