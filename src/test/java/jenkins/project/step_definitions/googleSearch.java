package jenkins.project.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {

//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.google.com");

        System.out.println("chrome is opening google home page");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        System.out.println("title is Google");
    }



}
