package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import pageObjects.HomePage;
import pageObjects.OfferPage;
import utils.TestContextSetup;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Offer_PageStepDefinitions {

    TestContextSetup textcontext;
    OfferPage offerpage;
    HomePage home;
    public Offer_PageStepDefinitions(TestContextSetup textcontext){

        this.textcontext=textcontext;
    }

   public String offerProduct;


    @Then("User searched with same shortname in offerpage and check if product exists")
    public void user_searched_with_same_shortname_in_offerpage_and_check_if_product_exists() {

         offerpage=  new OfferPage(textcontext.driver);

        offerpage.goToOfferPage();
        SwitchtoWindow();
        offerpage.searchproduct(textcontext.shortname2);

        textcontext.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        offerProduct=offerpage.getOfferProduct();

        System.out.println(offerProduct);



    }


    @And("It will be validate and check if the product exist or not")
    public void Validate_And_CheckIf_TheProductExist_Or_Not() {

        home=new HomePage(textcontext.driver);

        Assert.assertEquals(home.getProductName(),offerpage.getOfferProduct());

    }


public void SwitchtoWindow(){
    Set<String> windnowshandles=textcontext.driver.getWindowHandles();
    Iterator<String> i1=windnowshandles.iterator();
    String ParentWindow= i1.next();
    String childWindow=i1.next();

    textcontext.driver.switchTo().window(childWindow);




}



}
