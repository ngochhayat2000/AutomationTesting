package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePage.BaseClass;
import BasePage.HomePage;
import BasePage.LoginPage;

public class LoginPageTest extends BaseClass
{
	LoginPage loginPage;
	HomePage homePage;
 @Test(priority=1)
 public void verifyLogo()
 {
	 boolean flag=loginPage.validateLogo();
	 Assert.assertTrue(flag);
 }
 
 @Test(priority=2)
 public void loginTest()
 {
	homePage=loginPage.login("ngochhayat2000@gmail.com","Facebookpassword@22");
	String expectedURL="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI5ODA5NDU4LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
	String actualURL=driver.getCurrentUrl();
	 Assert.assertEquals(actualURL,expectedURL);
 }
}
