package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class BrokenLinks {

    public static void main(String[] args) throws IOException {

        int brokenlinks=0;
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> links=driver.findElements(By.tagName("a"));

        for(WebElement link:links){

           String url= link.getAttribute("href");

           if(url==null||url.isEmpty()){

               System.out.println("URL is empty");
               continue;
           }

           URL urls=new URL(url);

            HttpURLConnection httpconn= (HttpURLConnection) urls.openConnection();
            httpconn.connect();

            if(httpconn.getResponseCode()>400){

                System.out.println(httpconn.getResponseCode()+ " " +url+" "+"is a broken link");
                brokenlinks++;
            }
            else{
                System.out.println(httpconn.getResponseCode()+ " " +url+" "+"is a valid link");


            }

        }


System.out.println("The total number of broken links are"+" "+brokenlinks);

    }
}
