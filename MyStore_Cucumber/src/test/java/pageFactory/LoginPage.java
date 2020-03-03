package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	public WebElement email_create;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	public WebElement create_an_acc;
	
	public void create_an_account() {
		email_create.sendKeys("abc.xyz.131@gmail.com");
		create_an_acc.click();
	}
}
