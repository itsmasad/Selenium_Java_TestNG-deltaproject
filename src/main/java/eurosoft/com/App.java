package eurosoft.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * Hello world!
 */
public final class App {
    public static void main(String[] args) {
        
        // WebDriver driver =
        WebDriverManager.chromedriver().setup();
 
         WebDriver driver = new ChromeDriver();




          //Maximize The Window
        driver.manage().window().maximize();

        // Navigating to Url
        driver.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");

        // Login 
        driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("khawar@eurosofttech.co.uk");
        driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("CD5S1wSKASV#Umc");
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();

        System.out.println(driver.getTitle());




        

        // driver.quit();
 
     }   

}
