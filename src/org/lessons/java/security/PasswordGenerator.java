package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Password Generator (NON per raccogliere i tuoi dati!)\n");
		
		System.out.print("Nome?: ");
		String name = sc.nextLine();
		
		System.out.print("Cognome?: ");
		String lastname = sc.nextLine();
		
		System.out.print("Un colore che te gusta?: ");
		String color = sc.nextLine();
		
		System.out.print("Giorno di nascita(1-31)?:  ");
		int dayNum = sc.nextInt();
		
		System.out.print("Mese di nascita(1-12)?: ");
		int mounthNum = sc.nextInt();
		
		System.out.print("Anno di nascita?: ");
		int yearNum = sc.nextInt();
		
		System.out.println("\n--------------------\n");
		System.out.println("LA TUA NUOVA PASSWORD:\n");
		
		System.out.print(name + "-" + lastname + "-" + color + "-" + (dayNum+mounthNum+yearNum));
		
	}

}
