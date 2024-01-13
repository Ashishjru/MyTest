package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/register");
        
        String windowhandle1= driver.getWindowHandle();   /// use to store single id values
        System.out.println(windowhandle1);


        driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a")).click();


        Set<String> tabs_Id=driver.getWindowHandles();   // Used to store different id values

        List<String> lists=new ArrayList<>(tabs_Id);    //Convert into Arraylist to iterate easily

        String parentId=lists.get(0);
        String childId=lists.get(1);

        System.out.println("Parent Id is"+" "+parentId);
        System.out.println("Child Id id"+" "+childId);



        // How to switch to windows/ tabs

        driver.switchTo().window(parentId);           // In current page
        System.out.println(driver.getTitle());

        driver.switchTo().window(childId);             // In New page

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Thread.sleep(4000);

        WebElement popup= driver.findElement(By.xpath("//div[@aria-label=\"Close\"]"));

        if(popup.isDisplayed()){
            popup.click();
        }

        Thread.sleep(4000);
        System.out.println(driver.getTitle());






    }
       

}
