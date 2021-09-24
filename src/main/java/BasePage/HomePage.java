package BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage
{
 @FindBy(xpath="//button[contains(text(),'Yes, Continue')]")
 WebElement adminTab;
 public SystemUserPage clickOnAdminTab()
 {
	 adminTab.click();
	return new SystemUserPage();
 }
}
