package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathactitimehelp {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.actitime.com/");
		driver.findElement(By.xpath("//a[@class='main-menu__link' ][@href='/help-center']")).click();
	

	}

}
