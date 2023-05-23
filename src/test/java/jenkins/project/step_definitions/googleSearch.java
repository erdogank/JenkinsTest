package jenkins.project.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class googleSearch {

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() throws MalformedURLException {
        RemoteWebDriver driver = new ChromeDriver();

        String gridAddress = "52.55.145.210";
        URL url = new URL("http://" + gridAddress + ":4444/wd/hub");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");
        driver = new RemoteWebDriver(url, desiredCapabilities);



        driver.get("https://www.google.com");

        System.out.println("chrome is opening google home page");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        System.out.println("title is Google");
    }



}
