package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
public static void main(String[] args) {
	

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	driver.findElement(By.xpath("//label[text()='Date']")).click();
	driver.findElement(By.xpath("//td[text()='17']")).click();
	driver.findElement(By.id("search_btn")).click();
	

   String text = driver.findElement(By.xpath("//span[contains(@class,'f-bold busFound')]")).getText();
   System.out.println(text);
   
  WebElement findElement = driver.findElement(By.xpath("//label[@title='SLEEPER']"));
  driver.executeScript("arguments[0].click();", findElement);
  
  String text2 = driver.findElement(By.xpath("//div[contains(text(),'KMRL Kalaimakal')]")).getText();
  System.out.println("second bus name" +text2);
   
  String title = driver.getTitle();
  System.out.println(title);
}
}