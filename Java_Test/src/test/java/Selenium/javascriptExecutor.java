package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/");

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");    // To scroll down

        Thread.sleep(4000);
        js.executeScript("window.scrollBy(0,-250)");    // To scroll up   =====negative value will be taken



    }
}
