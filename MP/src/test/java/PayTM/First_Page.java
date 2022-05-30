package PayTM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM_PayTM.FirstPage;
import POM_PayTM.RechargeModule;

public class First_Page {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com//");
		
		FirstPage  firstpage=new FirstPage(driver);
		
		firstpage.gotorechargeMobile();
		//firstpage.gotogasCylinder();
		//firstpage.gotorentPayment();
		//firstpage.gotoelectricityBill();
		
		RechargeModule recharge=new RechargeModule(driver);
		
		
		recharge.sendMobileNo();
		//recharge.sendddoperator();
		recharge.sendamount();
		recharge.gotoProceedRecharge();	
		
        driver.close();
	}

}
