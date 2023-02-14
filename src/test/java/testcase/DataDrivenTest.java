package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class DataDrivenTest extends BaseTest {

	
	@Test (dataProvider="testdata",dataProviderClass=Data.class)
	
	public void Data (String username, String password) throws InterruptedException {
		
		Thread.sleep(4000);
		WebElement user=driver.findElement(By.id(loc.getProperty("user")));
		user.clear();
		user.sendKeys(username);

		WebElement pass=driver.findElement(By.id(loc.getProperty("pass")));
		pass.clear();
		pass.sendKeys(password);
		
		WebElement loginbutton=driver.findElement(By.id(loc.getProperty("loginbutton")));
		loginbutton.click();
		Thread.sleep(2000);
		
		WebElement logoutmenu=driver.findElement(By.id(loc.getProperty("logoutmenu")));
		logoutmenu.click();
		Thread.sleep(2000);
		
		WebElement logoutbutton=driver.findElement(By.xpath(loc.getProperty("logoutbutton")));
		logoutbutton.click();
		Thread.sleep(3000);
	
	}
	
	
}

