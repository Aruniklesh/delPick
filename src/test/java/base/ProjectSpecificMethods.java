package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	public static WebDriver driver;
	public static Robot robot;
	
	@BeforeMethod
	public void preConditions() throws AWTException{
		driver = new ChromeDriver();
		robot = new Robot();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.delpick.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	
	
	
	@AfterMethod
	public void postConditions(){
		driver.close();

	}
}
