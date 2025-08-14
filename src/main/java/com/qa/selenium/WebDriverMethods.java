package com.qa.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverMethods {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // imp
		// explicitly wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		boolean b = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).isEnabled();
		System.out.println("the element is enaled:" + b);
		WebElement e = driver.findElement(By.id("phone"));
		e.sendKeys("9010083314");
		boolean b1 = e.isDisplayed();
		System.out.println(b1);
		WebElement ele = driver.findElement(By.id("male"));
		ele.click();
		if (ele.isSelected()) {
			System.out.println("the radio button is selected");
		} else {
			System.out.println("not selected");
		}

	}

}
