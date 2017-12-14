package io.swagger.samples.inflector.springboot.client;

import javax.ws.rs.core.Link;

import io.swagger.samples.inflector.springboot.models.Resource;

public interface SampleServiceClient {

	Resource getRoot();

	Resource followLink(Link link);

}
