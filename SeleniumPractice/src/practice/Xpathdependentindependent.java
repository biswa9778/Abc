package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdependentindependent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();

	}

}
