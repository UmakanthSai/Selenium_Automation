package sec5_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class LoginPagePractise {

	static String url = "https://www.rahulshettyacademy.com/loginpagePractise/";
	static String user;
	static String password;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.umakanthsai\\Documents\\Projects\\Selenium_maven\\Selenium_Automation\\web_drivers\\chrome_97\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		user = driver.findElement(By.xpath("//p[@class='text-center text-white']/b[1]/i")).getText();
		password = driver.findElement(By.xpath("//p[@class='text-center text-white']/b[2]/i")).getText();
		
		driver.findElement(By.cssSelector("input#username")).sendKeys(user);
		driver.findElement(By.cssSelector("input#password")).sendKeys(password);
		Assert.assertEquals(true, driver.findElement(By.xpath("//label[@class='customradio'][2]/span[2]")).isEnabled());
		WebElement list = driver.findElement(By.cssSelector("select.form-control"));
		Select sel = new Select(list);
		Assert.assertEquals(sel.getFirstSelectedOption().getText(), "Student");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		
		Thread.sleep(10000);
		driver.quit();
	
		

	}
	
	

}
