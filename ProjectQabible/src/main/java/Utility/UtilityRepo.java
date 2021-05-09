package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityRepo {
	static WebDriver driver;
	WebDriverWait wait;
	public WebDriver launchBrowser(String url, String type)
	{
	  switch (type){
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver= new ChromeDriver();
			break;
			
		case "gecko":
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
		    driver=new InternetExplorerDriver();  
			break;
			
		}
	  
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
		return driver;
	
	}
	

}
