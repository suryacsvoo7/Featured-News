package com.cognizant.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features= "src\\test\\resources\\Features",
        glue="stepdefinations",
        plugin= {
        		"pretty", "html:reportsCucumber/myreport.html", 
        		"json:reportsCucumber/myreport.json"
        		},    //Mandatory to capture failures  
  
        tags = "@Sanity"	//Scenarios tagged with @sanity,
)

public class CucumberTestRunner {

}
