package fr.ibformation.exos.tests;

import java.util.Scanner;

public class LauncherExo1 {

	public static void main(String[] args) {
				// •Exercice 1 : Ecrire un algorithme qui demande un nombre à l’utilisateur, et l’informe ensuite si ce nombre est positif, négatif ou nul

				// étape 1 : déclaration des variables
				// étape 2 : interroger l'utilisateur sur son nombre
		System.out.println("Saisissez un nombre : ");
		Scanner inputValue = new Scanner(System.in);
		double inputValueA = inputValue.nextDouble();
		inputValue.close();
				// étape 3 : IF pour nombre négatif
		if (inputValueA < 0)
		{System.out.println("ce nombre est inférieur à 0 ");
				}
				// étape 4 : IF pour nombre positif
		else if (inputValueA > 0)
		{System.out.println("ce nombre est suppérieur à 0 ");
				}
				// étape 5 : IF pour nombre nul
		else if (inputValueA == 0)
		{System.out.println("ce nombre est égal à 0 ");
				}
				// étape 6 : prise en compte des erreurs
		else
		{System.out.println("il y a une erreur dans la saisie");
				}
				// étape finale : informer l'utilisateur du signe de son nombre	
	}

}
