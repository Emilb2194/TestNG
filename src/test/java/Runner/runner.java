package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features= "src/test/resources/features"
        ,glue = "Steps"
        ,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        ,monochrome = true
        ,publish = true
        ,tags ="@IniciarCompra"
)


public class runner extends AbstractTestNGCucumberTests  {
}
