package org.institutoserpis.ed;

import java.util.Scanner;
import java.util.Random;

public class Adivina {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		Random r = new Random();
		int adivinar = r.nextInt(100);
		int i = 0;
		 System.out.println ("Adivina el número secreto entre 0 y 99. ¿Que número es?");
		 int apuesta = scanner.nextInt();
		while (adivinar != apuesta) {
			i++;
			if (adivinar > apuesta) {
				System.out.println("El número a adivinar es más grande. \n LLevas " + i +" intento/s.Intentelo otra vez");
		}   	else {
					System.out.println("El número a adivinar es más pequeño. \n LLevas " + i + " intento/s . Intentelo otra vez");
			}
			apuesta = scanner.nextInt();
		}
		i=i+1;
		System.out.println("Felicidades has dado con el número en " + i + " intentos ");
			}
		
			
	}
	



