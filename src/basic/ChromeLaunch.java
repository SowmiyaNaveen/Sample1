package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.WebDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
	//TYPE 1:Chrome
	//	System.setProperty("webdriver.chrome.driver","C:\\DRIVER\\chromedriver.exe");
	//	ChromeDriver dri=new ChromeDriver();
	
	//TYPE2: Edge	
    // System.setProperty("webdriver.edge.driver","C:\\DRIVER\\msedgedriver.exe");
   	//	EdgeDriver driv=new EdgeDriver();
		
	//System.setProperty("webdriver.opera.driver","C:\\DRIVER\\operadriver.exe");
   	//OperaDriver driv=new OperaDriver();
	   	
 	System.setProperty("webdriver.chrome.driver","C:\\DRIVER\\chromedriver.exe");
 	WebDriver dri=new ChromeDriver();
 	
 //	dri.get("https://www.facebook.com/login/");
 //	dri.manage().window().maximize();
 //	dri.findElement(By.id("email")).sendKeys("sowmiya");
 //	dri.findElement(By.name("pass")).sendKeys("1234");
 //	dri.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy")).click();
 //	dri.close();
 	
 	dri.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=12836428451474865078&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9148884&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
 	dri.manage().window().maximize();
 	dri.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("watches");
 	dri.findElement(By.className("")).click()
	}

}
