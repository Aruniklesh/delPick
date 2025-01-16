package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificMethods;

public class Authentication  extends ProjectSpecificMethods {
	
	public Authentication regionSelection() {
		WebElement country = driver.findElement(By.xpath("//div[@class='PhoneInputCountry']//select"));
		country.click();
		Select locSelect = new Select(country);
		locSelect.selectByVisibleText("India");
		return this;
	}
	public Authentication addNumber() {

		driver.findElement(By.id("Mobile")).sendKeys("6385483941");
		return this;
	}
	public OTP clickGetOTP() {

		driver.findElement(By.xpath("//button[.='Get OTP']")).click();
		return new OTP();

	}
}
