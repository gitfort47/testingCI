package loginTest;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonLib.Browsers;
import input.data;
import io.github.bonigarcia.wdm.WebDriverManager;
import locators.elements;


public class validLogin {
	
	Browsers br=new Browsers();
	data dat =  new data();
	elements element = new elements();


	@Test(priority = 1)
	
	public void Verify_Url_Is_Working_Or_Not() {
		// Test 1  Open browser
		
		br.chromeBrowser(dat.facebook_url);
		assertEquals(dat.facebook_url, br.driver.getCurrentUrl());
	
		}
	
	@Test(priority = 2)
	public void Login_verification() {

			br.driver.findElement(By.xpath(element.face_email_xpath)).sendKeys(dat.username);
			br.driver.findElement(By.xpath(element.face_pass_xpath)).sendKeys(dat.password);
			br.driver.findElement(By.xpath(element.face_login_bttn)).click();	
	}
}
