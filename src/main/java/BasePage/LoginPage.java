package BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass
{
	
@FindBy(id="email")
WebElement username;
@FindBy(id="pass")
WebElement password;
@FindBy(name="login")
WebElement loginBtn;
@FindBy(xpath="//button[contains(text(),'Yes, Continue')]")
WebElement logo;
public LoginPage()
{
	PageFactory.initElements(driver, this);
}
public boolean validateLogo()
{
	logo.isDisplayed();
	return true;
}

public HomePage login(String uname,String pswd)
{
	username.sendKeys(uname);
	password.sendKeys(pswd);
	loginBtn.click();
	return new HomePage();
	
 }


}

