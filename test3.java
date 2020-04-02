package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://openweathermap.org/");
		System.out.println("enter city name");
		driver.findElement(By.xpath("//input[@placeholder='Your city name']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//button[@class='btn btn-orange']")).click();
		System.out.println("show results weather for bangalore");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"forecast_list_ul\"]/table/tbody/tr/td[2]")).getText());
		driver.close();

	}

}
