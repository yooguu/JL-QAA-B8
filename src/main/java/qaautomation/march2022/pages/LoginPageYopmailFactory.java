package qaautomation.march2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageYopmailFactory extends BasePage {
	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;
	
	@FindBy(xpath = "//button[@title='Check Inbox @yopmail.com']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//tbody//tr[@valign='top']//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//p[1]//strong[1]//span[1]")
	private WebElement switchIframe;

	public LoginPageYopmailFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public void inputUsername(String user) {
		login.sendKeys(user);
	}
	
	public void clickLoginButton() {
		loginBtn.click();;
	}
	
	public String getBannerText() {
		return switchIframe.getText();
	}

}
