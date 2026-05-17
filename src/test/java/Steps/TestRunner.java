package Steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue = {"Steps"}, 

tags = "@LoginTest",
plugin = {"pretty", "html:target/HtmlReports/reports.html", "json:target/JSONReports/reports.json"})
//"junit:target/JUNITReports/junitreports.xml", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
	//monochrome = true, was added in line 8	
//tags="@smoketest" : this will run only that feature file which has this tag) 
//above one is used to locate feature files and monochrome = true, Clean, readable logs, No weird symbols like
//HTML Report: plugin = {"pretty", "html:target/HtmlReports/reports.html"}) This will create a report in Target > HtmlReports>Reports.html
//JSON Report plugin = {"pretty", "json:target/JSONReports/reports.JSON"})
//tag will look for the file in feature file and then feature's given, when and then will use the steps tp exeecute
//Navigate to your project directory:
//cd C:\Users\nikhi\eclipse-workspace\CucumberSelenium
//Run this command: allure serve allure-results

public class TestRunner {
	
}
