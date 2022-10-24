package eurosoft.com;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import deltapages.delta;

import io.github.bonigarcia.wdm.WebDriverManager;



public final class AddReservation {
  private static WebDriver driver = null;
    public static void main(String[] args) throws InterruptedException {
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


          //Maximize The Window
        driver.manage().window().maximize();

      // Navigating to Url
      driver.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");


      // login to page via POM model
      delta.login_textbox_username(driver).sendKeys(delta.valid_email);
      delta.login_textbox_password(driver).sendKeys("CD5S1wSKASV#Umc");
      delta.login_button_login(driver).click();
      System.out.println(driver.getTitle());


      // Navigating to the Add Reservation page
      Thread.sleep(5000);

      delta.nav_reservation(driver).click();
      delta.nav_addreservation(driver).click();

      // Boolean condition;
 
      // switching to iframe
      driver.switchTo().frame("iFrameTab_0");
 
      driver.findElement(By.xpath("//*[@id='stageDate']")).sendKeys("10/20/2022");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@id='frmAddReservation']/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/span/span")).click();
      
      Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@id='ddlAirportLocation_listbox']/li[5]")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@id='ddlBookingType']")).sendKeys("Ar");
      Thread.sleep(1000);
      // driver.findElement(By.xpath("//*[@id='stageTime']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@id='stageTime']")).sendKeys("02:30");
      

   
      Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@id='ddlServiceType']")).sendKeys("vip");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@id='ddlServiceType']")).sendKeys(Keys.TAB);
      Thread.sleep(1000);
      WebElement radioElement = driver.findElement(By.xpath("//*[@id='PassengerOver18Yes']"));

      radioElement.click();
      Thread.sleep(1000);
      driver.findElement(By.id("AgencyName")).sendKeys("asdfe");
      driver.findElement(By.id("ContactNo")).sendKeys("213");
      Thread.sleep(1000);
      driver.findElement(By.id("PointOfContact")).sendKeys("123");
      Thread.sleep(1000);
      driver.findElement(By.id("Email")).sendKeys("asdlfkj@gmail.com");
      Thread.sleep(1000);
      driver.findElement(By.id("PassengerName")).sendKeys("asdfasdf");
      Thread.sleep(1000);

      driver.findElement(By.id("PNRNo")).sendKeys("asdfasdf");
      // Thread.sleep(1000);
      // driver.findElement(By.xpath("//*[@id='ddlServiceType']")).click();
      Thread.sleep(1000);


      driver.findElement(By.xpath("//*[@id='btnAddMeeting']")).click();
      Thread.sleep(2000);
      for (int i = 0; i < 100; i++) {
        driver.findElement(By.xpath("//*[@id='stageDate']")).sendKeys("10/20/2022");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='frmAddReservation']/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/span/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='ddlAirportLocation_listbox']/li[5]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='ddlBookingType']")).sendKeys("Ar");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='stageTime']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='stageTime']")).sendKeys("02:30");
        Thread.sleep(1000);

      driver.findElement(By.xpath("//*[@id='btnAddMeeting']")).click();
      Thread.sleep(3000);
      
      } 
 Thread.sleep(5000);
 driver.findElement(By.xpath("//*[@id='btnAddReservation']")).click();
 
      

      // driver.quit();
 
     }   

}