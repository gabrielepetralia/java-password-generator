package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Password Generator");
		
		System.out.println("==================");
		
		System.out.print("Inserisci il tuo nome: ");
		String name = sc.nextLine();
		
		System.out.print("Inserisci il tuo cognome: ");
		String surname = sc.nextLine();
		
		System.out.print("Inserisci il tuo colore preferito: ");
		String color = sc.nextLine();
		
		System.out.print("Inserisci il tuo giorno di nascita: ");
		int birthDay = sc.nextInt();
		
		System.out.print("Inserisci il tuo mese di nascita: ");
		int birthMonth = sc.nextInt();
		
		System.out.print("Inserisci il tuo anno di nascita: ");
		int birthYear = sc.nextInt();
		
		sc.close();
		
		System.out.println("==================");
		
		String password = name + "-" + surname + "-" + color + "-" + (birthDay + birthMonth + birthYear);	
		
		System.out.println("La tua password è: " + password);
	}
}
