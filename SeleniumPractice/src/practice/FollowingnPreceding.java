package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FollowingnPreceding {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///F:/qspiderjava1/Frames/Followingnpreceding.html");
		WebElement w=driver.findElement(By.xpath("//option[.='may']/following-sibling::option"));
		System.out.println(w.getText());
		WebElement x=driver.findElement(By.xpath("//option[.='may']/preceding-sibling::option[1]"));
System.out.println(x.getText());
	}

}
