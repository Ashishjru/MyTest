package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class Handle_Checkbox {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       WebElement hobbies= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[6]/div"));

      System.out.println(hobbies.getText());

     List<WebElement> list= driver.findElements(By.xpath("//input[@type='checkbox']"));

     System.out.println(list.size());

     String choice="Cricket";

     for(WebElement values:list){

        String hobby= values.getAttribute("value");

        if(hobby==choice){

         values.click();
        }
     }

          
      }
      

    }
