package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Test {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/");
        Thread.sleep(4000);
        String Title= driver.getTitle();

        System.out.println(Title);

        driver.close();


    }




}
