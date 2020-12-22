package mySeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFacebook {

	public void testcase() {
		System.setProperty("webdriver.gecko.driver","/Users/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
