package mySeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenFacebook {
    @Test
	public static  void mainTest() {
		System.setProperty("webdriver.chrome.driver","D:\\Israt\\selenium setup downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		
		System.out.println(driver.getTitle());
		driver.close();
	}

}
