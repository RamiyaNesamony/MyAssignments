package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//Thread.sleep(99999);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.xpath("//form[@id='reg']//input[@name='firstname'] ")).sendKeys("Raphael");
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raphael");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rajesh");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("ramiya.nf@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("1345Silicon$");
		WebElement dropDob =driver.findElement(By.id("day"));
		Select selDay = new Select(dropDob);
		selDay.selectByIndex(18);
		WebElement dropMonth =driver.findElement(By.id("month"));
		Select selMonth =new Select(dropMonth);
		selMonth.selectByValue("March");
		WebElement dropYear =driver.findElement(By.id("year"));
		Select selYear =new Select (dropYear);
		selYear.selectByVisibleText("2023");
		driver.findElement(By.linkText("Female")).click();
		

	}

}
