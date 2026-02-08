package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	
     WebDriver driver;
	
	public NewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement newCustlink;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement custname;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement DOB;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement addr;
	
	public void clickNewCustomer()
	{
		newCustlink.click();
	}
	
	
	public void enterCustname(String Customername)
	{
		custname.sendKeys(Customername);
	}
	
	public void selectGender()
	{
		gender.click();
	}
	
	public void addDOB(String dateOfBirth)
	{
		DOB.sendKeys(dateOfBirth);
	}
	
	public void enterAddress(String address)
	{
		addr.sendKeys(address);
	}
	
	
	

}
