package com.qa.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasicsInSelenium {
	public static void main(String[] args) throws InterruptedException {
		// 1.WebDriverCommands
		// 2,WebDriverMethods
		// Waits
		// navigation Methods

		WebDriver driver = new ChromeDriver(); // it is called dynamic poly/runtime//top casting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // imp
		// explicitly wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
//		if (title.equals("Google")) {
//			System.out.println(" both are same");
//		} else {
//			System.out.println("both are not same");
		Assert.assertEquals(title, "Google", "Title is should not be same");
		Thread.sleep(3000);
		String curl = driver.getCurrentUrl();
		System.out.println(curl);

		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);

		Set<String> windows = driver.getWindowHandles(); // handle mul windows
		for (String wind : windows) {
			driver.switchTo().window(wind);
//			driver.navigate().to("https://www.programiz.com/java-programming/online-compiler/");
			String id = driver.getWindowHandle();
			System.out.println(id);
		}
//xpath--- xml path language---1.abst---/,root element of dom,rev---//,specif point/middle of the dom
		// syntax---> //tag[@attribute='attribute value']

//		driver.findElement(By.linkText("Gmail")).click();
		WebElement element = driver.findElement(By.xpath("//a[text()='Gmail']"));

//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Gmail']")));
//		element.click();

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
		

//		String pagesrc=driver.getPageSource();
//		System.out.println(pagesrc);
		driver.quit();
//
//		}

	}

}
