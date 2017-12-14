package io.swagger.samples.inflector.springboot.client.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import io.swagger.samples.inflector.springboot.client.SampleServiceClient;
import io.swagger.samples.inflector.springboot.models.Resource;
import io.swagger.samples.inflector.springboot.models.RootResource;

@Component
@Profile("javaApi")
public class JavaSampleServiceClient implements SampleServiceClient {

	@Autowired
	private RootResource rootResource;

	@Override
	public Resource getRoot() {
		return rootResource;
	}

}
