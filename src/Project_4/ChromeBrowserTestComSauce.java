package Project_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTestComSauce {
    static String baseUrl= "https://www.saucedemo.com/";

    public static void main(String[] args) {
        //Launch the chromewebdriver
        WebDriver driver= new ChromeDriver();
        //Open the url
        driver.get(baseUrl);
        //Maximize the browser automatically
        driver.manage().window().maximize();
        // waiting time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Title of the page
        System.out.println("Title of the page  : " + driver.getTitle());//driver.getTitle();
        //Print the page source
        System.out.println("The page source : " + driver.getPageSource());
        //email and password
        WebElement email=driver.findElement(By.id("user-name"));
        email.sendKeys("standard_user");
        WebElement pass=driver.findElement(By.id("password"));
        pass.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println("The current Url : "+ driver.getCurrentUrl());
        driver.navigate().refresh();
        driver.quit();
    }
}
