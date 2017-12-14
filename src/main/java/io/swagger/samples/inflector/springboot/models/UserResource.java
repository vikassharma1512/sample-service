package io.swagger.samples.inflector.springboot.models;

import java.util.List;

import javax.ws.rs.core.Link;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserResource implements Resource {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Link> getLinks() {
		throw new NotImplementedException("TODO");
	}

}
