package fr.ibformation.exos.boucles;

import java.util.Scanner;

public class LauncherExo2 {

	public static void main(String[] args) {
					/* •Exercice 2 : Ecrire un algorithme qui demande un nombre de départ, et qui ensuite écrit la table de multiplication de ce nombre, présentéecomme suit 
					  			(cas ou l'utilisateur entre le nombre 7) :
					  			Table de 7 :
								7 x 1 = 7
								7 x 2 = 14
								7 x 3 = 21
								…
								7 x 10 = 70					*/
					 								
					
					// étape 1 : déclaration des variables
					// étape 2 : interroger l'utilisateur sur le nombre choisi
		System.out.println("Saisissez un nombre entier (entre 0 et 10) : ");
		Scanner scannerInputValue = new Scanner(System.in);
		int inputValueA = scannerInputValue.nextInt();
		System.out.println("Vous avez choisi le nombre : " + inputValueA);
		System.out.println("Table de : " + inputValueA +" : ");
		scannerInputValue.close();
		if (inputValueA <11 && inputValueA>-1)	{
					// étape 3 : création de la boucle de calculs
			for (int n=0; n <=10; n++ ){
					// étape 4 : calcul de la table de multipliaction
					// étape finale : renvoie à l'utilisateur du résultat
				System.out.println(inputValueA + " x "+ n + " = " + (inputValueA*n));		}
		}
					// ajout d'une sécurité en cas d'erreur de saisie
		else	{
			System.out.println("erreur dans la saisie du nombre (non compris entre 0 et 10)");		}
		
	}

}
