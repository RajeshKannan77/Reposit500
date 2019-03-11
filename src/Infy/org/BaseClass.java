package Infy.org;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	static WebDriver driver;

	public void launchBrowser(String a) {

		driver.get(a);

	}

	public void setText(WebElement element, String text) {

		element.sendKeys(text);
	}

	public void clickBtn(WebElement element) {

		element.click();
	}

	public void selectionIndex(WebElement ele, int a) {

		Select s = new Select(ele);
		s.selectByIndex(a);

	}

	public void selectionValue(WebElement ele, String a) {

		Select s = new Select(ele);
		s.selectByValue(a);
	}

	public void selectionText(WebElement ele, String a) {

		Select s = new Select(ele);
		s.selectByVisibleText(a);
	}

	public void mouseAction(WebElement ele) {

		new Actions(driver).moveToElement(ele).build().perform();
	}

	public void attributeValue(WebElement element, String text) {

		String a = element.getAttribute(text);
		System.out.println(a);

	}

	public void textValue(WebElement element) {

		String a = element.getText();
		System.out.println(a);
	}

	public void elementHighlight(WebElement ele) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
	}

	public void closeBrowser() {

		driver.close();
	}

	public void maxWindow() {

		driver.manage().window().maximize();
	}
}
