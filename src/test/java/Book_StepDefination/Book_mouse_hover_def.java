package Book_StepDefination;

import Book_PageAction.Book_HomePageAtion;
import Book_PageAction.Book_VerifyPageAction;
import Book_Utility.Book_Base;
import cucumber.api.java.en.Then;

public class Book_mouse_hover_def extends Book_Base {
	Book_HomePageAtion book_HomePageAtion = new Book_HomePageAtion();
	Book_VerifyPageAction book_VerifyPageAction = new Book_VerifyPageAction();
	
	@Then("^Mouse hover to Jewelry & Watches$")
	public void mouse_hover_to_Jewelry_Watches() throws Throwable {
		book_HomePageAtion.MousehovertoJewelryWatches();
		
	}

	@Then("^Click on Fashion Jewelry$")
	public void click_on_Fashion_Jewelry() throws Throwable {
		book_HomePageAtion.ClickonFashionJewelry();
	}

	@Then("^Verify user can do mouse hover$")
	public void verify_user_can_do_mouse_hover() throws Throwable {
		book_VerifyPageAction.Verifyusercandomousehover();
	}


}
