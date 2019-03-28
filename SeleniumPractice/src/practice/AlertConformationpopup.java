package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertConformationpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("555");
		driver.findElement(By.name("submit")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();;
		
	}

}
