package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathcontains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///F:/qspiderjava1/Frames/Xpathcontains.html");
		WebElement w=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		Thread.sleep(5000);
		w.click();

	}

}
