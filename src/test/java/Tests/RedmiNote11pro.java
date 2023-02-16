package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedmiNote11pro {

	public static void main(String[] args) {

		String name = "Amazon.com";
		for (int i = 0; i < 20; i++) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(
					"https://www.amazon.in/Redmi-Stealth-Additional-Exchange-Included/dp/B09T39K9YL/ref=sr_1_1?crid=3SXKW5J4NS6YZ&keywords=redmi+note+11+pro+plus+5g&qid=1674495016&sprefix=redmi+note+11%2Caps%2C278&sr=8-1");
			driver.close();
		}

	}

}
