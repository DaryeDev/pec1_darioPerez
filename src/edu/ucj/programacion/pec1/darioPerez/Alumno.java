package edu.ucj.programacion.pec1.darioPerez;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Alumno(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	public Alumno() {
		this.nombre = "";
		this.apellidos = "";
		this.dni = "";
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDni() {
		return this.dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String toString() {
		return this.nombre + " " + this.apellidos + " (" + this.dni + ")";
	}
}
