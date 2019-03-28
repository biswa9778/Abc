package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement txt1=driver.findElement(By.xpath("//input[@type='text']"));
		txt1.sendKeys("hii");
		//txt1.sendKeys(Keys.CONTROL,"c");
		driver.switchTo().frame("MultipleFrames.html");
		//WebElement txt2=driver.findElement(By.id("t2"));
		//txt2.sendKeys(Keys.CONTROL,"v");
		driver.switchTo().parentFrame();
		
		

	}

}
