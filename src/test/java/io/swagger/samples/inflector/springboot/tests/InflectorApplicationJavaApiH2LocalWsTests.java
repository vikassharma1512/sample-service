package io.swagger.samples.inflector.springboot.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.swagger.samples.inflector.springboot.SpringProfileCucumber;

@RunWith(SpringProfileCucumber.class)
@CucumberOptions(plugin = { "pretty",
		"json:build/test-results/test/cucumber/InflectorApplicationJavaApiH2LocalWsTests.json",
		"html:build/reports/tests/cucumber/InflectorApplicationJavaApiH2LocalWsTests" }, features = {
				"src/test/resources/features" }, strict = false, glue = {
						"io.swagger.samples.inflector.springboot" }, snippets = SnippetType.CAMELCASE)
@ActiveProfiles({ "integrationTest", "javaApi", "h2", "localWs" })
public class InflectorApplicationJavaApiH2LocalWsTests {

	@Test
	public void contextLoads() {
	}

}
