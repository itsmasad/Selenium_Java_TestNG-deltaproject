package eurosoft.com;


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
         driver.get("https://www.youtube.com");
 
     }   

}
