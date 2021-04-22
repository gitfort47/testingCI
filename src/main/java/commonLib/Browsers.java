package commonLib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {

	
	public WebDriver driver; //object driver for selinum
	
	public void chromeBrowser(String URL) {
		String url = URL;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}
	
	
}
