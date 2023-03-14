package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AcmeTestLeaf {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String title =driver.getTitle();
		System.out.println(title);
		driver.findElement(By.partialLinkText("Log Out")).click();
		

	}

}
