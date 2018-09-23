package com.learn.testing.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EndToEndAuto {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Training\\selenium\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

/*
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_Training\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		*/
		
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();


		Actions action = new Actions(driver);
		Thread.sleep(100);
		action.moveToElement(driver.findElement(By.xpath("//li[span[text()='Electronics']]"))).build().perform();
		Thread.sleep(1000);
		action.click(driver.findElement(By.xpath("//a[text()='Samsung']"))).build().perform();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='required-tracking']//a[@title='Samsung Galaxy J2 2018 (Black, 16 GB)']")).click();
		//driver.findElement(By.xpath(""))
		driver.quit();
	}
}

