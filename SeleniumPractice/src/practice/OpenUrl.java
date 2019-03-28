package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println(driver.getTitle());

		driver.close();
		
	}

}
