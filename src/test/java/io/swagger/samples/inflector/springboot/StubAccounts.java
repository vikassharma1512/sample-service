package io.swagger.samples.inflector.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class StubAccounts {

	private List<Map<String, String>> accounts = new ArrayList<>();

	public void setAccounts(List<Map<String, String>> accounts) {
		this.accounts = accounts;
	}

}
