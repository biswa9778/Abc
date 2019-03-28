package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.actitime.com/");
		WebElement w=driver.findElement(By.linkText("Start Using actiTIME"));
		Actions act=new Actions(driver);
		act.moveToElement(w).perform();
		
	}

}
