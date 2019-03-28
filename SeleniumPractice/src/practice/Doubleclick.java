package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.airindia.com/");
		WebElement w=driver.findElement(By.xpath("//img[@title='India']"));
		Actions act=new Actions(driver);
		act.doubleClick(w).perform();
		

	}

}
