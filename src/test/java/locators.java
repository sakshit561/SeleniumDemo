import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		
				
				// Invoking Browser
				System.setProperty("webdriver.chrome.driver","/home/sakshi/Downloads/chromedriver/chromedriver");
				WebDriver driver =new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://www.shutterstock.com/");
				driver.manage().window().maximize();
				driver.findElement(By.linkText("Log in")).click();
				driver.navigate().refresh();				
				driver.findElement(By.name("username")).sendKeys("testinguser321@shutterstock.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("user@123");
				driver.findElement(By.cssSelector("button[type='submit']")).click();
				
	}

}
