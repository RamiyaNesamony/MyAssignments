package Marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class SalesForceArch {

	public static void main(String[] args)
	{
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
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> tabWindows=new ArrayList<String>(windowHandles);
		 driver.switchTo().window(tabWindows.get(1));
		 System.out.println("Title of Tab Opened :" + driver.getCurrentUrl());
//			4. Click confirm on Confirm redirect
		 driver.findElement(By.xpath("//button[text()='Confirm']")).click();		
//		4. Click  On Learning :Shadow Dom
		Shadow dom=new Shadow(driver);
		dom.findElementByXPath("//span[text()='Learning']").click();
//		5. And mouse hover on Learning On Trailhead
		//Use Actions
		WebElement findElementMouseOver = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions builder=new Actions(driver);
		builder.moveToElement(findElementMouseOver).perform();
		
		dom.findElementByXPath("//a[text()='Salesforce Certification']").click();
//		6. Click on Salesforce Certifications
//		7. Choose Your Role as Salesforce Architect
//		8. Get the Text(Summary) of Salesforce Architect 
//		9. Get the List of Salesforce Architect Certifications Available
//		10.Click on Application Architect 
//		11.Get the List of Certifications available
//		12.Take a Snapshot of Certifications.
	}

}
