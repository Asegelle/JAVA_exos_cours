package fr.ibformation.exos.manip.variables;

import java.util.Scanner;

public class LauncherExo4 {

	public static void main(String[] args) {
				// •Exercice 4 : Ecrire un algorithme permettant le calcul de la surface d'une pièce

				// étape 1 : déclaration des variables
		double roomSurface, length, width;
				// étape 2 : Saisie des deux variables
		System.out.println("Saisie de la longueur du premier mur (en mètre) : ");
				// étape : déclaration du scanner
		Scanner scanValues = new Scanner(System.in);
		length = scanValues.nextDouble();
		System.out.println("Saisie de la longueur du second mur (en mètre) : ");	
		width = scanValues.nextDouble();
		scanValues.close();
				// étape 3 : calcul de la surface
		roomSurface = length*width;
				// étape finale : affichage de la surface
		System.out.println("la surface d'une pièce carrée dont les murs font "+length+" m et "+width+" m est de : "+roomSurface+" m²");
	}

}
