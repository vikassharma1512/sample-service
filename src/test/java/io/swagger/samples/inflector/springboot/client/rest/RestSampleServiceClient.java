package io.swagger.samples.inflector.springboot.client.rest;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import cucumber.api.PendingException;
import io.swagger.samples.inflector.springboot.client.SampleServiceClient;
import io.swagger.samples.inflector.springboot.models.Resource;

@Component
@Profile("restApi")
public class RestSampleServiceClient implements SampleServiceClient {

	@Override
	public Resource getRoot() {
		throw new PendingException("TODO");
	}

}
