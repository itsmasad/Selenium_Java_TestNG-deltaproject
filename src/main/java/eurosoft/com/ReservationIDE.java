package eurosoft.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import deltapages.delta;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;




public final class ReservationIDE {
  private static WebDriver driver = null;
    public static void main(String[] args) throws InterruptedException {
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


          //Maximize The Window
        driver.manage().window().maximize();


        // Navigating to Url
      driver.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");


      // login to page via POM model
      delta.login_textbox_username(driver).sendKeys(delta.email);
      delta.login_textbox_password(driver).sendKeys("CD5S1wSKASV#Umc");
      delta.login_button_login(driver).click();
      System.out.println(driver.getTitle());


      // Navigating to the Add Reservation page
      Thread.sleep(5000);



            driver.get("https://cabtreasurecloud5.com/Delta_Demo/Dashboard/Index");





            driver.manage().window().setSize(new Dimension(1833, 1020));
    driver.findElement(By.id("navbarDropdownMenuLink")).click();
    driver.findElement(By.id("addreservation")).click();
    driver.switchTo().frame(0);
    driver.findElement(By.cssSelector(".k-i-calendar")).click();
    driver.findElement(By.linkText("20")).click();
    driver.findElement(By.cssSelector(".k-i-arrow-60-down")).click();
    driver.findElement(By.cssSelector(".k-state-hover")).click();
    driver.findElement(By.id("ddlBookingType")).click();
    {
        WebElement dropdown = driver.findElement(By.id("ddlBookingType"));
        dropdown.findElement(By.xpath("//option[. = 'Departure']")).click();
      }

    //   driver.close();

    }
}