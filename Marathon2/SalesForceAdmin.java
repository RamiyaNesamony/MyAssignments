package Marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class SalesForceAdmin {

	public static void main(String[] args) throws InterruptedException, IOException
	{
//		1. Launch Salesforce application https://login.salesforce.com/
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			2. Login with username as "hari.radhakrishnan@qeagle.com" 
//			    and password as "Leaf@123"
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
//			3. Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("(//div[@class='tileNavButton']/button)[2]")).click();		
//			*WindowHandle
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> tabWindows=new ArrayList<String>(windowHandles);
		 driver.switchTo().window(tabWindows.get(1));
		 System.out.println("Title of Tab Opened :" + driver.getCurrentUrl());
//			4. Click confirm on Confirm redirect
		 driver.findElement(By.xpath("//button[text()='Confirm']")).click();		
//			5. Click Learning 
		 //Thread.sleep(1000);
		 Shadow dom =new Shadow(driver);
		 dom.findElementByXPath("//span[text()='Learning']").click(); 
		
//			6. And mouse hover on Learning On Trailhead
		  WebElement findElementTrails = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		 Actions action =new  Actions(driver);
		 action.moveToElement(findElementTrails).perform();
//			7. Clilck on Salesforce Certifications
		 dom.findElementByXPath("//a[text()='Salesforce Certification']").click();
//			8. Click on first resulting Ceritificate
		 driver.findElement(By.xpath("//img[@class='roleMenu-item_img']")).click();
		 WebElement findPrintElement = driver.findElement(By.xpath("//a[text()='Marketing Cloud Administrator']"));
		 Actions act =new Actions(driver);
		 act.scrollToElement(findPrintElement);
//			9. verify - Administrator Overview page
		 String currenAdmintUrl = driver.getCurrentUrl();
		 System.out.println("VerifyUrl"  + currenAdmintUrl);
//			10.Print the Certifications available for Administrator Certifications (List)
		 List<WebElement> findCertificationElements = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		 int size=findCertificationElements.size();
		 for (int i = 0; i < size; i++)
		 {
			 String textCertificate = findCertificationElements.get(i).getText();
			 System.out.println(textCertificate);
		}
		 
//			11.Take a Snapshot of Certifications.
		 WebElement findPrintCerElement = driver.findElement(By.xpath("//a[text()='Platform App Builder']"));
		 Actions act3 =new Actions(driver);
		 act3.scrollToElement(findPrintCerElement).perform();
		 Thread.sleep(2000);
		 File source=driver.getScreenshotAs(OutputType.FILE);
		 File des =new File("./Marathon/certificates.png");
		 FileUtils.copyFile(source, des);
	}

}
