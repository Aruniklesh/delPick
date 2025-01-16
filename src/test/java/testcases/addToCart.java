package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.welcome;

public class addToCart extends ProjectSpecificMethods {
	@Test
	public  void run() throws Exception, Exception {
		welcome callingObj = new welcome();
		callingObj.location().chooseRestaurants()
		.foodtypes().hotelSelection()
		.FoodSelection()
		.addQuantity().addExtra().addNote().CheckOut().verifyCheckOut()
		.regionSelection().addNumber().clickGetOTP()
		.enterOTP();	
		
	}

}
