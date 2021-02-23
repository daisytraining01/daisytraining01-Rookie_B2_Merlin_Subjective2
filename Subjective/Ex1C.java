package Subjective;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
public class Ex1C {
	@Test
	public static void captureScreenMethod() throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MERLIN\\eclipse-workspace\\Practice01\\src\\test\\resources\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	driver.navigate().refresh();
	driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Merlin");

	 

	driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("Elizabeth");

	 

	driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("9845678414");
	Thread.sleep(2000);        
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("merlinelizabeth6@gmail.com");

	 

	driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).sendKeys("XXXXXXXXXXXX");

	 

	driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("Coimbatore");
	Thread.sleep(2000);        
	driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("Tamil Nadu");

	 

	driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).sendKeys("6000028");

	 

	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Merlin");
	Thread.sleep(2000);        
	driver.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).sendKeys("Merlinr2@");

	 

	driver.findElement(By.xpath("//tbody/tr[15]/td[2]/input[1]")).sendKeys("Merlinr2@");
	Thread.sleep(2000);        

	 


	driver.findElement(By.name("submit"));
	WebElement login = driver.findElement(By.name("submit"));
	login.click();
	      

	File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(s, new File("E:\\register.png"));
		
			driver.quit();
	}
	
	}

