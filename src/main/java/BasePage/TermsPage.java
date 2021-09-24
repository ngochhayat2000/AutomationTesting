package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermsPage {
	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Terms')]")
     WebElement term;
	@FindBy(xpath="//a[contains(text(),'Privacy')]")
	WebElement privacy;
	public void clickOnTerms()
	{
		term.click();
		System.out.println(term.getText());
		
	}
	public void clickOnPrivacy()
	{
		privacy.click();
		System.out.println(privacy.getText());
	}
	public TermsPage(WebDriver driver)
	{
		 this.driver=driver;
		  PageFactory.initElements(driver, this);
	}
}

