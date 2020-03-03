package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccountPage {
	@FindBy(xpath = "//div[@id='center_column']/p")
	public WebElement welcome_msg;
	
	@FindBy(xpath="//input[@id='search_query_top']")
	public WebElement search_box;

	public void verify_welcomeMsg() {
		String txt = welcome_msg.getText();
		System.out.println(txt);
		Assert.assertEquals(txt,"Welcome to your account. Here you can manage all of your personal information and orders.");
		//search_box.sendKeys("Google");
	}
}
