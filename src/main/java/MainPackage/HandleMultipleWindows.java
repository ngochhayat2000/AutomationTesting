package MainPackage;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HandleMultipleWindows 
{
 WebDriver driver;
 public HandleMultipleWindows(WebDriver driver1)
 {
	 PageFactory.initElements(driver, this);
 }

 public void getWindows()
 {
	 String parent=driver.getWindowHandle();
	 System.out.println(parent);
	 Set<String>allWindows=driver.getWindowHandles();
	 ArrayList<String> tabs=new ArrayList<>(allWindows);
	 driver.switchTo().window(tabs.get(0));
	 driver.close();
	 driver.switchTo().window(tabs.get(1));
	 driver.close();
	 System.out.println(driver.getTitle());
 }
 
}
