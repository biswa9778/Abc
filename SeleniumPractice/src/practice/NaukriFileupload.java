package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.event.KeyboardEvent;
import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class NaukriFileupload {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Later")).click();
		driver.findElement(By.id("input_resumeParser"));
		driver.findElement(By.id("input_resumeParser")).click();
		StringSelection s=new StringSelection("F:/empty1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.);
		

	}

}
