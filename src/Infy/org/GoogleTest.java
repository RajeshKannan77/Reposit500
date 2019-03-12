package Infy.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		BaseClass baseClass = new BaseClass();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Desktop\\workspace\\JavaSelenium\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		baseClass.launchBrowser("https://www.google.co.in/");

		baseClass.maxWindow();

		WebElement element2 = driver.findElement(By.xpath("(//*[@class='gb_d'])[1]"));

		baseClass.elementHighlight(element2);

		Thread.sleep(5000);

		baseClass.textValue(element2);

		WebElement element = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

		baseClass.elementHighlight(element);

		baseClass.setText(element, "India");

		element.sendKeys(Keys.TAB);

		Thread.sleep(3000);

		WebElement element1 = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[1]"));

		baseClass.attributeValue(element1, "value");

		Thread.sleep(2000);

		baseClass.clickBtn(element1);
		
		System.out.println("data modified");
		
		System.out.println("code ends");

		Thread.sleep(5000);

		baseClass.closeBrowser();

	}
}
