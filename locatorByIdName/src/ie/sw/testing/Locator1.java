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
		
		//comment it coz i need to click on forgot your password link
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		
		//a tag for link 
		
		//try inspect if its a link coz it could be a botton
		
		driver.findElement(By.linkText("Forgot your password ?")).click();
		
		//if the text is changing everyday you can provide the partial text as well 
		//driver.findElement(By.partialLinkText("Forgot Your")).click();
		
		
		
	}

}
