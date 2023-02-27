package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		                          tags=  "@csr-587 ",
		                          features = { "src/test/java/features/" },
                                  glue ={"bdd.Nissan.Base", "stepdefination"},
                                  monochrome = false,
                                  dryRun = true,
                                  plugin= {"pretty", "html:target/report.html", "json:target/report_json.json","junit:target/report.xml"})

public class TestRunner {
 
}

