package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.actitime.com/");
		WebElement w=driver.findElement(By.xpath("//a[text()='Why actiTIME']"));
		Actions act=new Actions(driver);
		act.contextClick(w).perform();
		act.sendKeys("t").perform();
		//act.sendKeys("w").perform();
	}

}
