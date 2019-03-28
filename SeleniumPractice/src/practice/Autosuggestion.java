package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autosuggestion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
WebElement w=driver.findElement(By.name("q"));
w.sendKeys("testing");
w.click();
List<WebElement> l=driver.findElements(By.xpath("//li[@role='presentation']"));
for(int i=0;i<l.size();i++)
{
WebElement	m=l.get(i);
String n=m.getText();
if(n.equals("testing tools"))
{
	w.clear();
	w.sendKeys((n),Keys.ENTER);
	//w.sendKeys(Keys.ENTER);

}

}

	}

}
