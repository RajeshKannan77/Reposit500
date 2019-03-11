package Infy.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Desktop\\workspace\\JavaSelenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		String title = driver.getTitle();

		String url = driver.getCurrentUrl();

		System.out.println(url);

		System.out.println(title);

		driver.manage().window().maximize();

		// Thread.sleep(2000);

		synchronized (driver) {
			driver.wait(5000);
		}
		driver.close();
	}
}
