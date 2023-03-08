package marathon.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://in.bookmyshow.com/");
	driver.findElement(By.xpath("//span[text() = 'Hyderabad']")).click();
	System.out.println("Title of the page" + driver.getCurrentUrl());
	
driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click();
WebElement movieName = driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']"));
	movieName.sendKeys("Vaathi (U)");
	
	driver.findElement(By.xpath("//span[text()='Vaathi']")).click();
	
}
}
