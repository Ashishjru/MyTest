package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class navigate_function {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/register");
//        driver.navigate().to("https://snapdeal.com/");

//        driver.navigate().back();
//        driver.navigate().forward();
//
//        driver.navigate().refresh();

        WebElement link=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);// It will scroll down



        List<WebElement>lists=  driver.findElements(By.xpath("//div[@class='footer-upper']//a"));

   System.out.println("Total links are ="+" "+lists.size());

   for(WebElement e:lists){

      System.out.println(e.getText());
   }


  driver.close();

    }
}


