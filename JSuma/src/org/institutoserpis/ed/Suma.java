package org.institutoserpis.ed;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Dame un numero: ");
		String primerNumero = scanner.nextLine();
		int primero = Integer.parseInt(primerNumero);
		System.out.println("Dame otro numero: ");
		String segundoNumero = scanner.nextLine();
		int segundo = Integer.parseInt(segundoNumero);
		int suma = primero + segundo ;
		System.out.println("La suma es " + suma);

	}

}
