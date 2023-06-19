package project_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Project_02 {
    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Open the Url into browser
        driver.get(baseUrl);

        //Maximize browser
        driver.manage().window().maximize();

        //we give implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page title is " + title);

        //Get current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL " +currentUrl );

        //Get page source
        String pagesource = driver.getPageSource();
        System.out.println("Page Source :" + pagesource);

        //Find the Email field Element
        WebElement emailField = driver.findElement(By.name("username"));

        //Type the email address to the email field element
        emailField.sendKeys("prime123@gmail.com");

        //Find the Password field Element
        WebElement passwordField = driver.findElement(By.name("password"));

        //Type the email address to the email field element
        passwordField.sendKeys("Yk123");

        //Wait for 10 seconds
        Thread.sleep(10000);

        //Close the Browser
        driver.close();

    }
}
