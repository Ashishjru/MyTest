package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver){

        this.driver=driver;
    }

    By searchbox= By.xpath("//input[@type='search']");
    By productname= By.cssSelector("h4.product-name");

   // By productname=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/h4");



    public void searchproduct(String name){

        driver.findElement(searchbox).sendKeys(name);
    }

    public String getProductName(){

        return driver.findElement(productname).getText();
    }


}
