import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		// Invoking Browser
		System.setProperty("webdriver.chrome.driver","/home/sakshi/Downloads/chromedriver/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.shutterstock.com/");
		System.out.println(driver.getTitle());
	}

}
