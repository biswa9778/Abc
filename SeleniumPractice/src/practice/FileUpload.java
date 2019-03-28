package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.id("uploadfile_0")).sendKeys("F://empty1.doc");
		driver.findElement(By.xpath(".//*[@id='terms']")).click();
		driver.findElement(By.id("submitbutton")).click();

		
	}

}
