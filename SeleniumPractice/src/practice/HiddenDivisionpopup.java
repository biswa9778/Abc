package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class HiddenDivisionpopup {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://demo.actiTime.com");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("(//div[@class='label'])[2]")).click();
	driver.findElement(By.className("addNewButton")).click();
//	Thread.sleep(2000);
	//WebElement e=driver.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']"));
	//Select s=new Select(e);
	//s.selectByVisibleText("+ New Customer");
	driver.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
	driver.findElement(By.id("customerLightBox_nameField")).sendKeys("biswaje");
	driver.findElement(By.id("customerLightBox_commitBtn")).click();
    driver.findElement(By.className("addNewButton")).click();
    driver.findElement(By.xpath("html/body/div[13]/div[2]")).click();
    driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("c");
    driver.findElement(By.id("projectPopup_commitBtn")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[.='Add New Task']")).click();
	}

}
