package testrunners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

//import com.cucumber.listener.Reporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/features"},
		glue = {"stepdefinitions","AppHooks"},
		plugin = {"pretty",
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"},
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome = true
		)
public class MyTestRunner {
	@AfterClass
    public static void writeExtentReport() {
        //Reporter.loadXMLConfig(new File("config/report.xml"));
    

	}
}

//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}