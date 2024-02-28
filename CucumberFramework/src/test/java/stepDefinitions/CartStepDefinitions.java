package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.CartPage;
import pageObjects.HomePage;
import utils.TestContextSetup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CartStepDefinitions {

    TestContextSetup textcontext;
    CartPage cart;
    public CartStepDefinitions(TestContextSetup textcontext){

        this.textcontext=textcontext;
    }



    @When("^Select the (.+) of items in the cart$")
    public void select_the_of_items_in_the_cart( int i) {

        cart=new CartPage(textcontext.driver);
        cart.Addtocart();


    }
    @Then("^User processed to the checkout page and the product by (.+) in the cart$")
    public void user_processed_to_the_checkout_page_and_the_product_by_tom_in_the_cart() {
        cart.Clickoncartlogo();
        cart.processedToCheckOut();
    }
    @And("Check user is able to place an order or not")
    public void check_user_is_able_to_place_an_order_or_not() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






}
