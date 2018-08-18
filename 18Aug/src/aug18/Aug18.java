package aug18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Aug18 {
@Test
void display()
{
	System.setProperty("webdriver.chrome.driver","E:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
	WebDriver dr= new ChromeDriver();
	dr.get("https://www.facebook.com");
	dr.manage().window().maximize();  
}
}
