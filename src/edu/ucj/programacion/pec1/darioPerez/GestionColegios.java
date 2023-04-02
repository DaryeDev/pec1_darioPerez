package edu.ucj.programacion.pec1.darioPerez;

public class GestionColegios {

	public static void main(String[] args) {
		String nombre;
		String direccion;
		int numAulas;
		int numAlumnos;

		if (args.length >= 4) {
		    nombre = args[0];
			direccion = args[1];
			numAulas = Integer.parseInt(args[2]);
			numAlumnos = Integer.parseInt(args[3]);
		} else {
			// Si no se dan los datos mediante argumentos de lanzamiento, recurriremos a valores por defecto
			nombre = "Colegio Arrollo";
			direccion = "Calle Sevilla, S/N";
			numAulas = 3;
			numAlumnos = 10;
		}

		
		Aula[] aulas = new Aula[numAulas];
		for (int i = 0; i < numAulas; i++) {
			aulas[i] = new Aula(i, i);
		}
		Colegio colegio = new Colegio(nombre, direccion, aulas);		
		Alumno[] alumnos = UtilsColegio.dense(numAlumnos);
		llenarColegio(colegio, alumnos);
	}
	
	public static Colegio llenarColegio(Colegio colegio, Alumno[] alumnos) {
		for (int i = 0; i < alumnos.length; i++) {
			Alumno alumno = alumnos[i];
			colegio.addAlumno(alumno);
		}
		return colegio;
	}
}
