import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Amazon.AmazonFirstPage;

public class Amazon_First_Page {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_e&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=294102729729&hvpos=&hvnetw=g&hvrand=4081013446480725226&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062085&hvtargid=kwd-316976912080&hydadcr=5841_1914865&gclid=CjwKCAjwj42UBhAAEiwACIhADqrxdPac6c7oJ33AseW1cmQVkGmJyncD3BsbkYUm98OXWpaQp883choCQvcQAvD_BwE");
		 driver.get("https://www.amazon.in/");
		AmazonFirstPage amazonFP=new AmazonFirstPage(driver);
		
		String url=driver.getCurrentUrl();
		
		String title=driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		 if(url.equals("https://www.amazon.in/") && title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
	        	System.out.println("Pass");
	        
	        else
	        	System.out.println("Fail");
	       
				
		//amazonFP.gotoSearchText();
		
		Thread.sleep(3000);
		
		amazonFP.gotoFashion();
		
		
	}

}
