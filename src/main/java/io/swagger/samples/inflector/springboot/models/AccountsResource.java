package io.swagger.samples.inflector.springboot.models;

import java.util.List;

import javax.ws.rs.core.Link;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

@Component
public class AccountsResource implements Resource {
  @Autowired
  private WebServiceTemplate wsTemplate;

  @Override
  public List<Link> getLinks() {
    throw new NotImplementedException("TODO");
  }

}
