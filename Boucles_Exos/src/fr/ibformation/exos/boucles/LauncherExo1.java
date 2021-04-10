package fr.ibformation.exos.boucles;

import java.util.Scanner;

public class LauncherExo1 {

	public static void main(String[] args) {
					/* �Exercice 1 : Ecrire un algorithme permettant de faire trouver un chiffre entre 0 et 9. L'algorithme pourra r�pondre par :
											�Plus petit
											�Plus grand
											�C'est le bon
									L�algorithme ne se termine pas tant que le bon chiffre n�a pas �t� trouv�
									V�rifier si le nombre saisi n'est pas erron�		*/
			
					// �tape 1 : d�claration des variables
							// une variable qui est le nombre � d�terminer, une qui est 'linput, une bool�enne pour sortir de la boucle
		boolean isNumberFound; 
		int numberToFind;
					// �tape 2 : attribution d'une valeur � la variable � d�terminer
		numberToFind = 8;	
		isNumberFound = false;
					// �tape 3 : cr�ation de la boucle de saisie d'une valeur par l'utilisateur
		while (!isNumberFound)	{
			System.out.println("Saisissez un nombre (entre 0 et 9) : ");
			Scanner scannerInput = new Scanner(System.in);
			int inputNumber = scannerInput.nextInt();
			System.out.println("Vous avez saisie le nombre : " + inputNumber);
			
			if (inputNumber<0 || inputNumber>9)			 {
						// �tape 4 : s�curit� pour voir si l'imput est bien entre 0 et 9
				System.out.println("vous avez fait une erreur dans la saisie (nombre non compris entre 0 et 9)");	}
						// �tape 5 : comparaison de l'input au nombre � d�terminer
						// �tape 6 : renvoyer l'info � l'utilisateur de si son nombre est le meme ou non
			else if (inputNumber<numberToFind)	{
				System.out.println("Votre nombre est plus petit que celui recherch�");	}
			else if (inputNumber>numberToFind)	{
				System.out.println("Votre nombre est plus grand que celui recherch�");	}
			else if (inputNumber==numberToFind)	{
						// �tape 7 : indiquer � l'utilisateur qu'il a trouver le bon chiffre
				System.out.println("Votre nombre correspond � celui recherch�");
				isNumberFound = true;
				scannerInput.close();	}
			else	{
				System.out.println("il y a une erreur dans la saisie");		}
				
		}
	}

}
