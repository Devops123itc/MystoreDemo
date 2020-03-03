package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	@FindBy(xpath="//input[@id='id_gender1']")
	public WebElement mr;
	@FindBy(xpath="//input[@id='id_gender2']")
	public WebElement mrs;
	@FindBy(xpath="//input[@id='customer_firstname']")
	public WebElement cust_fname;
	@FindBy(xpath="//input[@id='customer_lastname']")
	public WebElement cust_lname;
	@FindBy(xpath="//input[@id='passwd']")
	public WebElement pwd;
	@FindBy(xpath="//select[@id='days']")
	public WebElement dob_days;
	@FindBy(xpath="//select[@id='months']")
	public WebElement dob_months;
	@FindBy(xpath="//select[@id='years']")
	public WebElement dob_years;
	@FindBy(xpath="//input[@id='firstname']")
	public WebElement fname;
	@FindBy(xpath="//input[@id='lastname']")
	public WebElement lname;
	@FindBy(xpath="//input[@id='address1']")
	public WebElement address;
	@FindBy(xpath="//input[@id='city']")
	public WebElement city;
	@FindBy(xpath="//select[@id='id_state']")
	public WebElement state;
	@FindBy(xpath="//input[@id='postcode']")
	public WebElement postcode;
	@FindBy(xpath="//select[@id='id_country']")
	public WebElement country;
	@FindBy(xpath="//input[@id='phone_mobile']")
	public WebElement phone;
	@FindBy(xpath="//input[@id='alias']")
	public WebElement alias_address;
	@FindBy(xpath="//button[@id='submitAccount']")
	public WebElement register;
	
	public void enter_PersonalInfo() {
		mr.click();
		cust_fname.sendKeys("CFname");
		cust_lname.sendKeys("CLname");
		pwd.sendKeys("Login@123");
		Select days = new Select(dob_days);
		days.selectByIndex(21);
		Select months = new Select(dob_months);
		months.selectByIndex(6);
		Select years = new Select(dob_years);
		years.selectByValue("1995");	
	}
	public void enter_YourAddress() {
		address.sendKeys("Banaswadi");
		city.sendKeys("Bangalore");
		Select st = new Select(state);
		st.selectByVisibleText("Arizona");
		postcode.sendKeys("12345");
		Select c = new Select(country);
		c.selectByVisibleText("United States");
		phone.sendKeys("1234567890");
		alias_address.sendKeys("abcd");		
	}
	public void clickOnRegister() {
		register.click();
	}
}
