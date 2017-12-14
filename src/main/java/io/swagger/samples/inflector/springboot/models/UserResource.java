package io.swagger.samples.inflector.springboot.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserResource {
	@Autowired
	private JdbcTemplate jdbcTemplate;

}
