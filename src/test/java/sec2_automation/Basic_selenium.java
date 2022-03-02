package sec2_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_selenium {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoking Rahul shetty browser
		String URL = "https://rahulshettyacademy.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.umakanthsai\\Documents\\web_drivers\\chrome_97\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		Thread.sleep(5000);
		//printing the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		//Verifying whether navigated to correct URL or not
		String current_URL = driver.getCurrentUrl();
		System.out.println(current_URL);
		current_URL.equals(URL);
		
		driver.quit();

	}

}
