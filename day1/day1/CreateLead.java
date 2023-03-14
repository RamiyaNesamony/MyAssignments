package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramiya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Francis");
		//drop down
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select emp=new Select(drop1);
		emp.selectByIndex(4);
		
		driver.findElement(By.className("smallSubmit")).click();
		

	}

}
