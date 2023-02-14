package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;



public class MySecondTestcase extends BaseTest {

	@Test
	public static void LoginTest () throws InterruptedException {
		
		System.out.println("Clicked Successfully");
		Thread.sleep(4000);
		
		WebElement getUserName = driver.findElement(By.id(loc.getProperty("username"))); 
		getUserName.sendKeys("Admin");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.id(loc.getProperty("password")));
		password.sendKeys("admin123");
		
		WebElement login=driver.findElement(By.id(loc.getProperty("login")));
		login.click();
		Thread.sleep(3000);
		
		WebElement paul_colings=driver.findElement(By.id(loc.getProperty("paul_colings")));
		paul_colings.click();
		Thread.sleep(3000);
		
		WebElement logout=driver.findElement(By.id(loc.getProperty("logout")));
		logout.click();
		Thread.sleep(3000);
	}
}
