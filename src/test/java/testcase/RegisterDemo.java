package testcase;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import base.BaseTest;

public class RegisterDemo extends BaseTest {

	
	@Test
	
	public static void New () throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement entername = driver.findElement(By.xpath(loc.getProperty("entername")));
		entername.sendKeys("Test New One");
		Thread.sleep(2000);
		
		WebElement enteremail=driver.findElement(By.xpath(loc.getProperty("enteremail")));
		enteremail.sendKeys("new@gmail.com");
		Thread.sleep(2000);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("$('#ul_dial_codeMobile li[data-value=\"+355\"]').click();\r\n"
				+ "", "");
		
		WebElement mobilenumber=driver.findElement(By.xpath(loc.getProperty("mobilenumber")));
		mobilenumber.sendKeys("7757697610");
		Thread.sleep(2000);
		
//		WebElement selectstate=driver.findElement(By.xpath(loc.getProperty("selectstate")));
//		Select sel1= new Select(selectstate);
//		sel1.selectByValue("30624");
//		Thread.sleep(2000);
//		
//		WebElement selectcity=driver.findElement(By.xpath(loc.getProperty("selectcity")));
//		Select sel2= new Select(selectcity);
//		sel2.selectByValue("30949");
//		Thread.sleep(2000);
//		
		WebElement selectcourse=driver.findElement(By.xpath(loc.getProperty("selectcourse")));
		Select sel4= new Select(selectcourse);
		sel4.selectByValue("1500173");
		Thread.sleep(12000);
		
		WebElement checkbox=driver.findElement(By.xpath(loc.getProperty("checkbox")));
		checkbox.click();
		Thread.sleep(2000);
		
		WebElement register=driver.findElement(By.xpath(loc.getProperty("register")));
		register.click();
		Thread.sleep(10000);
	}
	
}
