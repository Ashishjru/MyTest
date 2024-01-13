package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Webtable_Static {


    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://cosmocode.io/automation-practice-webtable/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

      int row= driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr")).size();
      System.out.println("Total no of rows"+" "+row);

      int column=driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td")).size();
      System.out.println("Total No of columns"+" "+column);


      // Now to retrieve a data from a specific column and row

        int r=3;
        int c=2;
        System.out.println(driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[2]/td[2]")).getText());


        // To get a specific data from row/coulmn,we need to pass the variable in Xpath
        System.out.println(driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+r+"]/td["+c+"]")).getText());



        // Now if you want to print all the data, simply iterate through two loop


        for(int ro=2;ro<=row;ro++){

            for(int col=2;col<=column;col++){

                String value=driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+ro+"]/td["+col+"]")).getText();
                System.out.print(value+" ");


            }
            System.out.println();


        }

    }

}
