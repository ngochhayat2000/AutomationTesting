package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestFields 
{
	WebDriver driver;
	  @FindBy(xpath="//tbody/tr[4]/td[2]/select[1]")
	  WebElement dName;
	  @FindBy(xpath="//tbody/tr[6]/td[2]/select[1]")
	  WebElement aName;
	  @FindBy(partialLinkText="Fligh")
	  WebElement link;
	  public void checkvalue()
	  {
		  String str1=dName.getText();
		  String str2=aName.getText();
		  System.out.println(str1);
		  System.out.println(str2);
		  if(str1==str2)
			  System.out.println("Data Matched");
		  else
			  System.out.println("Data Doesnot Matched");
	  }
	  public void getLink()
	  {
		  link.click();
	  }
	  public TestFields(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	  }
}
