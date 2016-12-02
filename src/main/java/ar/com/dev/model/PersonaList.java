package ar.com.dev.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="personas")
public class PersonaList {
	private List<Persona> personas;
	
	public PersonaList() {
		
	}
	
	public PersonaList(List<Persona> personas) {
		this.personas = personas;
	}
	
	@XmlElement(name="persona")
	public List<Persona> getPersonaList() {
		return personas;
	}
}
