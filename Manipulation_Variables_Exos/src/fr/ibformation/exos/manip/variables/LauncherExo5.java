package fr.ibformation.exos.manip.variables;

import java.util.Scanner;

public class LauncherExo5 {

	public static void main(String[] args) {
				// �Exercice 5 : Ecrire un algorithme permettant de calculer la surface d'un cercle (Aire = pi x r�)

				// �tape 1 : d�claration des variables
		double circleArea, circleRadius;
		double valuePi = 3.14159d;
				// metre d pour double, l pour long, F pour float
				// pi = Math.PI
				// �tape 2 : Saisie des deux variables
		System.out.println("Saisie du rayon du cercle (en centim�tre) : ");
		Scanner scanValues = new Scanner(System.in);
		circleRadius = scanValues.nextDouble();
		scanValues.close();
				// �tape 3 : calcul de la surface
		circleArea = valuePi*(circleRadius*circleRadius);		//  aire = pi * r�
				// �tape finale : affichage de la surface
		System.out.println("l'aire d'un cercle de "+circleRadius+" cm de rayon est de : "+circleArea+" cm�");
	}

}
