package com.cicd.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchChromeBrowser {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void launchDriver() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vummiti.sai\\OneDrive - Subex Limited\\Workplace\\Automation - ROC and RA\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	
	@Test
	public void Test1() throws InterruptedException {
		driver.navigate().to("https://jira.subex.com/login.jsp");
		System.out.print("Test1 title is: "+driver.getTitle());
		Thread.sleep(5000);
		
	}
	
	@Test
	public void Test2() throws InterruptedException {
		driver.navigate().to("https://subex.darwinbox.in/user/login");
		System.out.print("Test2 title is: "+driver.getTitle());
		Thread.sleep(5000);
	}

}
