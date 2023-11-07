package Book_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Book_Utility.Book_Base;


public class Book_HomePageLocator extends Book_Base {
	
	 public  Book_HomePageLocator() {
		 PageFactory.initElements(driver,this);
		 	 
	 }
	 
     @FindBy(id="gh-ac")
	 public WebElement search;//search feature
	 
	 @FindBy(id="gh-btn")
	 public WebElement searchlink;
	 
	 @FindBy(id="gh-cat")
	 public WebElement Bodrdwn;//drop down feature
	
	 
	@FindBy(linkText="Jewelry & Watches")
	 public WebElement Bojrwtch;//mouse hover feature
	 
	 
	 @FindBy(linkText="Fashion Jewelry")
	 public WebElement Bofshwtch;
	 
	 @FindBy(xpath = "/html/body/div[7]/div[6]/ul/li[2]/a/div/div/div")
	 public WebElement Boscrdwn;//scroll down
	
}
