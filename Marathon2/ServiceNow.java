package Marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args)
	{
//		1. Launch ServiceNow application
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get(" https://dev57553.service-now.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
//		2. Login with valid credentials username as admin and password 
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2oaD6KN$q$vN");
		driver.findElement(By.id("sysverb_login")).click();
		//Login inside Shadow
		Shadow dom =new Shadow(driver);
		dom.setImplicitWait(20);
		 dom.findElementByXPath("//div[@id='all']").click(); 
		
//		3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		 //dom.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog");
		
		 dom.findElementByXPath("//span[text()='Service Catalog']").click(); 
//		5. Select Apple iphone6s
		 //inside frame
		 WebElement findFrameElement= dom.findElementByXPath("//iframe[@id='gsft_main']");
		 
		 driver.switchTo().frame(findFrameElement);
		 
		 driver.findElement(By.xpath("(//h2[contains(text(),'Mobiles')]")).click();
//		6. Update color field to gold and storage field to 128GB
//		7. Click on Order now option
//		8. Verify order is placed and copy the request number"
//		9.Take a Snapshot of order placed page.

	}

}
