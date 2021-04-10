package fr.ibformation.exos.manip.variables;

import java.util.Scanner;

public class LauncherExo3 {

	public static void main(String[] args) {
				// •Exercice 3 : Ecrire un algorithme permettant la saisie de deux entiers et en afficher :
				//		- La somme
				//		- Le produit
		
				// étape 1 : déclaration des variables
		int sum, multiplication;
		int value1, value2;
				// étape 2 : Saisie des deux entiers
		System.out.println("Saisie du premier nombre (entier) : ");
		Scanner scanValues = new Scanner(System.in);
		value1 = scanValues.nextInt();
		System.out.println("Saisie du second nombre (entier) : ");	
		value2 = scanValues.nextInt();
		scanValues.close();
				// nécessaire de close le scan ?
				// étape 3 : calcul de la somme et du produit	
		sum = value1+value2;
		multiplication = value1*value2;
				// étape finale : affiche de la somme et du produit
		System.out.println("la somme de "+value1+" et "+value2+" est : "+sum);
		System.out.println("la multiplication de "+value1+" et "+value2+" est : "+multiplication);
	}

}

