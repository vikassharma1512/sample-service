package io.swagger.samples.inflector.springboot.models;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDetailsDaoImpl extends JdbcDaoSupport implements UserDetailsDao {

	@Override
	public String findUserLastName(String name) {
		String query = "select name from userdetails where name=?";
		Object[] inputs = new Object[] { name };
		String userLastName = getJdbcTemplate().queryForObject(query, inputs, String.class);
		return userLastName;
	}

	@Override
	public List<UserDetails> findAll() {

		String sql = "select * from userdetails";

		List<UserDetails> userDetails = getJdbcTemplate().query(sql,
				new BeanPropertyRowMapper<UserDetails>(UserDetails.class));

		return userDetails;
	}

}
