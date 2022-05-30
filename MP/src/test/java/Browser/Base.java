package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	
	
	public static WebDriver openchromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 return driver;
	}	
	public static  WebDriver openEdge()
	{
		System.setProperty("webdriver.edge.driver", "D:\\zIEdgeDriver1\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();      
	     return driver;
	}
/*	public static  WebDriver openFireFox() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\zFireFox\\geckodriver.exe"); 
		System.setProperty("webdriver.gecko.driver", "D:\\zFireFox\\geckodriver.exe"); 
		
	    	WebDriver driver = new FirefoxDriver();  
	     return driver;   
	     
	}
	public static WebDriver openOpera()
	{
		System.setProperty("webdriver.opera.driver", "D:\\zOperaDriver\\operadriver_win64\\operadriver.exe");
	//	System.setProperty("webdriver.opera.driver", "D:\\zOperaDriver\\operadriver_win64\\operadriver.exe");
		WebDriver driver = new OperaDriver();   
		return driver;
	}
	public static  WebDriver openInternetExplore()
	{
		System.setProperty("webdriver.ie.driver","D:\\zInternetExplorer\\IEDriverServer.exe" );
		WebDriver driver = new InternetExplorerDriver();   
	     return driver;
	}
	                       */
}

