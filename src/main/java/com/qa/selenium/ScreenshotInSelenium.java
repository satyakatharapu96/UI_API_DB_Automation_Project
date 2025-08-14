package com.qa.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenshotInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // it is called dynamic poly/runtime//top casting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // imp
		// explicitly wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/");

		// take screenshot--- full page
		try {
			WebElement element = driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']"));
			File specific = element.getScreenshotAs(OutputType.FILE);

//			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(specific, new File(System.getProperty("user.dir") + "//Screenshots//myscreenshotforspecifi.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
