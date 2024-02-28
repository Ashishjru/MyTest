package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import pageObjects.HomePage;
import utils.TestContextSetup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class hooks {

    TestContextSetup textcontext;
    public hooks(TestContextSetup textcontext){

        this.textcontext=textcontext;
    }
     @After
     public void AfterScenario(){

        textcontext.driver.quit();

     }




}
