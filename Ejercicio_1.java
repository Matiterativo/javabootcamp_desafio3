package com.javabootcamp_desafio3;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		final String TEXTO_INICIO_PROGRAMA = " =========================================================== \n" +
				 							 " \u001B[1mINGRESO AL SISTEMA PROTEGIDO\u001B[0m \n" +
				 							 " =========================================================== \n";
		final String MENSAJE_INGRESO_CORRECTO ="------------------------- \n" + "Bienvenido al sistema";
		final String MENSAJE_CREDENCIALES_INCORRECTAS ="\n Credenciales incorrectas";
		final String MENSAJE_CANTIDAD_INTENTOS ="\n Intento: %d / %d \n--------------------------\n";
		
		String usuarioSistema = "javabootcamp";
        String passwordSistema = "password2023";
        String usuarioIngresado;
        String passwordIngresado;
        int maximosIntentos = 3;
        int intentos =0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(TEXTO_INICIO_PROGRAMA);
		
		do {
			
	        System.out.println("Ingrese el usuario: ");
	        usuarioIngresado = scanner.nextLine();
	        System.out.println("Ingrese la clave: ");
	        passwordIngresado = scanner.nextLine();
	        intentos++;
	        
	        if (usuarioSistema.equals(usuarioIngresado) && passwordSistema.equals(passwordIngresado)) {
	        	System.out.println(MENSAJE_INGRESO_CORRECTO);
	        	break;
	        }else {
	        	System.out.println(MENSAJE_CREDENCIALES_INCORRECTAS);
	        	System.out.println(String.format(MENSAJE_CANTIDAD_INTENTOS, intentos, maximosIntentos));
	        }
			
		} while (intentos < maximosIntentos);
		
		if (intentos == maximosIntentos) {
			System.out.println("\nCantidad máxima de intentos alcanzada.");
		}
		
		scanner.close();
	}
}
