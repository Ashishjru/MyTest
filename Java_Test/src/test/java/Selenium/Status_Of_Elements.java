package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Status_Of_Elements {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        // To check isDisplayed & isEnabled function

        WebElement searchbar=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
         System.out.println("DisplayStatus"+" "+ searchbar.isDisplayed());
        System.out.println("EnableStatus"+" "+ searchbar.isEnabled());

        // To check is selected or not

        WebElement gender_option= driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));

        gender_option.click();

        System.out.println("Male option is selected"+" "+gender_option.isSelected());


        driver.close();

}
    }
