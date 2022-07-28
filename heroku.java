package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class heroku {
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mindc1may155\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		Actions action = new Actions(driver);
		action.moveToElement( driver.findElement(By.xpath("//div[@class='figure'][2]/img"))).build().perform()
		String username = driver.findElement(By.xpath("//div[@class='figure'][2]/div/hs)).getText();
	    System.out.println()"Username: "  +username);
	}
}