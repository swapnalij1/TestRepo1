package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {

WebDriver driver;
	
    @BeforeTest
	@Parameters("browser")
	public void init(String browser)
	{
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		else if(browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
			 driver = new EdgeDriver();
			
		}
		else System.out.println("Invalid Browser");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	@Test
	public void test1()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	
	
	
	
	
}

