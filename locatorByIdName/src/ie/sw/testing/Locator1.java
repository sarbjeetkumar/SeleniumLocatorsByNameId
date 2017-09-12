package ie.sw.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:/Users/sarab singh/Desktop/myCourses/SeleniumTesting/seleniumDriver/geckodriver.exe");
		
		WebDriver driver =  new FirefoxDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("sarabjeetjatt.com");
		driver.findElement(By.name("pass")).sendKeys("sarabjeetjatt@");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	}

}
