package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage 
{
	WebDriver driver;
  @FindBy(xpath="//tbody/tr[2]/td[2]/input[1]")
  WebElement uName;
  @FindBy(xpath="//tbody/tr[3]/td[2]/input[1]")
  WebElement pWrd;
  
  
  public void validateFields()
  {
	  int ptr1=pWrd.getRect().getDimension().getHeight();
	  int ptr2=pWrd.getRect().getDimension().getWidth();
	  int str1=uName.getRect().getDimension().getHeight();
	  int str2=uName.getRect().getDimension().getWidth();
	  
	 if(str1==ptr1)
		 System.out.println("Height Matched");
	 else
		 System.out.println("Height does't Matched");
	 if(str2==ptr2)
		 System.out.println("width Matched");
	 else
		 System.out.println("width does't Matched");
		 
  }
  public TestPage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  
}
