package io.swagger.samples.inflector.springboot.client.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import io.swagger.samples.inflector.springboot.client.SampleServiceClient;
import io.swagger.samples.inflector.springboot.models.Resource;
import net.minidev.json.JSONObject;

@Component
@Profile("restApi")
public class RestSampleServiceClient implements SampleServiceClient {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Resource getRoot() {
		ResponseEntity<JSONObject> response = restTemplate.getForEntity("http://localhost:8080/api/v2",
				JSONObject.class);
		return new RestResource(response);
	}

}
