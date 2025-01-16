package pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class Checkout  extends ProjectSpecificMethods {
	public	Checkout addQuantity() {
		
		driver.findElement(By.xpath("(//div[contains(@class,'inc_decrease_btn')])[2]")).click();
return this;

	}
	public Checkout addExtra() {
		driver.findElement(By.xpath("//input[@class='form-check-input']")).click();
		return this;


	}
	public	Checkout addNote() {
		driver.findElement(By.xpath("//input[@class='foodmodal_input']")).sendKeys("Add more Spicy");
		return this;


	}
	public Checkout CheckOut(){
		driver.findElement(By.xpath("//div[.='Add To Cart/CheckOut']//button")).click();
		return this;


	}
	public Authentication verifyCheckOut() throws InterruptedException {
		String titleforOrdering = driver.getTitle();
		System.out.println(titleforOrdering);

		Thread.sleep(2000);
		WebElement checkout = 	driver.findElement(By.xpath("//button[.='Proceed To Checkout']"));
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		checkout.click();
		Thread.sleep(1000);
		return new Authentication();
	}


}
