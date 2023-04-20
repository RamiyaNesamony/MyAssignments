package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;

public class BookMyshow {

	public static void main(String[] args) 
	{
		//01) Launch Edge / Chrome  add  implicitlyWait
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//02) Load https://in.bookmyshow.com/
		driver.get("https://in.bookmyshow.com/");
		//03) Type the city as"Hyderabad"in Select City
		driver.findElement(By.xpath("//span[@id='4']"));

		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hyderabad");
		
		driver.findElement(By.xpath("//span[@class='sc-dBaXSw gYlrLO']")).click();
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//span[@id='4']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sir");
		driver.findElement(By.xpath("//strong[text()='Sir']")).click();
		
		driver.findElement(By.xpath("//button[@data-phase='postRelease']")).click();
		WebElement theatre = driver.findElement(By.xpath("//a[@class='__venue-name']"));
		System.out.println(theatre.getText());
		
		driver.findElement(By.xpath("//div[@class='info-section']/img")).click();
		WebElement parking = driver.findElement(By.xpath("(//div[@class='facility-text'])[2]"));
		System.out.println(parking.getText());
		
		driver.findElement(By.className("cross-container")).click();
		driver.findElement(By.xpath("//a[@data-availability='A']//div")).click();
		driver.findElement(By.xpath("//ul[@id='popQty']/li")).click();
		driver.findElement(By.id("proceed-Qty")).click();
		
		// selecting seat
		
		driver.findElement(By.xpath("//div[@data-seat-type='1']//a")).click();
		driver.findElement(By.id("btmcntbook")).click();
		
		WebElement subtotal = driver.findElement(By.className("__sub-total"));
		String sub = subtotal.getText();
		System.out.println(sub);
		// TODO Auto-generated method stub
		/*
		EdgeDriver driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://in.bookmyshow.com/");
		
		
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("hyderabad");
		//04) Confirm the URL has got loaded with Hyderabad 
		String url =driver.getCurrentUrl();*/
		/*
    	



05) Search for your favorite movie 
06) Click on movie
07) Print the name of the theater displayed first
08) Click on the info of the theater
09) Confirm if there is a parking facility in the theater
10) Close the theater popup
11) Click on the first green (available) timing
12) Click Accept
13) Choose 1 Seat and Click Select Seats
14) Choose any available ticket and Click Pay
15) Print the sub total*/


	}

}
