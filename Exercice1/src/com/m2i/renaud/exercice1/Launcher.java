package com.m2i.renaud.exercice1;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		System.out.println("=== EXERCICE 1 ===");
		System.out.println("Bonjour, quelle est votre adresse ?");
		
		// On initialise ce qui permet de lire l'entr�e utilisateur
		Scanner scanner = new Scanner(System.in);
		
		// On affiche un libell� explicite
		System.out.println("Entrez le num�ro : ");
		// On demande l'information		
		String numeroAdresseEnTexte = scanner.nextLine();
		// On transforme le texte entr� en nombre entier
		int numeroAdresse = Integer.parseInt(numeroAdresseEnTexte);
		
		System.out.println("Entrez la voie : ");
		String voieAdresse = scanner.nextLine();
		
		System.out.println("Entrez le code postal : ");
		String codePostalAdresseEnTexte = scanner.nextLine();
		int codePostalAdresse = Integer.parseInt(codePostalAdresseEnTexte);
		
		System.out.println("Entrez la ville : ");
		String villeAdresse = scanner.nextLine();
		
		System.out.println(numeroAdresse + " " + voieAdresse);
		System.out.println(codePostalAdresse + " " + villeAdresse);
		
		scanner.close();
	}
}
