package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.actitime.com");
		WebElement w=driver.findElement(By.linkText("Help Center"));
		Select select=new Select(w);
		System.out.println(select.isMultiple());
	}

}
