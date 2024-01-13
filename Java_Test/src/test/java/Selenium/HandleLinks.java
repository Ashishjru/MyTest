package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleLinks {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> links=driver.findElements(By.tagName("a"));          //used to get links and store it in list

        System.out.println(links.size());

        /*
        for(WebElement link :links){                                 // This block is used to print the link and their names

            System.out.println(link.getAttribute("href"));
            System.out.println(link.getText());


        }
        */



    }
}
