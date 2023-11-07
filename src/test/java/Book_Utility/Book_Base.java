package Book_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class Book_Base {
	
	
	public static WebDriver driver;
	public static Properties BoiPro;
	
	
	public Book_Base() {
		try {
			FileInputStream boiFle = new FileInputStream(System.getProperty("user.dir")+("//src/test//java//Book_Config//Book_Config.Properties"));
			BoiPro= new Properties(); 
			BoiPro.load(boiFle);
		} catch (FileNotFoundException e) {
			
			System.out.println("Please, look the code");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public void BoiBrowser() {
		String BoiAllBrowser = BoiPro.getProperty("BoBrowser1");
		if(BoiAllBrowser.equalsIgnoreCase("Chorme")) {
			System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+("//Book_ChormeDriver//chrome.exe"));
			ChromeOptions opp = new ChromeOptions();
			opp.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			
			
		}
		else if(BoiAllBrowser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("Webdriver.edge.driver",System.getProperty("user.dir")+("//Book_EdgeDriver//msedgedriver.exe"));
			EdgeOptions eopp = new EdgeOptions();
			eopp.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Book_Utiliti.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Book_Utiliti.implicitlyWait));
			driver.manage().window().maximize();
			
		}
	}
	public static void BoLaunchURL(String URL) {
		
		driver.get(BoiPro.getProperty("BoURL"));
	}

}

	
	


