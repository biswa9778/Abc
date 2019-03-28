package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplewebelement {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		List<WebElement> w=driver.findElements(By.xpath("//div[@class='clearfix loggedout_menubar']"));
		System.out.println(w.size());
		WebElement e=w.get(0);
		System.out.println(e.getText());
	}

}
