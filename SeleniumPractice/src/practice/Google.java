package practice;//open google and verify that title is google or not and check wheather user has redirected to google.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		String s=driver.getTitle();
if	(s.equalsIgnoreCase("google"))
	{
	System.out.println("true");
	}
else
{
	System.out.println("false");
}
String st=driver.getCurrentUrl();

if(st.contains("google"))
{
System.out.println("true");
}
else
{
	System.out.println("false");;
}

	}

}
