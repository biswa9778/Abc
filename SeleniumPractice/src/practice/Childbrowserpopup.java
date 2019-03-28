package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Childbrowserpopup {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		String w=driver.getWindowHandle();
		System.out.println(w);
	driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
	Set<String> s=driver.getWindowHandles();
	System.out.println(s);
	}

}
