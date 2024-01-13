package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseOperations {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));

        Actions act=new Actions(driver);
        act.contextClick(button).perform();  // To perform a right click



        try{
        act.doubleClick(button).perform();   // To perform double click

            }catch (Exception e){
           System.out.println( e.getMessage());
        }

        // To perform drag and drop opertaion----

        driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement rome=driver.findElement(By.id("box4"));   // It is a source
        WebElement norway=driver.findElement(By.id("box101")); // It is a target

        act.dragAndDrop(rome,norway).perform();

        // To perform mouse hover action

        driver.navigate().to("https://testsigma.com/blog/mouse-hover-in-selenium/");



        WebElement resources=driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div/nav/ul[1]/li[3]/span"));

        Thread.sleep(4000);

        driver.switchTo().alert().accept();

        act.moveToElement(resources).click().perform();
















    }
}
