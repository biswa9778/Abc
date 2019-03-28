package practice;       //check  all checkboxes

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssPrinAlltlines {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		driver.get("file:///F:/qspiderjava1/Frames/MultipleCheckbox.html");
	List<WebElement> l=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(l.size());
		
		for(int i=0;i<l.size();i++)
		{
			WebElement f=l.get(i);
f.click();		
		}
		

	}

}
