
package io.swagger.samples.inflector.springboot.controllers;

import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import io.swagger.samples.inflector.springboot.models.RootResource;

@Component
public class Default {

	@Autowired
	RootResource root;

	public ResponseContext getApiRoot(RequestContext requestContext) {
		ResponseContext rval = new ResponseContext().status(Status.OK).entity("");
		MultivaluedMap<String, String> headers = rval.getHeaders();
		headers.add(HttpHeaders.LINK, root.getLinks().stream().map(Object::toString).collect(Collectors.joining(",")));
		return rval;
	}

	public ResponseContext getUserDetails(RequestContext request) {
		throw new NotImplementedException("TODO");
	}
	//
	// Faker faker = new Faker();
	//
	// public ResponseContext getPetById(RequestContext requestContext, Long id)
	// {
	// Pet pet = new Pet();
	// pet.setId(id);
	// pet.setCategory(new Category(16, faker.cat().breed()));
	// pet.setName(faker.cat().name());
	// pet.getTags().add(new Tag(21,faker.cat().registry()));
	// pet.setStatus("active");
	// return new ResponseContext().status(Status.OK)
	// .entity(pet);
	// }
	//
	//
	// public ResponseContext addPet(RequestContext request, Pet body) {
	// return new ResponseContext()
	// .status(Status.OK)
	// .entity(body);
	// }
	//
	// public ResponseContext uploadFile(RequestContext request, Long petId,
	// String additionalMetadata, java.io.InputStream file) {
	// ByteArrayOutputStream outputStream;
	// try {
	// outputStream = new ByteArrayOutputStream();
	// IOUtils.copy(file, outputStream);
	// outputStream.close();
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// return null;
	// }
}
