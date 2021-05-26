package org.functional;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void getLaunch(String url) {
		try {

			driver.get(url);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void enterText(WebElement element, String data) {

		try {
			if (element.isEnabled()) {
				element.sendKeys(data);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void buttonCLick(WebElement element) {
		try {
			element.click();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void selectByVissibleText(WebElement element, String data) {

		try {
			Select select = new Select(element);
			select.selectByVisibleText(data);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void moveToElement(WebElement target) {
		Actions ac = new Actions(driver);
		ac.moveToElement(target).perform();

	}

	public String getTextFromPage(WebElement element) {
		String text = element.getText();

		return text;

	}

	public String getPrtWinId() {
		String prtWindow = driver.getWindowHandle();

		return prtWindow;

	}

	public Set<String> getAllWinId() {
		Set<String> windowHandles = driver.getWindowHandles();

		return windowHandles;

	}

	public void switchToChildWindow() {
		Set<String> allWinId = getAllWinId();
		for (String string : allWinId) {
			if (!getPrtWinId().equals(string)) {
				driver.switchTo().window(string);
			}
		}

	}
}
