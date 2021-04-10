package fr.ibformation.exos.boucles;

import java.util.Scanner;

public class LauncherExo1 {

	public static void main(String[] args) {
					/* •Exercice 1 : Ecrire un algorithme permettant de faire trouver un chiffre entre 0 et 9. L'algorithme pourra répondre par :
											•Plus petit
											•Plus grand
											•C'est le bon
									L’algorithme ne se termine pas tant que le bon chiffre n’a pas été trouvé
									Vérifier si le nombre saisi n'est pas erroné		*/
			
					// étape 1 : déclaration des variables
							// une variable qui est le nombre à déterminer, une qui est 'linput, une booléenne pour sortir de la boucle
		boolean isNumberFound; 
		int numberToFind;
					// étape 2 : attribution d'une valeur à la variable à déterminer
		numberToFind = 8;	
		isNumberFound = false;
					// étape 3 : création de la boucle de saisie d'une valeur par l'utilisateur
		while (!isNumberFound)	{
			System.out.println("Saisissez un nombre (entre 0 et 9) : ");
			Scanner scannerInput = new Scanner(System.in);
			int inputNumber = scannerInput.nextInt();
			System.out.println("Vous avez saisie le nombre : " + inputNumber);
			
			if (inputNumber<0 || inputNumber>9)			 {
						// étape 4 : sécurité pour voir si l'imput est bien entre 0 et 9
				System.out.println("vous avez fait une erreur dans la saisie (nombre non compris entre 0 et 9)");	}
						// étape 5 : comparaison de l'input au nombre à déterminer
						// étape 6 : renvoyer l'info à l'utilisateur de si son nombre est le meme ou non
			else if (inputNumber<numberToFind)	{
				System.out.println("Votre nombre est plus petit que celui recherché");	}
			else if (inputNumber>numberToFind)	{
				System.out.println("Votre nombre est plus grand que celui recherché");	}
			else if (inputNumber==numberToFind)	{
						// étape 7 : indiquer à l'utilisateur qu'il a trouver le bon chiffre
				System.out.println("Votre nombre correspond à celui recherché");
				isNumberFound = true;
				scannerInput.close();	}
			else	{
				System.out.println("il y a une erreur dans la saisie");		}
				
		}
	}

}
