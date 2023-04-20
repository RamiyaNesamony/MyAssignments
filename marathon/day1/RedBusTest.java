package marathon.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;

public class RedBusTest {

	public static void main(String[] args) throws IOException 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chennai");
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[@class='selected']")).click();
		driver.findElement(By.id("dest")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.xpath("//td[text()='16']")).click();
		driver.findElement(By.id("search_btn")).click();
		
		WebElement bus = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		System.out.println(bus.getText());
		
		//driver.findElement(By.xpath("//input[@id='bt_SLEEPER']/following-sibling::label[1]")).click();
		driver.findElement(By.xpath("(//label[@class='cbox-label'])[6]")).click();
		
		WebElement busname = driver.findElement(By.xpath("(//div[contains(@class,'travels lh-24')])[2]"));
		System.out.println(busname.getText());
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/irct.png");
		FileUtils.copyFile(source, dest);

		// TODO Auto-generated method stub
		/*01) Launch Firefox / Chrome and add  implicitlyWait
        ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		//2.Load Url
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		//03) Type "Chennai" in the FROM text box
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		//04) Click the first option from the pop up box
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		//05) Type "Bangalore" in the TO text box
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		//06) Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		//07) Select tomorrow's date in the Date field
		driver.findElement(By.xpath("//td[@class='wd day']")).click();
		//08) Click Search Buses
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		//09) Print the number of buses shown as results (104 Buses found) (use .getText())
		String buses=driver.findElement(By.xpath("//span[text()='Buses']")).getText();
		System.out.println(buses);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//10) Choose SLEEPER in the left menu 
		driver.findElement(By.xpath("//input[@id='bt_SLEEPER']")).click();
		//11) Print the name of the second resulting bus (use .getText())
		String sleepbus=driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(sleepbus);
		//12) Get the Title of the page(use .getTitle())
		
		String title=driver.getTitle();
		System.out.println(title);*/











		

	}

}
