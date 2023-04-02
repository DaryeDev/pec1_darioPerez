package edu.ucj.programacion.pec1.darioPerez;

public class Colegio {
	private String nombre; 
	private String direccion; 
	private Aula[] aulas;

	public Colegio(String nombre, String direccion, Aula[] aulas) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = aulas;
	}
	public void addAlumno(Alumno alumno) {
		boolean alreadyAdded = false;
		for (int i = 0; i < aulas.length; i++) {
			Aula aula = aulas[i];
			for (int j = 0; j < aula.getAsientos().length; j++) {
				Alumno alumnoInAula = aula.getAsientos()[j];
				if (alumnoInAula == null) {
					System.out.println("El alumno "+alumno+ " se sienta en " + aula + ", asiento "+ (j+1));
					aula.setAsiento(j, alumno);
					alreadyAdded = true;
					break;
				}
			}
			if (alreadyAdded) {
				break;
			}
		}
		if (!alreadyAdded) {
			System.out.println("El alumno "+alumno+" no cabe en ningún aula.");
		}
	}
	
	public String toString() {
		return this.nombre + " (" + this.direccion + ")";
	}
}
