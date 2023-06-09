package jenkins.project.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cucumber-.xml"


        },
        features = "src/test/resources/features",
        glue = "jenkins/project/step_definitions",
        dryRun = false,
        tags = "@google",
        publish = true     //when this is true, it will publish a report that will be valid for 24 hours



)
public class CukesRunner {

}
