package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DragnDrop {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement s=driver.findElement(By.xpath("//h1[text()='Block 2']"));
		WebElement t=driver.findElement(By.xpath("//div[@id='column-2']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(s,t).perform();
		
		
		

	}

}
