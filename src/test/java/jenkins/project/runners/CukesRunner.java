package jenkins.project.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber-report.json",
                "junit:target/cucumber-report.xml",


        },
        features = "src/test/resources/features",
        glue = "jenkins/project/step_definitions",
        dryRun = true,
        tags = "@google",
        publish = true     //when this is true, it will publish a report that will be valid for 24 hours



)
public class CukesRunner {

}
