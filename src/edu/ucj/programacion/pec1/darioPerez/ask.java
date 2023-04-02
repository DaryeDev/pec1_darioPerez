package edu.ucj.programacion.pec1.darioPerez;

import java.util.Scanner;

public class ask {
	public static int integer(Scanner scanner, String pregunta, String mensajeError) {
		String strInput = "";
    	int intInput = 0;
    	boolean correctInput = false;
    	while (!correctInput) {
        	System.out.println(pregunta);
        	strInput=scanner.nextLine();
        	try {
        		intInput = Integer.parseInt(strInput);
        		correctInput = true;
			} catch (Exception e) {
				System.out.println(mensajeError);
			}
    	}
		return intInput;
	}
	public static String string(Scanner scanner, String pregunta, String mensajeError) {
		String strInput = "";
    	boolean correctInput = false;
    	while (!correctInput) {
        	System.out.println(pregunta);
        	strInput=scanner.nextLine();
        	try {
        		strInput = (strInput).toString();
        		correctInput = true;
			} catch (Exception e) {
				System.out.println(mensajeError);
			}
    	}
		return strInput;
	}
	public static String dni(Scanner scanner, String pregunta, String mensajeError) {
		String strInput = "";
    	boolean correctInput = false;
    	while (!correctInput) {
        	System.out.println(pregunta);
        	strInput=scanner.nextLine();
        	try {
        		for (int i = 0; i < 8; i++) {
        			correctInput = false;
        			int[] unoAlNueve = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; 
        			for(int j = 0; j < unoAlNueve.length; j++) {
    					if(Integer.parseInt(strInput.substring(i, i+1)) == (unoAlNueve[j])) {
    						correctInput = true;
    					} 
    				}
        			if (!correctInput) {
						throw new Exception("");
					}
				}
        		int dniNum = Integer.parseInt(strInput.substring(0, 8));
        		String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        		if (strInput.substring(8, 9).equals(asignacionLetra[dniNum % 23])) {
        			correctInput = true;
        		} else {
					throw new Exception("");
				}
			} catch (Exception e) {
				correctInput = false;
				System.out.println(mensajeError);
			}
    	}
		return strInput.substring(0, 8);
	}
	public static int count(String text, String value) {
		int quantity = 0;
		int index = 0;
		while (index != -1) {
			if (text.contains(value)) {
				quantity += 1;
				index = text.indexOf(value)+value.length();
				text = text.substring(index);
			} else {break;}
		}
		return(quantity);
	}
}
