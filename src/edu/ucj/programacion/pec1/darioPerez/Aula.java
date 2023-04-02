package edu.ucj.programacion.pec1.darioPerez;

public class Aula {
	private int numAula;
	private int numPlanta;
	private Alumno[] asientos = {null, null, null};
	
	public Aula(int numAula, int numPlanta, Alumno[] asientos) {
		this.numAula = numAula;
		this.numPlanta = numPlanta;
		this.asientos = asientos;
		
	}
	public Aula(int numAula, int numPlanta) {
		this.numAula = numAula;
		this.numPlanta = numPlanta;
		
	}
	public int getNumAula() {
		return this.numAula;
	}
	public void setNumAula(int numAula) {
		this.numAula = numAula;
	}
	
	public int getNumPlanta() {
		return this.numPlanta;
	}
	public void setNumPlanta(int numPlanta) {
		this.numPlanta = numPlanta;
	}
	
	public Alumno[] getAsientos() {
		return this.asientos;
	}
	public void setAsientos(Alumno[] asientos) {
		this.asientos = asientos;
	}
	public Alumno getAsiento(int numAsiento) {
		return this.asientos[numAsiento];
	}
	public void setAsiento(int numAsiento, Alumno alumno) {
		this.asientos[numAsiento] = alumno;
	}
	
	public String toString() {
		return "Aula "+ this.numAula + "(Planta " + this.numPlanta + ")";
	}
}
