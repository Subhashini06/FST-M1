package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        tags = "@SimpleAlert",
        plugin = {"json:target/test-reports/json-report.json"},
        monochrome = true
)

public class ActivityRunner {

}
