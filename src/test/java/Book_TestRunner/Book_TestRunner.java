package Book_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Book_Utility.Book_Base;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Book_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Book_StepDefination",tags = {"@star"})

public class Book_TestRunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
public void boStartURL() {
		
		Book_Base bo = new Book_Base();
		bo.BoiBrowser();
		
}
	@AfterTest
public void boCloseURL () {
		
	Book_Base bo = new Book_Base();
	bo.driver.quit();
	
}

}
