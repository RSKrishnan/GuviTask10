package org.CalendarSample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		//navigate() method is used for loading the URL
		driver.navigate().to("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switched to the frame based on the index
		driver.switchTo().frame(0);
		//clicked on the datepicker
		driver.findElement(By.cssSelector("input#datepicker")).click();
		//selected on next button present in the calendar
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//selected date '22' as per the requested and stored in WebElement date
		WebElement date = driver.findElement(By.xpath("//a[text()='22']"));
		date.click();
		//getText() method is used for getting the selected date
		System.out.println(date.getText());
		//close() method is used to close the current browser
		driver.close();
		//quit() method is used to close all the opened browser
		driver.quit();
		
	}

}
