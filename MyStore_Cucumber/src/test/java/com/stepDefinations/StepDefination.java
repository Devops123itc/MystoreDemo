package com.stepDefinations;

import org.openqa.selenium.support.PageFactory;

import com.testbase.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.LoginPage;
import pageFactory.MyAccountPage;
import pageFactory.RegisterPage;

public class StepDefination extends TestBase {
	@Before
	public void setup() throws Throwable {
		openBrowser();
	}

	@After
	public void tearDown() {
		closeBrowser();
	}

	@Given("^user is in the register page$")
    public void user_is_in_the_register_page(){
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);

		hp.clickOnSignin();
		lp.create_an_account();
    }

    @When("^user enter following details$")
    public void user_enter_following_details(){
    	RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.enter_PersonalInfo();
		rp.enter_YourAddress();
    }

    @Then("^successful registration should happen$")
    public void successful_registration_should_happen(){
    	MyAccountPage map = PageFactory.initElements(driver, MyAccountPage.class);
		map.verify_welcomeMsg();
    }

    @And("^clicks on register$")
    public void clicks_on_register(){
    	RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.clickOnRegister();
    }
}
