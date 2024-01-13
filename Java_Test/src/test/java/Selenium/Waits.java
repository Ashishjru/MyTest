package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.co.in/");
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium");
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);


        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));    // To apply explixit wait, use Webdriverwait instance
      WebElement element= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")));
       element.click();

    }
}
