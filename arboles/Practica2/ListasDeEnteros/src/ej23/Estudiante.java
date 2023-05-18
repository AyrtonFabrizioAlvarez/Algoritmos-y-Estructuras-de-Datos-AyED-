package ej23;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int comision;
	private String email;
	private String direccion;
	
	public Estudiante(String unNombre, String unApellido, int unaComision, String unEmail, String unaDireccion) {
		this.nombre = unNombre;
		this.apellido = unApellido;
		this.comision = unaComision;
		this.email = unEmail;
		this.direccion = unaDireccion;
	}

	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setComision(int comision) {
		this.comision = comision;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	//GETTERS
	
	public String getNombre() {
		return nombre;
	}
	
	public int getComision() {
		return comision;
	}
	
	public String getApellido() {
		return apellido;
	}

	public String getEmail() {
		return email;
	}

	public String getDireccion() {
		return direccion;
	}

	@Override
	public String toString() {
		return "[Nombre=" + getNombre() + ", Comision=" + getComision() + ", Apellido="
				+ getApellido() + ", Email=" + getEmail() + ", Direccion=" + getDireccion() + "]\n";
	}

	
	//OTROS
	
}
