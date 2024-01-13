package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Handle {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

        Thread.sleep(4000);


        /*
        driver.findElement(By.xpath("//*[@id=\"alertexamples\"]")).click();

        Thread.sleep(4000);

        driver.switchTo().alert().accept();           //To just accept the alert box

         */

        /*

        driver.findElement(By.xpath("//*[@id=\"confirmexample\"]")).click();
        Thread.sleep(3000);


        //driver.switchTo().alert().accept();       //To accept and reject the alert
        driver.switchTo().alert().dismiss();


         */

        driver.findElement(By.xpath("//*[@id=\"promptexample\"]")).click();

        driver.switchTo().alert().sendKeys("No");
        driver.switchTo().alert().accept();














        //   driver.close();






    }
}
