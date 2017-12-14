# Sample Service

[![CircleCI](https://img.shields.io/circleci/project/github/tompahoward/sample-service.svg)](https://circleci.com/gh/tompahoward/workflows/sample-service)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/7785f1049bd045dda89fcfff65bff3da)](https://www.codacy.com/app/mountain-pass/ryvr?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=mountain-pass/ryvr&amp;utm_campaign=Badge_Grade)
[![license](https://img.shields.io/github/license/tompahoward/sample-service.svg)](https://github.com/tompahoward/sample-service/blob/master/LICENSE)

A simple sample server using Swagger Inflector with Spring Boot.

This project integrates both Spring Boot Actuator and the Spring Boot Jersey integration. Because Actuator is built upon SpringMVC, [Jersey and Actuator must listen on different end-points](http://docs.spring.io/spring-boot/docs/current/reference/html/howto-actuator.html#howto-use-actuator-with-jersey). Please see the `applictaion.yaml` for how this is accomplished. 

## Building

The project uses [Gradle](https://gradle.org/) for its build system and you can build the project by running:

	./gradlew build

## Running

You can also run the app using the [Spring Boot Gradle Plugin](http://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-gradle-plugin.html) like so: 

	./gradlew bootRun

The swagger definition will be available at the following URI:

[http://localhost:8080/api/v2/swagger.json](http://localhost:8080/api/v2/swagger.json)

The Spring Boot Actuator end-points are available here:

[http://localhost:8080/info](http://localhost:8080/info)
[http://localhost:8080/env](http://localhost:8080/env)

## IDE Integration

You can create project files for Eclipse or IDEA by running:

	./gradlew eclipse
	
or:

	./gradlew idea

## Testing

The project uses [Cucumber](https://cucumber.io/) with JUnit for testing. The feature files can be found in
`src/test/resources/features` and the JUnit runners can be found in the `io.swagger.samples.inflector.springboot.tests` package within `src/test/java`. Each test class runs the features with different Spring profiles.

You can run them individually as JUnit tests in your IDE or you can run them all by running

	./gradlew test

### Java API Testing

`InflectorApplicationJavaApiH2LocalWsTests.java` tests the application with direct Java method calls. This ensures that the
functional logic is correctly implemented and is not coupled to the controllers, so that the same logic can be exposed
via other mechanisms in the future.

### REST API Testing

`InflectorApplicationRestApiH2LocalWsTests.java` tests the application via REST calls. This ensures that the
functional logic is correctly exposed via the REST API, without changing that behaviour



Have fun!

