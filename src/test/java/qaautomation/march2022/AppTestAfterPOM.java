package qaautomation.march2022;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.march2022.pages.LoginPage;
import qaautomation.march2022.pages.ProfilePage;

/**
 * Unit test for simple App.
 */
public class AppTestAfterPOM extends BaseWebTest {

	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);

	// karena semua extends dari BaseWebTest maka semua driver mesti menggunakan
	// driver.get()
	@Test
	public void test1() {
		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = profilePage.getProfileText();

		String expectedText = "You logged into a secure area!";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void test2() {
		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = profilePage.getProfileText();

		String expectedText = "You logged into a secure area!";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void test3() {
		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = profilePage.getProfileText();

		String expectedText = "You logged into a secure area!";
		Assert.assertTrue(actualText.contains(expectedText));
	}
}
