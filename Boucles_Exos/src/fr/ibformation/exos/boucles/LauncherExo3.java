package fr.ibformation.exos.boucles;

import java.util.Arrays;
import java.util.Scanner;

public class LauncherExo3 {

	public static void main(String[] args) {
		// •Exercice 3 : Ecrire un algorithme permettant de faire trouver le maximum et le minimum d’un tableau de nombre


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
		max = 0;	//max = Integer.MIN_VALUE;
		for (n=0; n<size; n++) {
			if (grade[n]>max) {
				max = grade[n];			
			}		
		}
		System.out.println("la valeur max du tableau est : "+max);
		// étape 5 : identification de la valeur min du tableau et affichage
		min = 20;	//min = Integer.MAX_VALUE;
		for (n=0; n<size; n++) {
			if (grade[n]<min) {
				min = grade[n];		
			}	
		}
		System.out.println("la valeur min du tableau est : "+min);

	}

}
