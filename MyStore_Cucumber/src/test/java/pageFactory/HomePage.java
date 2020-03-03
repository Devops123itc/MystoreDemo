package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//a[@class='login']")
	public WebElement sign_in;
	
	public void clickOnSignin() {
		sign_in.click();
	}
}
