package Subjective;

import java.io.File;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class Ex1A {

 

    public static void main(String[] args) throws InterruptedException {
        
        File file = new File("drivers/chromedriver.exe");
        String filePath = file.getAbsolutePath();
        System.out.println(filePath);
        System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MERLIN\\eclipse-workspace\\Practice01\\src\\test\\resources\\Driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();
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
Thread.sleep(3000);        

 

driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();
Thread.sleep(3000);        
driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("Merlin");
driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Merlin@123");
driver.findElement(By.name("submit"));
WebElement login1 = driver.findElement(By.name("submit"));
Thread.sleep(1000); 
login1.click();
Thread.sleep(1000); 
driver.quit();
}

 

        

 

    }

 
