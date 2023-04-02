package edu.ucj.programacion.pec1.darioPerez;

import java.util.Scanner;

public class UtilsColegio {
	public static Alumno[] dense(int numAlumnos) {
		Scanner scan = new Scanner(System.in);
		Alumno[] alumnos = new Alumno[numAlumnos];
		for (int i = 0; i < numAlumnos; i++) {
			// Si se quiere que los DNIs sean reales y se comprueben, descomentar la instrucción inferior, y comentar la inferior a ella.
			// new Alumno(ask.string(scan, "¿Nombre del Alumno "+(i+1)+"?", "Indica un nombre correctamente."), ask.string(scan, "¿Apellidos del Alumno "+(i+1)+"?", "Indica los apellidos correctamente."), ask.dni(scan, "¿DNI del Alumno "+(i+1)+"?", "Indica un DNI correctamente."));
			alumnos[i] = new Alumno(ask.string(scan, "¿Nombre del Alumno "+(i+1)+"?", "Indica un nombre correctamente."), ask.string(scan, "¿Apellidos del Alumno "+(i+1)+"?", "Indica los apellidos correctamente."), ask.string(scan, "¿DNI del Alumno "+(i+1)+"?", "Indica un DNI correctamente."));
		}
		return alumnos;
	}
}
