package com.junit;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void Beforeclass() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public static void afterClass() {
		driver.quit();
		
    }
	@Before
	public  void startingtime() {
		long stime = System.currentTimeMillis();
	}
	
	@After
	public  void endingtime() {
		long etime = System.currentTimeMillis();
	}
	
	@Test
	public void m1() {
		WebElement d = driver.findElement(By.xpath("//button[text()='✕']"));
		d.click();
	}
	
	@Test
	public void m2() {
		WebElement s = driver.findElement(By.name("q"));
		s.sendKeys("Poco",Keys.ENTER);
	}
	@Test
	public void m3() {
		WebElement mobile = driver.findElement(By.xpath("//div[text()='POCO C31 (Royal Blue, 64 GB)'] "));
	    String s1 = mobile.getText();
        System.out.println(s1);
        mobile.click();
	}
	@Test
	public void m4() {
		String parent = driver.getWindowHandle();
		Set<String> children = driver.getWindowHandles();
		
		driver.switchTo().window(parent);
	}
	@Test
	public void m5() {
		WebElement mobile2 = driver.findElement(By.xpath("//div[text()='POCO C31 (Royal Blue, 64 GB)']"));
		String s2 = mobile2.getText();
		System.out.println(s2);
	
	
	}
	

}