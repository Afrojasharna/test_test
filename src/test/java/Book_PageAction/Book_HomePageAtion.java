package Book_PageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Book_PageLocator.Book_HomePageLocator;
import Book_Utility.Book_Base;
import Book_Utility.Book_TestData;

public class Book_HomePageAtion extends Book_Base {
	
	Book_HomePageLocator book_HomePageLocator = new Book_HomePageLocator();
	
	public void EnterMonitorandClicksearchicon() throws Exception {
		Thread.sleep(5000);
		
		book_HomePageLocator.search.sendKeys(Book_TestData.bosearch);
		book_HomePageLocator.searchlink.click();
		
	}
	public void selectAntiquesfromdropdown() throws Exception {
		Select drodp = new Select(book_HomePageLocator.Bodrdwn);
		drodp.selectByVisibleText("Antiques");
		Thread.sleep(4000);
		
	}
	
	public void  Clicksearchbutton() throws Exception {
		Thread.sleep(3000);
		book_HomePageLocator.searchlink.click();
			
	}
	public void MousehovertoJewelryWatches() throws InterruptedException{
		Actions mousehover = new Actions(driver);
		mousehover.moveToElement(book_HomePageLocator.Bojrwtch).build().perform();
		Thread.sleep(2000);
		
		}
	public void ClickonFashionJewelry() {
		book_HomePageLocator.Bofshwtch.click();
		
	}
	
	public void ScrolldownandClickonWomen() throws Exception {
		Thread.sleep(3000);
		
  ((JavascriptExecutor)driver).executeScript("scroll(0,600)");
   book_HomePageLocator.Boscrdwn.click();
		
	}
		

}
