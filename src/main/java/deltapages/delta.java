package deltapages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class delta {

    // ***Login page***
    
    private static WebElement element = null;

    // Username
    public static WebElement login_textbox_username(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id='UserName']"));
        return element;
    };

    // Password
    public static WebElement login_textbox_password(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id='Password']"));
        return element;
    }

    // Login button
    public static WebElement login_button_login(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        return element;
    }

    // ***Navigation***

    // Reservation
    public static WebElement nav_reservation(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id='navbarDropdownMenuLink']"));
        return element;
    } 
    // Add Reservation
    public static WebElement nav_addreservation(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id='addreservation']"));
        return element;
    } 


    // ***Add Reservation Page***

    public static WebElement addreservation_meeting_date(WebDriver driver){

        return element;
    } 
}
