package qaautomation.march2022;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.march2022.pages.LoginPage;
import qaautomation.march2022.pages.LoginPageFactory;
import qaautomation.march2022.pages.LoginPageYopmailFactory;
import qaautomation.march2022.pages.ProfilePage;
import qaautomation.march2022.pages.ProfilePageFactory;

/**
 * Unit test for simple App.
 */
public class AppTestAfterPageYopmailFactory extends BaseWebYopmailTest {

	

	// karena semua extends dari BaseWebTest maka semua driver mesti menggunakan
	// driver.get()
	@Test
	public void InputAutomationTest() {
		LoginPageYopmailFactory loginPage = new LoginPageYopmailFactory(driver, explicitWait);
		String username = "automationtest";
		loginPage.inputUsername(username);
		loginPage.clickLoginButton();

		String actualText = loginPage.getBannerText();
		String expectedText = "Hi, Invygo_Automation!The monthly payment for your Hyundai Accent is due in 5 days.";
		Assert.assertTrue(actualText.contains(expectedText));
	}

}
