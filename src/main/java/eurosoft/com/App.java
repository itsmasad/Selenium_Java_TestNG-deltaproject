package eurosoft.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import deltapages.delta;
import io.github.bonigarcia.wdm.WebDriverManager;

public final class App {
  private static WebDriver driver = null;

  public static void main(String[] args) throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

    // Maximize The Window
    driver.manage().window().maximize();

    // Navigating to Url
    driver.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");

    // login to page via POM model
    delta.login_textbox_username(driver).sendKeys(delta.valid_email);
    delta.login_textbox_password(driver).sendKeys(delta.valid_password);
    delta.login_button_login(driver).click();
    System.out.println(driver.getTitle());

    // Navigating to the Add Reservation page
    Thread.sleep(5000);

    delta.nav_reservation(driver).click();
    delta.nav_addreservation(driver).click();

    Boolean condition;

    // switching to iframe
    driver.switchTo().frame("iFrameTab_0");

    if (driver.findElements(By.xpath("//*[@id='stageDate']")).size() > 0) {
      // Add the if code here
      condition = true;

    } else {
      condition = false;

    }

    System.out.println(condition);

    Assert.assertEquals(condition, true);

    // driver.quit();

  }

}