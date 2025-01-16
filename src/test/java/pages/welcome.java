package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class welcome extends ProjectSpecificMethods {
	
	public welcome location() throws Exception  {
		driver.findElement(By.id("StreetName")).sendKeys("400 Allen Avenue, Pasadena");
		Thread.sleep(1000);
		//to select the location 
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		return this;
		
	}
	
	public Restaurants chooseRestaurants() throws Exception {
		driver.findElement(By.xpath("(//h2[contains(@class,'fm_banner_plttxt')])[4]")).click();
		Thread.sleep(1000);
		return new Restaurants();

	}
	
	
}
