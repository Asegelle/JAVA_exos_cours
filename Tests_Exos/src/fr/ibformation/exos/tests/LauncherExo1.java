package fr.ibformation.exos.tests;

import java.util.Scanner;

public class LauncherExo1 {

	public static void main(String[] args) {
				// �Exercice 1 : Ecrire un algorithme qui demande un nombre � l�utilisateur, et l�informe ensuite si ce nombre est positif, n�gatif ou nul

				// �tape 1 : d�claration des variables
				// �tape 2 : interroger l'utilisateur sur son nombre
		System.out.println("Saisissez un nombre : ");
		Scanner inputValue = new Scanner(System.in);
		double inputValueA = inputValue.nextDouble();
		inputValue.close();
				// �tape 3 : IF pour nombre n�gatif
		if (inputValueA < 0)
		{System.out.println("ce nombre est inf�rieur � 0 ");
				}
				// �tape 4 : IF pour nombre positif
		else if (inputValueA > 0)
		{System.out.println("ce nombre est supp�rieur � 0 ");
				}
				// �tape 5 : IF pour nombre nul
		else if (inputValueA == 0)
		{System.out.println("ce nombre est �gal � 0 ");
				}
				// �tape 6 : prise en compte des erreurs
		else
		{System.out.println("il y a une erreur dans la saisie");
				}
				// �tape finale : informer l'utilisateur du signe de son nombre	
	}

}
