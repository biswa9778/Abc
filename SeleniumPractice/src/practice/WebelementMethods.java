package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebelementMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
WebElement w=driver.findElement(By.id("email"));
w.sendKeys("hii");
System.out.println(w.getAttribute("value"));
w.clear();
System.out.println(w.getAttribute("class"));
WebElement e=driver.findElement(By.partialLinkText("?"));

System.out.println(e.getText());
WebElement f=driver.findElement(By.id("u_0_j"));
System.out.println(f.isEnabled());
System.out.println(w.isDisplayed());
System.out.println(e.isSelected());


		
	}

}
