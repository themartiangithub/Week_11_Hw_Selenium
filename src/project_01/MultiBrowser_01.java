package project_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowser_01 {

    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Chrome Browser.\nEnter 2 for FireFox Browser.\nEnter 3 for Edge Browser.");
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                driver = new ChromeDriver();
                break;
            case 2:
                driver = new FirefoxDriver();
                break;
            case 3:
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Enter valid number.");
        }

        //Open the Url
        driver.get(baseUrl);

        //Maximize browser
        driver.manage().window().maximize();

        //we give implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

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
        WebElement emailField = driver.findElement(By.id("Email"));

        //Type the email address to the email field element
        emailField.sendKeys("prime123@gmail.com");

        //Find the Password field Element
        WebElement passwordField = driver.findElement(By.name("Password"));

        //Type the email address to the email field element
        passwordField.sendKeys("Yk123");

        //Wait for 10 seconds
        Thread.sleep(10000);

        //Close the Browser
        driver.close();
    }
}
