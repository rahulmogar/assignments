package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test1 {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://openweathermap.org/");
		System.out.println("Is navigation bar present?");
		System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']")).isDisplayed());
		System.out.println("Is Celcius icon present");
		System.out.println(driver.findElement(By.xpath("//span[@id='metric']")).isDisplayed());
		driver.close();

	}

	
}
