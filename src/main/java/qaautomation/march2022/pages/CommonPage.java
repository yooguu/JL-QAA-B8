package qaautomation.march2022.pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage extends BasePage {

	public CommonPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	public void openUrl(String url) {
		driver.get().get(url);
	}

	public void openNewTab() {
		driver.get().switchTo().newWindow(WindowType.TAB);
	}

	public void openNewWindow() {
		driver.get().switchTo().newWindow(WindowType.WINDOW);
	}
	
	public void openNewFrame() {
		
	}

	public void switchWindow(int index) {
		Set<String> handles = driver.get().getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(handles);
		driver.get().switchTo().window(tabs.get(index));
	}

	public void navigateBrowserForward() {
		driver.get().navigate().forward();
	}

	public void navigateBrowserBack() {
		driver.get().navigate().back();
	}

	public void navigateBrowserRefresh() {
		driver.get().navigate().refresh();
	}

	public void runJSCommand(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript(script);
	}
}
