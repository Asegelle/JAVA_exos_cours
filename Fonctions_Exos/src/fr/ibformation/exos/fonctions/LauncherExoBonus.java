package fr.ibformation.exos.fonctions;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class LauncherExoBonus {

	public static void main(String[] args) {
					/* •Exercice bonus : Faire plusieurs fonctions :
			•Une qui permettra de trouver le maximum d’un tableau (sans aide de Java)
			•Une qui permettra de trouver le maximum d’un tableau (avec aide de Java)
			•Une qui permettra de trouver le minimum d’un tableau (sans aide de Java)
			•Une qui permettra de trouver le minimum d’un tableau avec aide de Java) */
		

					// étape 1 : déclaration des variables
		int n, max, min;	
					// étape 2 : attribution des valeurs dans le tableau par boucle
		System.out.println("saisissez la taille du tableau : ");
		Scanner scannerGrade = new Scanner(System.in);
		int size = scannerGrade.nextInt();
		int[] grade = new int [size];
		System.out.println("saisissez la valeur des notes : ");
		for (n=0; n<size; n++) {
			grade[n]=scannerGrade.nextInt();		}
		System.out.println("les valeurs rentrées dans le tableau sont : "+ Arrays.toString(grade));
		scannerGrade.close();
					// étape 4 : identification de la valeur max du tableau et affichage
		max = Integer.MIN_VALUE;
		for (n=0; n<size; n++) {
			if (grade[n]>max) {
				max = grade[n];			}		}
		System.out.println("la valeur max du tableau est (sans fonction) : "+max);
					// étape bonus : calcul du max avec une fontion
		//int maxVal = Integer.MAX_VALUE;
	//	Int maxVal = Arrays.stream(grade).max();
		int vMax = Arrays.stream(grade).max().getAsInt();
	//	OptionalInt vMax = Arrays.stream(grade).max();		// fonctionne aussi
		System.out.println("la valeur max du tableau est (avec fonction) : "+vMax);
					// étape 5 : identification de la valeur min du tableau et affichage
		min = Integer.MAX_VALUE;
		for (n=0; n<size; n++) {
			if (grade[n]<min) {
				min = grade[n];			}		}
		System.out.println("la valeur min du tableau est (sans fonction) : "+min);
					// étape bonus : calcul du min avec une fontion
		int vMin = Arrays.stream(grade).min().getAsInt();
	//	OptionalInt vMin = Arrays.stream(grade).min();		// fonctionne aussi
		System.out.println("la valeur min du tableau est (avec fonction) : "+vMin);
		
	}

}
