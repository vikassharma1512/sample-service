package io.swagger.samples.inflector.springboot.client.java;

import javax.ws.rs.core.Link;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import cucumber.api.PendingException;
import io.swagger.samples.inflector.springboot.client.SampleServiceClient;
import io.swagger.samples.inflector.springboot.models.Resource;
import io.swagger.samples.inflector.springboot.models.RootResource;
import io.swagger.samples.inflector.springboot.models.UserResource;

@Component
@Profile(value = { "javaApi" })
public class JavaSampleServiceClient implements SampleServiceClient {

	@Autowired
	private RootResource rootResource;

	@Autowired
	private UserResource userResource;

	@Override
	public Resource getRoot() {
		return rootResource;
	}

	@Override
	public Resource followLink(Link link) {
		switch (link.getUri().toString()) {
		case "http://localhost:8080/api/v2/user":
			return userResource;
		default:
			throw new PendingException("TODO");
		}

	}

}
