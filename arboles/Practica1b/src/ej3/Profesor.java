package ej3;

public class Profesor {
	private String nombre;
	private String apellido;
	private String email;
	private String catedra;
	private String facultad;
	
	/*public Profesor(String unNombre, String unApellido, String unEmail, String unaCatedra, String unaFacultad {
		this.nombre = unNombre;
		this.apellido = unApellido;
		this.email = unEmail;
		this.catedra = unaCatedra;
		this.facultad = unaFacultad;
	}*/

	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}
	
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	
	//GETTERS
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public String getEmail() {
		return email;
	}
	
	public String getCatedra() {
		return catedra;
	}

	public String getFacultad() {
		return facultad;
	}

	@Override
	public String toString() {
		return "[Nombre=" + getNombre() + ", Apellido=" + getApellido() + ", Email="
				+ getEmail() + ", Catedra=" + getCatedra() + ", Facultad=" + getFacultad() + "]\n";
	}
}
