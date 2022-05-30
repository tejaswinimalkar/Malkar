package NewPackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

//import org.apache.poi.ss.formula.functions.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.google.common.base.Function;
import java.util.function.Function;
//import org.apache.poi.ss.formula.functions.Function;
//import org.apache.poi.ss.formula.functions.Function2Arg;

public class Test1 {

	public static void main(String[] args) {
		//System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	//	driver.get("https://www.facebook.com/");
		
	    driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);  //method chaning and 2 argument 
		
		driver.get("https://www.w3schools.com/Js/Js_popup.asp");
		
		WebElement  alertBox=driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']"));
		//WebElement  confirmBox=driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']"));
		WebElement  promtBox=driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']"));
		WebElement  lineBreak=driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert2']"));
		
		WebDriverWait wait  =new WebDriverWait(driver,2); 
		
		WebElement x1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")));
		
		alertBox.click();

		//Fluent wait-> waiting time + condition +frequency
		    
			Wait<WebDriver>  fwait=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
			
	                //  fwait.until(new Function)
			
				WebElement  promtBox1=fwait.until(new Function<WebDriver,WebElement>()
								{
							             public WebElement apply(WebDriver driver)
							             {
							            	 return driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']"));
							             }
							             
								});
				ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(addr.get(0));
				promtBox1.click();


	}

}
