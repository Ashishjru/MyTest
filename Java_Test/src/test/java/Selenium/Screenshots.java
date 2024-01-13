package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshots {

    public static void main(String[] args) throws IOException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.co.in/");

        // Take screenshot and save to a specific location

        TakesScreenshot ts= (TakesScreenshot) driver;
        File org=ts.getScreenshotAs(OutputType.FILE);
        File target=new File("C:\\Users\\lorde\\IdeaProjects\\Java_Test\\Screenshots\\main.png");

        FileUtils.copyFile(org,target);

        // To take a screenshot of a specfic scetion

        WebElement section=driver.findElement(By.xpath("/html/body/div[1]/div[2]"));

         org=section.getScreenshotAs(OutputType.FILE);
         target=new File("C:\\Users\\lorde\\IdeaProjects\\Java_Test\\Screenshots\\logo.png");

        FileUtils.copyFile(org,target);



        driver.close();



    }
}
