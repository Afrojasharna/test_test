package Book_StepDefination;

import Book_PageAction.Book_HomePageAtion;
import Book_PageAction.Book_VerifyPageAction;
import Book_Utility.Book_Base;
import cucumber.api.java.en.Then;

public class Book_dropdown_def extends Book_Base {
	Book_HomePageAtion book_homePageAtion = new Book_HomePageAtion();
	Book_VerifyPageAction book_verifyPageAction =  new Book_VerifyPageAction();
	
	
	
	@Then("^select Antiques from dropdown$")
	public void select_Antiques_from_dropdown() throws Throwable {
		book_homePageAtion.selectAntiquesfromdropdown();
	}

	@Then("^Click search button$")
	public void click_search_button() throws Throwable {
		book_homePageAtion.Clicksearchbutton();
	}

	@Then("^Verify user can dropdown and search item$")
	public void verify_user_can_dropdown_and_search_item() throws Throwable {
		book_verifyPageAction.Verifyusercandropdownandsearchitem();
	}

}
