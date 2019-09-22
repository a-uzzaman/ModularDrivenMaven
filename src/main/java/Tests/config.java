package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class config {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome,driver",System.getProperty("user.dir")+"\\Drivers");
	  driver=new ChromeDriver();
	  
	  driver.get("https:\\www.facebook.com");
  }
  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
