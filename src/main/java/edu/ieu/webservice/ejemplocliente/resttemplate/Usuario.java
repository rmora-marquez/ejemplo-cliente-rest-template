package edu.ieu.webservice.ejemplocliente.resttemplate;

public class Usuario {
	private Integer id;
	
	private String email;
	
	private String password;
	
	private String nombre;
	
	private String apellidos;
	
	public Usuario() {
		super();
	}
	
	public Usuario(Integer id, String email, String password, String nombre, String apellidos) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		 return "[id: " + id +
		",email: " + email +
		",password: " + password +
		",nombre: " + nombre +
		",apellidos: " + apellidos + "]";
	}
	
	
}
