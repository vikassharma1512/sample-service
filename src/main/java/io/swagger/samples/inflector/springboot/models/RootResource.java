package io.swagger.samples.inflector.springboot.models;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Link;

import org.springframework.stereotype.Component;

@Component
public class RootResource implements Resource {

	private List<Link> links;

	public RootResource() {
		links = new ArrayList<>();
		links.add(Link.valueOf("</user>; rel='https://tomhoward.github.com/rels/user'; title=User Details"));
		links.add(Link.valueOf("</accounts>; rel='https://tomhoward.github.com/rels/accounts'; title=Accounts"));
	}

	@Override
	public List<Link> getLinks() {
		return links;
	}

}
