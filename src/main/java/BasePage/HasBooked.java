package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HasBooked {
	WebDriver driver1;
	BookingTct fields;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\PerfLogs\\chromedriver_win32\\chromedriver.exe");
		driver1=new ChromeDriver();
		driver1.get("http://demo.guru99.com/test/newtours");
		fields=new BookingTct(driver1);
	}
  @Test
	public void isSame()
	{
	fields.selectOne();
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver1.quit();
	}

}
