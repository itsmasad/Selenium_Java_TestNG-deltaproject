package eurosoft.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import deltapages.delta;
import io.github.bonigarcia.wdm.WebDriverManager;

public final class Multipleintencesofchrome {
  // private static WebDriver driver = null;
  public static void main(String[] args) throws InterruptedException {

    WebDriverManager.chromedriver().setup();

    WebDriver driver1 = new ChromeDriver();
    WebDriver driver2 = new ChromeDriver();
    WebDriver driver3 = new ChromeDriver();
    WebDriver driver4 = new ChromeDriver();
    WebDriver driver5 = new ChromeDriver();
    WebDriver driver6 = new ChromeDriver();
    WebDriver driver7 = new ChromeDriver();
    WebDriver driver8 = new ChromeDriver();
    WebDriver driver9 = new ChromeDriver();
    WebDriver driver10 = new ChromeDriver();

    // Maximize The Window

    driver1.manage().window().maximize();
    driver2.manage().window().maximize();
    driver3.manage().window().maximize();
    driver4.manage().window().maximize();
    driver5.manage().window().maximize();
    driver6.manage().window().maximize();
    driver7.manage().window().maximize();
    driver8.manage().window().maximize();
    driver9.manage().window().maximize();
    driver10.manage().window().maximize();

    // Navigating to Url
    driver1.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");
    driver2.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");
    driver3.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");
    driver4.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");
    driver5.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");
    driver6.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");
    driver7.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");
    driver8.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");
    driver9.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");
    driver10.get("https://cabtreasurecloud5.com/Delta_Demo/Authentication/Index");

    // login to page via POM model

    // Entering email
    delta.login_textbox_username(driver1).sendKeys(delta.valid_email);
    delta.login_textbox_username(driver2).sendKeys(delta.valid_email);
    delta.login_textbox_username(driver3).sendKeys(delta.valid_email);
    delta.login_textbox_username(driver4).sendKeys(delta.valid_email);
    delta.login_textbox_username(driver5).sendKeys(delta.valid_email);
    delta.login_textbox_username(driver6).sendKeys(delta.valid_email);
    delta.login_textbox_username(driver7).sendKeys(delta.valid_email);
    delta.login_textbox_username(driver8).sendKeys(delta.valid_email);
    delta.login_textbox_username(driver9).sendKeys(delta.valid_email);
    delta.login_textbox_username(driver10).sendKeys(delta.valid_email);

    // Entering password
    delta.login_textbox_password(driver1).sendKeys(delta.valid_password);
    delta.login_textbox_password(driver2).sendKeys(delta.valid_password);
    delta.login_textbox_password(driver3).sendKeys(delta.valid_password);
    delta.login_textbox_password(driver4).sendKeys(delta.valid_password);
    delta.login_textbox_password(driver5).sendKeys(delta.valid_password);
    delta.login_textbox_password(driver6).sendKeys(delta.valid_password);
    delta.login_textbox_password(driver7).sendKeys(delta.valid_password);
    delta.login_textbox_password(driver8).sendKeys(delta.valid_password);
    delta.login_textbox_password(driver9).sendKeys(delta.valid_password);
    delta.login_textbox_password(driver10).sendKeys(delta.valid_password);

    // Clicking Login Button
    delta.login_button_login(driver1).click();
    delta.login_button_login(driver2).click();
    delta.login_button_login(driver3).click();
    delta.login_button_login(driver4).click();
    delta.login_button_login(driver5).click();
    delta.login_button_login(driver6).click();
    delta.login_button_login(driver7).click();
    delta.login_button_login(driver8).click();
    delta.login_button_login(driver9).click();
    delta.login_button_login(driver10).click();

    // Waiting for 10 seconds
    Thread.sleep(10000);

    // Closing the browser
    driver1.close();
    driver2.close();
    driver3.close();
    driver4.close();
    driver5.close();
    driver6.close();
    driver7.close();
    driver8.close();
    driver9.close();
    driver10.close();
  }
}