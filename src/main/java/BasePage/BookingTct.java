package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingTct {

		WebDriver driver;
		
		public BookingTct(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(name = "userName")
		WebElement username;
	
		@FindBy(name = "password")
		WebElement password;
	
		@FindBy(name = "submit")
		WebElement submitButton;
		
		@FindBy(xpath = "//a[contains(text(),'Flights')]")
		WebElement flight;
		
		@FindBy(name="passCount")
		WebElement passengers;
		
		@FindBy(name="fromPort")
		WebElement departure;
		
		@FindBy(name="fromMonth")
		WebElement months;
		
		@FindBy(name="fromDay")
		WebElement days;
		
		@FindBy(name="toPort")
		WebElement port;
		
		@FindBy(name="toMonth")
		WebElement returnMonths;
		
		@FindBy(name="toDay")
		WebElement returnDays;
		
		@FindBy(name="findFlights")
		WebElement continueButton;
		
		public void selectOne()
		{
			username.sendKeys("mercury");
			password.sendKeys("mercury");
			submitButton.click();
			flight.click();
			Select s=new Select(passengers);
			s.selectByIndex(3);
			
			Select s1=new Select(departure);
			s1.selectByValue("London");
			Select s2=new Select(months);
			s2.selectByValue("2");
			Select s3=new Select(days);
			s3.selectByValue("2");
			
			Select s4=new Select(port);
			s4.selectByVisibleText("New York");
			Select s5=new Select(returnMonths);
			s5.selectByVisibleText("June");
			Select s6=new Select(returnDays);
			s6.selectByVisibleText("10");
			continueButton.click();
			
		}

	}


