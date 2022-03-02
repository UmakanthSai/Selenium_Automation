package sec5_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class LoginPagePractise {

	static String url = "https://www.rahulshettyacademy.com/loginpagePractise/";
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\c.umakanthsai\\Documents\\Projects\\Selenium_maven\\Selenium_Automation\\web_drivers\\chrome_97\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get(url);
		obj.manage().window().maximize();
		obj.findElement(By.cssSelector("input#username")).sendKeys("UmakanthSai");
		obj.findElement(By.cssSelector("input#password")).sendKeys("Uk@97");
		Assert.assertEquals(true, obj.findElement(By.xpath("//label[@class='customradio'][2]/span[2]")).isEnabled());
		WebElement list = obj.findElement(By.cssSelector("select.form-control"));
		Select sel = new Select(list);
		System.out.println(sel.getAllSelectedOptions().toString());
		
		
		//obj.quit();
		

	}
	
	

}
