package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindow1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
	String par=driver.getWindowHandle();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();;
	    Set<String> handels=driver.getWindowHandles();
	Iterator<String> it=handels.iterator();
	it.next();
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
	driver.findElement(By.className("header__logo")).click();
	System.out.println(driver.getWindowHandles());
	System.out.println(driver.getWindowHandles().size());
	System.out.println(driver.getTitle());
	driver.switchTo().window(par);
	System.out.println(driver.getTitle());
	
	
	}

}
