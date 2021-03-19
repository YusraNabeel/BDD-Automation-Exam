package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FirstPage {
	WebDriver driver;

	public FirstPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement Skycolor;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement Skycolorshows;

	
	 @FindBy(how = How.XPATH, using ="//button[contains(text(),'Set White Background')]")
	 WebElement Whitecolor;
	 

	public void ClickOnSkyblueColor() {
		Skycolor.click();
	}

	public String showColorChangeButton() {
		Skycolorshows.isDisplayed();
		
		String text = Skycolorshows.getText(); 
		System.out.println(text); 
		 return text;
		 
		}
	
	public void WhiteColorbuttondispladed() {
		Whitecolor.isDisplayed();
		;
		}
	public String ClickOnWhiteColor() {
		Whitecolor.click();
		String text2=Whitecolor.getText();
		System.out.println(text2);
		return text2;
	}
	
	
	

}
