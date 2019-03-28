package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		String par=driver.getWindowHandle();
		System.out.println(par);
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();;
		System.out.println("2nd--"+driver.getWindowHandle());
                   		
		Set<String> windowhandels=driver.getWindowHandles();
		System.out.println(windowhandels);
	System.out.println(windowhandels.size());
		Iterator<String> it=windowhandels.iterator();
	
it.next();
System.out.println(driver.getTitle());
	driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
		driver.switchTo().window(par);
		System.out.println(driver.getTitle());
		
	}

}
