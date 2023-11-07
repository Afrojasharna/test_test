package Book_StepDefination;

import Book_PageAction.Book_HomePageAtion;
import Book_PageAction.Book_VerifyPageAction;
import Book_Utility.Book_Base;
import cucumber.api.java.en.Then;

public class Book_scroll_down_def extends Book_Base {
	Book_HomePageAtion book_homePageAtion = new Book_HomePageAtion();
	Book_VerifyPageAction book_verifyPageAction =  new Book_VerifyPageAction();
	
	
	@Then("^Scroll down and Click on Women$")
	public void scroll_down_and_Click_on_Women() throws Throwable {
		book_homePageAtion.ScrolldownandClickonWomen();
	    
	}

	@Then("^Verify user can scroll down in home page$")
	public void verify_user_can_scroll_down_in_home_page() throws Throwable {
		book_verifyPageAction.Verifyusercanscrolldowninhomepage();
	}

}
