package Subjective;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Ex4 {
    @Test    
    public void Driver1(){
           
    	try {
    	 System.setProperty("webdriver.chrome.driver",
 				"C:\\Users\\MERLIN\\eclipse-workspace\\SubjectiveActivity02\\src\\test\\resources\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            driver.findElement(By.name("password")).sendKeys("Driver 1");
            Thread.sleep(2000);
    	}catch(InterruptedException e) {
    		System.out.println(e);
    	} 
        }
        
    @Test    
        public void Driver2(){
            
    	try {
    	 System.setProperty("webdriver.gecko.driver","C:\\Users\\MERLIN\\eclipse-workspace\\SubjectiveActivity02\\src\\test\\resources\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        driver.findElement(By.name("password")).sendKeys("Driver 2");
        Thread.sleep(2000);
	}catch(InterruptedException e) {
		System.out.println(e);
	} 
        }
        
	
}
