package com.qa.selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	static WebDriver driver;
@Test
	public static void browserlinks() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			String url = link.getAttribute("href");

			if (url == null || url.isEmpty()) {
				System.out.println("Url is either not configured or not exists");
				continue;
			}
			try {
				HttpURLConnection conn = (HttpURLConnection) (new URL(url).openConnection());
				conn.setRequestMethod("HEAD");
				conn.connect();
				int responsecode = conn.getResponseCode();
				if (responsecode >= 400) {
					System.out.println("Broken link:" + link + " get status code--->:" + responsecode);
				} else {
					System.out.println("valid link:" + link + "response code--->" + responsecode);
				}
			} catch (Exception e) {
				System.out.println("Exception checking link:" + e.getMessage());
			}
		}

		driver.quit();

	}
}

/*
 * "To check for broken links in Selenium, I first collect all <a> tag elements
 * using findElements. I extract their href attributes and then use Java's
 * HttpURLConnection to send a HEAD request to each link. If the response code
 * is 400 or above, I consider it a broken link. Selenium alone can’t get HTTP
 * response codes, so I combine it with Java networking classes."
 */