package Subjective;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
public class Ex1B {
	 public static void main(String[] args) { 
         System.setProperty("webdriver.chrome.driver","C:\\Users\\MERLIN\\eclipse-workspace\\Practice01\\src\\test\\resources\\Driver\\chromedriver.exe");
         String baseURL = "http://demo.guru99.com/test/newtours/register.php";
         WebDriver driver = new ChromeDriver();
         driver.get(baseURL);
         Select drpCountry = new Select(driver.findElement(By.name("country")));
         drpCountry.selectByVisibleText("ANTARCTICA");            
         WebElement dropdown = driver.findElement(By.name("country")); 
         Select select = new Select(dropdown); 
        java.util.List<WebElement> options = select.getOptions(); 
         for(WebElement item:options) 
         { 
              System.out.println("Dropdown values are "+ item.getText());          
            }
         select.getOptions();
         driver.quit();
  }
 
}

