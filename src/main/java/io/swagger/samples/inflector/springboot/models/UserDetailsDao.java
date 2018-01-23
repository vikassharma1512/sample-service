package io.swagger.samples.inflector.springboot.models;

import java.util.List;

public interface UserDetailsDao {

	public String findUserLastName(String name);

	List<UserDetails> findAll();

}
