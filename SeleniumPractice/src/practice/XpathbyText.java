package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathbyText {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
	}

}
