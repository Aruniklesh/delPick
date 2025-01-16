package pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class Food  extends ProjectSpecificMethods {
	
	public Checkout FoodSelection() throws InterruptedException{
	 WebElement clickable =  driver.findElement(By.xpath("(//div[@class='card-body'])[3]"));
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		clickable.click();
		
		return new Checkout();

 }
}
