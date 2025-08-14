package com.qa.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertHandling {

//	@Test
public static void alerts() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // imp
		// explicitly wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement simplebutton = driver.findElement(By.xpath("//button[contains(text(),'Simple')]"));
		simplebutton.click();
		Thread.sleep(1000);
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		if (text.equals("I am an alert box!")) {
			System.out.println("both are equal");
		} else {
			System.out.println("not euqls");
		}
		al.accept();
}
	@Test
	public static void Actions() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // imp
		// explicitly wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions ac=new Actions(driver);
//		ac.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Point')]")));
//		ac.build().perform();
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement dropable=driver.findElement(By.id("droppable"));
		ac.clickAndHold(draggable).moveToElement(dropable).release().build().perform();
//		if(dropable.equals("Drop here")) {
//			System.out.println("droped successfully");
//		}else {
//			System.out.println("not done properly");
//		}
		

	}
	}
