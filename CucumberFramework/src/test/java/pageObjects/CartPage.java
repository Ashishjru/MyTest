package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    public CartPage(WebDriver driver){

        this.driver=driver;
    }

    By Addtocartbutton=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button");
    By cartlogo=By.xpath("//img[@alt=\"Cart\"]");
    By processedToCheckoutbutton=By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button");


    public void Addtocart(){

        int i=1;
        driver.findElement(Addtocartbutton).click();
    }

    public void Clickoncartlogo(){

        driver.findElement(cartlogo).click();
    }

    public void processedToCheckOut(){

        driver.findElement(processedToCheckoutbutton).click();
    }









}
