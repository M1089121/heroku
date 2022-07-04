package com.mindtree.seleniumclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class selenium1 {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver","‪./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("Personal Finance"))).build().perform();
		driver.findElement(By.linkText("Income Tax Calculator")).click(;)

	}

}
