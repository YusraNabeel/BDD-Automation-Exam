package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.FirstPage;
import Util.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {

	WebDriver driver;
	FirstPage firstpage;

	@Before
	public void beforerun() {
		driver = BrowserFactory.init();
		firstpage = PageFactory.initElements(driver, FirstPage.class);
	}

	@Given("^User on the Techfios framework page$")
	public void User_on_the_Techfios_framework_page() throws InterruptedException {
		driver.get("https://techfios.com/test/101/");
		Thread.sleep(3000);
	}

	@Given("^Set SkyBlue Background button exists$")
	public void Set_SkyBlue_Background_button_exists() {

	}

	@When("^I click on the button$")
	public void I_click_on_the_button() {
		System.out.println("I click on the button");
		firstpage.ClickOnSkyblueColor();
	}

	@Then("^The background color will change to sky blue$")
	public void The_background_color_will_change_to_sky_blue() {
		System.out.println("The background color will change to sky blue");
		Assert.assertEquals("Set SkyBlue Background", firstpage.showColorChangeButton());
	}

	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() throws Throwable {
		firstpage.WhiteColorbuttondispladed();

	}

	@When("^I click on the button;$")
	public void i_click_on_the_white_button() throws Throwable {
		firstpage.ClickOnWhiteColor();

	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		Assert.assertEquals("Set White Background", firstpage.ClickOnWhiteColor());
	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
