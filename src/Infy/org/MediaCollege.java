package Infy.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MediaCollege extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		BaseClass base = new BaseClass();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Desktop\\workspace\\JavaSelenium\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		base.launchBrowser("https://www.mediacollege.com/internet/samples/html/country-list.html");

		base.maxWindow();

		WebElement countrySelect = driver.findElement(By.xpath("//select[@name='country']"));

		base.elementHighlight(countrySelect);

		Select s = new Select(countrySelect);

		List<WebElement> country = s.getOptions();

		System.out.println(country.size());

		Thread.sleep(5000);

		for (int i = 0; i < country.size(); i++) {

			s.selectByIndex(i);
		}
		//
		// String name = country.get(i).getText();
		//
		// if (name.equals("Albania") || name.equals("India")) {
		//
		// s.selectByVisibleText(name);
		//
		// System.out.println(name);
		// }
		//
		// }

		// base.selectionIndex(countrySelect, 2);

		// base.selectionValue(countrySelect, "India");

		// base.selectionText(countrySelect, "India");

		// System.out.println(countrySelect.getSize());

		Thread.sleep(5000);

		base.closeBrowser();

	}
}
