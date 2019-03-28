package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Singlemultiselect {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///F:/qspiderjava1/Frames/MultiDropdownlist.html");
WebElement w=driver.findElement(By.tagName("select"));
Select sel=new Select(w);
Boolean type=sel.isMultiple();
System.out.println(type);


	}

}
