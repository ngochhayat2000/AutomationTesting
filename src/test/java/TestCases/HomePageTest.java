package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePage.BaseClass;
import BasePage.HomePage;

public class HomePageTest extends BaseClass 
{
 HomePage homePage;
 @Test(priority=3)
 public void adminTabTest()throws InterruptedException
 {
	 homePage=loginpage.login("ngochhayat2000@gmail.com","Facebookpassword@22");
	 homePage.clickOnAdminTab();
	 Thread.sleep(2000);
	 String expectedURL="https://www.facebook.com/";
	 String actualURL=driver.getCurrentUrl();
	 Assert.assertEquals(actualURL,expectedURL);
 }
}
