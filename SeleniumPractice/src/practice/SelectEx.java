package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectEx {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.airindia.com/");
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	WebElement w=driver.findElement(By.tagName("select"));
	Select s=new Select(w);
	s.selectByIndex(2);
	
	

	}

}
