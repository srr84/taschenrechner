package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ide {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://www.htw-berlin.de/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testIde() throws Exception {
		driver.get(baseUrl + "file:///C:/Users/Ruchti/Desktop/My%20Dropbox/Master%20Thesis/taschenrechner/src/main/Taschenrechner.html");
		driver.findElement(By.xpath("//input[@value='  0   ']")).click();
		driver.findElement(By.xpath("//input[@value='  1   ']")).click();
		driver.findElement(By.xpath("//input[@value='  4   ']")).click();
		driver.findElement(By.cssSelector("input.button")).click();
		driver.findElement(By.xpath("//input[@value='  8   ']")).click();
		driver.findElement(By.xpath("//input[@value='  5   ']")).click();
		driver.findElement(By.xpath("//input[@value='  2   ']")).click();
		driver.findElement(By.xpath("//input[@value='  .   ']")).click();
		driver.findElement(By.xpath("//input[@value='sqrt ']")).click();
		driver.findElement(By.xpath("//input[@value=' pow ']")).click();
		driver.findElement(By.xpath("//input[@value=' ln ']")).click();
		driver.findElement(By.xpath("//input[@value='  C  ']")).click();
		driver.findElement(By.xpath("//input[@value='  /   ']")).click();
		driver.findElement(By.xpath("//input[@value='  *   ']")).click();
		driver.findElement(By.xpath("//input[@value='  -   ']")).click();
		driver.findElement(By.xpath("//input[@value='  +   ']")).click();
		driver.findElement(By.name("Display")).clear();
		driver.findElement(By.name("Display")).sendKeys("1234");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
