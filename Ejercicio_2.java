package com.javabootcamp_desafio3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		final String TEXTO_INICIO_PROGRAMA = " =========================================================== \n" +
				 		     " \u001B[1mRECOMENDADOR DE ACTIVIDAD SEGúN CLIMA\u001B[0m \n" +
				 		     " =========================================================== \n";
		final String MENSAJE_ERROR_TIPO_INVALIDO = "Error: debe ingresar un número entero.";
		final String MENSAJE_ERROR_TIPO_INVALIDO_FLOTANTE = "Error: debe ingresar un número entero o decimal con coma.";
		final String MENSAJE_ACTIVIDAD_RECOMENDADA = "\nPara un tiempo de tipo \"%s\" y una temperatura de %.1f C° la actividad recomendada es: %s";
		String[] tiempo = {"Soleado", "Lluvia", "Nieve"};
		int tiempoSeleccionado=-1;
		String textoTiempoSeleccionado="";
		float temperaturaIngresada=0;
		String textoActividadRecomendada="";
		
		Scanner scanner = new Scanner(System.in);
		
	        System.out.println(TEXTO_INICIO_PROGRAMA);        
	        
	        do {
	        	
	        	try {
	        		System.out.println("Ingrese el valor correspondiente al tiempo actual: \n");
	        	    
	        		//Imprimo los valores de tiempo posibles y su numero de opcion
	    	        	for (int i=0; i<tiempo.length;i++) {
	    	        		System.out.println(i + ". " + tiempo[i]);
	    	        	}
	    	        
	        		System.out.println("\nOpción seleccionada: ");
	        		tiempoSeleccionado = scanner.nextInt();
	        		
	        		if (!(tiempoSeleccionado>=0 && tiempoSeleccionado<tiempo.length)) {
	        			System.out.println("\nDebe ingresar un valor válido ");
	        			continue;
	        		}
	        		
	        	}catch(InputMismatchException e) {
	        		System.out.println(MENSAJE_ERROR_TIPO_INVALIDO);
		            	scanner.next();
	        	}
	        }
	        while (!(tiempoSeleccionado>=0 && tiempoSeleccionado<tiempo.length));
	        
	        textoTiempoSeleccionado = tiempo[tiempoSeleccionado];
	        System.out.println("\nEl tiempo seleccionado fue: " + textoTiempoSeleccionado + "\n");
	        
	        do {
	        	
	        	try {
	        		System.out.println("Ingrese la temperatura en C°: \n");
	        		temperaturaIngresada = scanner.nextFloat();
	        		break;
	        		
	        	}catch(InputMismatchException e) {
	        		System.out.println(MENSAJE_ERROR_TIPO_INVALIDO_FLOTANTE);
		            	scanner.next();
	        	}
	        }
	        while (true);      
	        
	     
	        if (textoTiempoSeleccionado.equals("Soleado")) {        	
	        	if (temperaturaIngresada > 25) {
	        		textoActividadRecomendada="caminar y tomar sol";        		
	        	}else if (temperaturaIngresada <= 15) {
	        		textoActividadRecomendada="caminar con campera";   
	        	} else {
	        		textoActividadRecomendada="caminar";
	        	}        	
	        }else if (temperaturaIngresada < 10){        	
	        	if (textoTiempoSeleccionado.equals("Nieve")) {
	        		textoActividadRecomendada="esquiar";
	        	}
	        	else {
	        		textoActividadRecomendada="quedarse en casa o salir con paraguas y campera";
	        	}        	
	        }else {   
	        	 textoActividadRecomendada="no hay actividad recomendada para este tiempo y temperatura";
	        }
	        
	        System.out.printf(MENSAJE_ACTIVIDAD_RECOMENDADA, textoTiempoSeleccionado, temperaturaIngresada, textoActividadRecomendada);
	        
		scanner.close();
	}
}
