import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
  
public class example {  
  
    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("http://localhost:8081/simple-calc");  
          
    
          
    // Click on the male button  
    driver.findElement(By.id("var1")).click();
    driver.findElement(By.id("var2")).click(); 
     // you can do as many types of tests this is just a basic one  
    }      

      
    }  
