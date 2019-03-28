package practice;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Copypaste {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement w=driver.findElement(By.id("email"));
		w.sendKeys("hii");
		w.sendKeys(Keys.CONTROL,"a","c");
		WebElement f=driver.findElement(By.id("pass"));
		f.sendKeys(Keys.CONTROL,"v");
		System.out.println(f.getAttribute("value"));
		
		
		

	}

}
