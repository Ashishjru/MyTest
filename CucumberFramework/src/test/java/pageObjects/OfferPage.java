package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
    WebDriver driver;
    public OfferPage(WebDriver driver){

        this.driver=driver;
    }

    By searchbox= By.xpath("//input[@type='search']");
    By offerpage= By.xpath("//a[@href='#/offers']");
    By offerProduct=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/table/tbody/tr/td[1]");


    public void searchproduct(String name){

        driver.findElement(searchbox).sendKeys(name);
    }

    public void goToOfferPage(){

        driver.findElement(offerpage).click();
    }

    public String getOfferProduct(){
        return  driver.findElement(offerProduct).getText();

    }


}
