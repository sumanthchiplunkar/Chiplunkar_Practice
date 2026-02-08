package StepDefinition14;

import org.openqa.selenium.WebDriver;

import PageFactory.LoginPage;
import PageFactory.NewCustomerPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition14 extends BaseClass {
	
	WebDriver driver=BaseClass.initializeDriver();
	LoginPage obj=new LoginPage(driver);
	NewCustomerPage obj1=new NewCustomerPage(driver);
	
	
	

@Given("user launches the Guru99 demo application")
public void user_launches_the_guru99_demo_application() {
	
	getTitle();
	
   
}

@Given("user enters the {string} in the UserID textbox")
public void user_enters_the_in_the_user_id_textbox(String user_id) {
	
	obj.enterUsername(user_id);
	
   
}

@Given("user enters the {string} in the password textbox")
public void user_enters_the_in_the_password_textbox(String password) {
	
	obj.enterPassword(password);
   
}

@When("user will click on the LOGIN button")
public void user_will_click_on_the_login_button() {
	
	obj.clickLogin();
    
}

@Then("user will be navigated to Guru99 Demo application")
public void user_will_be_navigated_to_guru99_demo_application() throws Exception {
	
	String str1=getTitle();
	System.out.println(str1);
	if(str1.contains("Guru99"))
	{
		System.out.println("Test case passed");
	}
	else
	{
		throw new Exception("Invalid page loaded");
	}
	
	
	
    
}
@Then("user clicks on new customer link")
public void user_clicks_on_new_customer_link() {
	
	obj1.clickNewCustomer();
   
}

@Then("user enters the {string} in  customer name field")
public void user_enters_the_in_customer_name_field(String cust_name) {
	
	obj1.enterCustname(cust_name);
    
}



@Then("user enters the {string} in the date of birth field")
public void user_enters_the_in_the_date_of_birth_field(String dob) {
	
	obj1.addDOB(dob);
    
}

@Then("user enters the {string} in the address field")
public void user_enters_the_in_the_address_field(String address) {
	
	obj1.enterAddress(address);
   
}


@Then("user selects the {string} in gender field")
public void user_selects_the_in_gender_field(String string) {
    // Write code here that turns the phrase above into concrete actions
   obj1.selectGender();
}
@Then("user enters the {string} in the city field")
public void user_enters_the_in_the_city_field(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("user enters the {string} in the state field")
public void user_enters_the_in_the_state_field(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("user enters the {string} in the PIN field")
public void user_enters_the_in_the_pin_field(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("user enters the {string} in the mobile field")
public void user_enters_the_in_the_mobile_field(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("user enters the {string} in the Email field")
public void user_enters_the_in_the_email_field(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("user enters the {string} in the Password field")
public void user_enters_the_in_the_password_field(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user closes the entire browser")
public void user_closes_the_entire_browser() throws InterruptedException {
    
	Thread.sleep(4000);
	closeBrowser();
}
	


	
	

}
