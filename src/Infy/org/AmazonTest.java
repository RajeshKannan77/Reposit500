package Infy.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Desktop\\workspace\\JavaSelenium\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		// if (element.isDisplayed()) {
		//
		// System.out.println("element is displayed");
		// } else {
		//
		// System.out.println("element is not displayed");
		// }

		BaseClass base = new BaseClass();

		// base.attributeValue(element, "value");

		// System.out.println(element.getText());

		// base.setText(element, "mobile");
		//
		// element.sendKeys(Keys.TAB);
		//
		// Thread.sleep(5000);
		//
		// base.attributeValue(element, "value");

		WebElement categories = driver.findElement(By.xpath("//span[@class='nav-icon nav-arrow'][1]"));

		// Actions acc = new Actions(driver);
		//
		// Actions a = acc.moveToElement(category);
		//
		// a.build().perform();
		//
		// Thread.sleep(5000);

		new Actions(driver).moveToElement(categories).build().perform();

		Thread.sleep(5000);

		WebElement category1 = driver.findElement(By.xpath("(//span[text()='Echo & Alexa'])[1]"));
		
		System.out.println(category1.getText());
		
		// System.out.println(element.getText());

		driver.close();

	}
}
