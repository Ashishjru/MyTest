package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import utils.TestContextSetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class HomeStepDefinitions {

    TestContextSetup textcontext;
    public HomeStepDefinitions(TestContextSetup textcontext){

        this.textcontext=textcontext;
    }

   public String productName;

    @Given("User is on greenKart landing page")
    public void user_is_on_green_kart_landing_page() throws InterruptedException, IOException {


        try (FileInputStream stream = new FileInputStream("C:\\Users\\lorde\\IdeaProjects\\CucumberFramework\\src\\test\\java\\Resources\\Project.properties")) {
            Properties prop = new Properties();
            prop.load(stream);
        }



        WebDriverManager.chromedriver().setup();
        textcontext.driver=new ChromeDriver();

        textcontext.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        textcontext.driver.manage().window().maximize();
        Thread.sleep(4000);

    }
    @When("^User searched with ShortName (.+) and extracted the actual product name$")
    public void user_searched_with_short_name_and_extracted_the_actual_product_name(String shortname) throws InterruptedException {

        HomePage home=new HomePage(textcontext.driver);
        textcontext.shortname2=shortname;
        home.searchproduct(shortname);
        Thread.sleep(10000);

        productName= home.getProductName().split("-")[0].trim();
        System.out.println(productName);
    }







}
