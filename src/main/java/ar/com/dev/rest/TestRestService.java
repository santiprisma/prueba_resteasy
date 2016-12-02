package ar.com.dev.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlElementWrapper;

import ar.com.dev.model.Persona;
import ar.com.dev.model.PersonaList;

@Path("ws")
public class TestRestService {

	@GET
	@Path("/message/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "Restful example : " + msg;

		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/personas")
	@XmlElementWrapper(name="personas")
	public Response getPersonas() {
        List<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona(1, "Juan", "Perez", 29));
        personas.add(new Persona(2, "Maria", "Lopez", 49));
        personas.add(new Persona(3, "Ariel", "Gonzalez", 72));
        
        //GenericEntity<List<Persona>> ge = new GenericEntity<List<Persona>>(personas) {};
        GenericEntity<PersonaList> ge = new GenericEntity<PersonaList>(new PersonaList(personas)) {};
        return Response.status(200).entity(ge).build();
	}
}