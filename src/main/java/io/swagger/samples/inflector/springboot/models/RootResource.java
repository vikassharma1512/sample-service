package io.swagger.samples.inflector.springboot.models;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Link;

import org.springframework.stereotype.Component;

@Component
public class RootResource implements Resource {

	private List<Link> links;

	public RootResource() {

		// TODO: instead of hard-coding these URLs, we should use the swagger
		links = new ArrayList<>();
		links.add(Link.valueOf(
				"<http://localhost:8080/api/v2/user>; rel=\"https://tomhoward.github.com/rels/user\"; title=\"User Details\""));
		links.add(Link.valueOf(
				"<http://localhost:8080/api/v2/accounts>; rel=\"https://tomhoward.github.com/rels/accounts\"; title=\"Accounts\""));
	}

	@Override
	public List<Link> getLinks() {
		return links;
	}

}
