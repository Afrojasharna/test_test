package Book_PageAction;

import org.testng.Assert;

import Book_PageLocator.Book_VerifyPageLocator;
import Book_Utility.Book_Base;

public class Book_VerifyPageAction extends Book_Base {
	Book_VerifyPageLocator book_VerifyPageLocator = new Book_VerifyPageLocator();
	
	public void Verifyusercansearchiteminsearchfield() throws Exception {
		Thread.sleep(5000);
		book_VerifyPageLocator.vsearch.click();
		}
	public void Verifyusercandropdownandsearchitem() throws Exception {
		Thread.sleep(4000);
		boolean antiquesverify = book_VerifyPageLocator.Boanti.isDisplayed();
		Assert.assertTrue(antiquesverify);
	}
	public void Verifyusercandomousehover () {
		
		boolean verifyearing = book_VerifyPageLocator.fashion.isDisplayed();
		Assert.assertTrue(verifyearing);
		
	}
	
	public void Verifyusercanscrolldowninhomepage() throws InterruptedException {
		Thread.sleep(4000);
		
	boolean womenverify = book_VerifyPageLocator.Bowomen.isDisplayed();
	Assert.assertTrue(womenverify);
		
	}


}
