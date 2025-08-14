package com.qa.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorInSelenium {
	public static void main(String[] args) throws IOException {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement myaccount = driver.findElement(By.xpath("//span[text()='My Account']"));
//		flush(myaccount, driver);
		drawboarder(myaccount, driver);

//		File src=myaccount.getScreenshotAs(OutputType.FILE);
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("./Screenshots//highlight.png"));
//		generateAlert(driver, "This is my javascript Alert");
		clickByJS(myaccount, driver);
		refreshbrowserByJS(driver);
		System.out.println(getTitleByJS(driver));
		System.out.println(getInnertext(driver));
//		scrollPageDown(driver);
		WebElement iphone=driver.findElement(By.xpath("//img[@title='iPhone']"));
		scrollIntoView(iphone, driver);
		clickByJS(iphone, driver);
	}

	public static void flush(WebElement element, WebDriver driver) { // highlight
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 7; i++) {
			changecolor("rgb(1,300,1)", element, driver);
			changecolor(bgcolor, element, driver);
		}
	}

	public static void changecolor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void drawboarder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static void generateAlert(WebDriver driver, String massage) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + massage + "')");
	}

	public static void clickByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void refreshbrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0);");

	}

	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;

	}

	public static String getInnertext(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String innertext = js.executeScript("return document.documentElement.innerText").toString();
		return innertext;
	}

	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}

}
