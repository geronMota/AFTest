package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/jeffbdd/jeffbdd.html",
                             "json:target/jeffbdd/jeffbdd.json",
                             "junit:target/jeffbdd/jeffbdd.xml"}
)
public class RunnerTest {
}
