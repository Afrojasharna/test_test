package Book_StepDefination;

import Book_PageAction.Book_HomePageAtion;
import Book_PageAction.Book_VerifyPageAction;
import Book_Utility.Book_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Book_search_defination extends Book_Base {
	 
	Book_HomePageAtion book_HomePageAtion = new Book_HomePageAtion();
	Book_VerifyPageAction book_VerifyPageAction =  new Book_VerifyPageAction();
	
	@Given("^Launch <\"([^\"]*)\"> Bo$")
	public void launch_Bo(String URL) throws Throwable {
		
		 BoLaunchURL(URL); 
	}
	    
	@Then("^Enter Monitor and Click search icon$")
	public void enter_Monitor_and_Click_search_icon() throws Throwable {
		book_HomePageAtion.EnterMonitorandClicksearchicon();
	    
	}

	@Then("^Verify user can search item in search field$")
	public void verify_user_can_search_item_in_search_field() throws Throwable {
		book_VerifyPageAction.Verifyusercansearchiteminsearchfield();
		
	}



}
