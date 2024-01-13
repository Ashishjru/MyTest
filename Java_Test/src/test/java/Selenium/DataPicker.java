package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DataPicker {

    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Datepicker.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();

        String mydate="10";
        String myMonth="July";
        String myYear="2024";

        while(true) {

            String month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
            String year = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();

            if(month.equals(myMonth) && year.equals(myYear)){
               break;

            }
            else {
                    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
            }
        }

        // now we need to elect the date

      List<WebElement> dates=  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));

        for(WebElement date:dates){

            String valueDate=date.getText();

            if(valueDate.equals(mydate)){

                date.click();
                break;
            }
        }

    }
}
