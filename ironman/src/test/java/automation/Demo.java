package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo {
	@Test
	
	public void demo() {
		
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com/");   
      System.out.println(driver.getTitle());
	}

}
