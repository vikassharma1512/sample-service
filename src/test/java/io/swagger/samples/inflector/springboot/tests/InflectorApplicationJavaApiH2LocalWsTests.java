package io.swagger.samples.inflector.springboot.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import cucumber.api.CucumberOptions;
import io.swagger.samples.inflector.springboot.SpringProfileCucumber;

@RunWith(SpringProfileCucumber.class)
@CucumberOptions(plugin = { "pretty",
		"json:build/test-results/test/cucumber/InflectorApplicationJavaApiH2LocalWsTests.json",
		"html:build/reports/tests/cucumber/InflectorApplicationJavaApiH2LocalWsTests" }, features = {
				"src/test/resources/features" }, strict = false, glue = { "io.swagger.samples.inflector.springboot" })
@ActiveProfiles({ "integrationTest", "javaApi", "h2", "localWs" })
@SpringBootTest
public class InflectorApplicationJavaApiH2LocalWsTests {

	@Test
	public void contextLoads() {
	}

}
