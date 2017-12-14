package io.swagger.samples.inflector.springboot.models;

import java.util.List;

import javax.ws.rs.core.Link;

public interface Resource {

	List<Link> getLinks();

}
