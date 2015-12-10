package org.test.mozilla;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase {
	
	WebDriver driver;
	WebElement search;
@BeforeTest
public void openBrowser(){
	driver= new FirefoxDriver();
	driver.get("http://www.google.com");
	
}
@Test
public void checkme(){
	System.out.println("Hello");
	
	
}
@Test
public void checktest(){
	System.out.println(driver.getTitle());
}

}
