package org.guviSignup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GuviSignUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.guvi.in/");
		driver.findElement(By.xpath("//div/a[text()='Sign up']")).click();
		// windows is maximize
		driver.manage().window().maximize();
		// implicitlyWait() used
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("input#name")).sendKeys("Krishna");
		driver.findElement(By.cssSelector("input#email")).sendKeys("ramak8148665677878@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Krishna#12345");
		driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("9876543220");
		driver.findElement(By.cssSelector("#signup-btn")).click();

		driver.findElement(By.cssSelector("a#laterBtn")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//div/h1")).getText();
		// assertEquals() method is used for verification
		Assert.assertEquals(text, "Almost Done! Check Your Inbox!");
		driver.findElement(By.xpath("//img[@alt='Guvi Logo']")).click();
		driver.findElement(By.cssSelector("a#login-btn")).click();
		driver.findElement(By.cssSelector("input#email")).sendKeys("ramakrishnan783@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Test@2211");

		driver.findElement(By.cssSelector("a#login-btn")).click();
		// getTitle() method for getting the title for verification
		Thread.sleep(5000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "GUVI | courses");
		// closing the browser
		driver.close();
	}
}
