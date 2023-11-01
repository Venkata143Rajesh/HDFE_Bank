package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Test_01 {
	public WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	//  WebDriverManager.chromedriver().setup();
	 WebDriverManager.firefoxdriver().setup();
	 // driver = new ChromeDriver();
	 driver = new FirefoxDriver();
	  driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.3");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
