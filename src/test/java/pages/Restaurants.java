package pages;

import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class Restaurants  extends ProjectSpecificMethods  {
	
	public Restaurants foodtypes() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'gro_swiper_dtls')]//p[.='Fast Food']")).click();
		return this;

	}
	
	public Food hotelSelection() throws InterruptedException {
		String oldWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='foodcard_whole card'])[3]")).click();
		//System.out.println(windowHandleMAin);
		System.out.println("Old Window " + oldWindow);
		Set<String> windows = 	driver.getWindowHandles();
		
		for (String newWindow : windows) {
			driver.switchTo().window(newWindow);

		}
		String newwindowtitle = driver.getTitle();
		System.out.println(newwindowtitle);
		///	driver.switchTo().window(windowHandleMAin)

		JavascriptExecutor js = (JavascriptExecutor) driver;		
		return new Food();
		
	}
}
