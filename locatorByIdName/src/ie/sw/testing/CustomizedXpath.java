package ie.sw.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizedXpath {
	
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","C:/Users/sarab singh/Desktop/myCourses/SeleniumTesting/seleniumDriver/geckodriver.exe");
		
		WebDriver driver =  new FirefoxDriver();
		
		driver.get("http://facebook.com");
		//it will work with tag name or without but good practice to use tag name 
		driver.findElement(By.xpath("//*[@name = 'email']")).sendKeys("sarabYoloYolo");
		//it will work like that 
		//driver.findElement(By.xpath("//*[@name = 'email']")).sendKeys("sarabYoloYolo");
		
		driver.close();
		
	}

}
