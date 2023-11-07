package Book_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Book_Utility.Book_Base;

public class Book_VerifyPageLocator extends Book_Base {

 public	Book_VerifyPageLocator() {
	 PageFactory.initElements(driver,this);
 }
	 @FindBy(xpath="//span[text()='laptop']")
	 public WebElement vsearch;
	 
	 @FindBy(xpath="//span[text()='Asian Antiques']")
	 public WebElement Boanti;
	 
	 
	 @FindBy(xpath="//a[text()='Earrings']")
	 public WebElement fashion;
	 
	 
	 @FindBy(linkText="Girls")
	 public WebElement Bowomen;
	 
}

