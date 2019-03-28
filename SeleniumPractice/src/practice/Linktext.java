package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linktext {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//WebElement w=driver.findElement(By.linkText("Forgotten account?"));
		WebElement w=driver.findElement(By.partialLinkText("?"));
		w.click();
	}

}
