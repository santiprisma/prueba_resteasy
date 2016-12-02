package ar.com.dev.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "xzxzaxa")
public class Persona {
	private Integer id;
	private String nombre;
	private String apellido;
	private Integer edad;
	
	public Persona() {
		
	}
	
	public Persona(Integer id, String nombre, String apellido, Integer edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	@XmlElement
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@XmlElement
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@XmlElement
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@XmlElement
	public Integer getEdad() {
		return edad;
	}
	
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
}
