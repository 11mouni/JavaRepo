package window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class common {

	public static WebDriver driver ;
	public static WebDriver launchBrowser()
	{
     return driver = new ChromeDriver();
    
	}

	public static void openurl(String u)
	{
		 	
		System.out.println(u);
		driver.get(u);
	}
	
}
