package Tst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestDemo {
	
	
	WebDriver driver  = null;
	
  @BeforeSuite
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  
	  driver  = new ChromeDriver();
	  
	  driver.get("https://www.bmw.in/en/");
	  
  }
  
  
  @Test(priority = 1)
  public void test() {
	  
	  
	  driver.get("https://www.bmw.in/en/all-models.html");
	  Assert.fail();
	  
  }
  
  

  @Test(priority = 2)
  public void test2() {
	  driver.get("https://www.bmw.in/en/topics/owners/joy-rewards.html");
	  System.out.println("pass");
	  
  }
  
  @AfterSuite
  public void after() {
	  
	  driver.close();
	  
  }  

}
