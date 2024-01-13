package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/register");



       WebElement dob= driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));

        Select dateofbirth=new Select(dob);

        dateofbirth.selectByValue("25");
        dateofbirth.selectByVisibleText("26");
        dateofbirth.selectByIndex(1);






    }
}
