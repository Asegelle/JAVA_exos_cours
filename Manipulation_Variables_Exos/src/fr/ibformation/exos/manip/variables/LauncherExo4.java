package fr.ibformation.exos.manip.variables;

import java.util.Scanner;

public class LauncherExo4 {

	public static void main(String[] args) {
				// �Exercice 4 : Ecrire un algorithme permettant le calcul de la surface d'une pi�ce

				// �tape 1 : d�claration des variables
		double roomSurface, length, width;
				// �tape 2 : Saisie des deux variables
		System.out.println("Saisie de la longueur du premier mur (en m�tre) : ");
				// �tape : d�claration du scanner
		Scanner scanValues = new Scanner(System.in);
		length = scanValues.nextDouble();
		System.out.println("Saisie de la longueur du second mur (en m�tre) : ");	
		width = scanValues.nextDouble();
		scanValues.close();
				// �tape 3 : calcul de la surface
		roomSurface = length*width;
				// �tape finale : affichage de la surface
		System.out.println("la surface d'une pi�ce carr�e dont les murs font "+length+" m et "+width+" m est de : "+roomSurface+" m�");
	}

}
