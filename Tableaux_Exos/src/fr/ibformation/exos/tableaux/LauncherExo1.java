package fr.ibformation.exos.tableaux;

public class LauncherExo1 {

	public static void main(String[] args) {
				// •Exercice 1 : Ecrire un algorithme qui déclare et remplisse un tableau contenant les six voyelles de l’alphabet latin

				// étape 1 : déclaration des variables
		// char[] vowels = new char[6];
				// étape 2 : attribution des variables dans un tableau
		/*vowels[0] = 'a';
		vowels[1] = 'e';
		vowels[2] = 'i';
		vowels[3] = 'o';
		vowels[4] = 'u';
		vowels[5] = 'y';*/
		char[] vowels = new char[]{'a','e','i','o','u','y'};

						// étape finale : affichage du tableau
		System.out.println(vowels);
		System.out.println("les voyelles de l'alphabet sont : "+vowels[0]+"; "+vowels[1]+"; "+vowels[2]+"; "+vowels[3]+"; "+vowels[4]+"; "+vowels[5]);
		
	}

}
 