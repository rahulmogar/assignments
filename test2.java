package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://openweathermap.org/");
		System.out.println("enter wrong city name");
		driver.findElement(By.xpath("//input[@placeholder='Your city name']")).sendKeys("wrongCity");
		driver.findElement(By.xpath("//button[@class='btn btn-orange']")).click();
		System.out.println("Is the output text- Not found");
		String text = driver.findElement(By.xpath("//*[@id=\"forecast_list_ul\"]/div/text()")).getText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Not found"));// should run using TestNG
		// Assert.assertEquals(text,"Not found");
		driver.close();
	}

	}


