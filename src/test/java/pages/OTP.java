package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class OTP  extends ProjectSpecificMethods {
	public void enterOTP() {

		driver.findElement(By.id("otpinput0")).sendKeys("1");
		driver.findElement(By.id("otpinput1")).sendKeys("2");
		driver.findElement(By.id("otpinput2")).sendKeys("3");
		driver.findElement(By.id("otpinput3")).sendKeys("4");
		driver.findElement(By.id("otpinput4")).sendKeys("5");
		driver.findElement(By.id("otpinput5")).sendKeys("6");
 }
}
