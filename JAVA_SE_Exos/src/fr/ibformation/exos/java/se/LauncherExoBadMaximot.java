package fr.ibformation.exos.java.se;

import java.util.Random;
import java.util.Scanner;

public class LauncherExoBadMaximot {

	public static Random random = new Random();
	public static Scanner scanner = new Scanner (System.in);



	public static void main(String[] args) {

		// d�claration variables, qui est un tableau contenant des fruits
		// et attribution des fruits dans le tableau
		String[] fruits = {"FRAISE","BANANE","ORANGE"};

		// choix d'une des 3 index du tableau al�atoirement
		int randomIndexFruit = random.nextInt(fruits.length);
		// System.out.println(fruits[randomIndexFruit]);	sysout pour v�rifier le fruit s�lectionn�

		// fonction pour melanger les lettres du mot choisi
		String mixLetters = lettersOrder(fruits[randomIndexFruit]);

		// rendu du r�sultat � l'utilisateur
		System.out.println("lettres invers�es : "+mixLetters);

		// interoger utilisateur sur le mot � deviner
		System.out.println("quel est le mot � deviner ? (en majuscule)");
		String inputWord = scanner.nextLine();

		// renvoyer � l'utilisateur s'il � bon ou non
		if (inputWord.equals(fruits[randomIndexFruit])) {
			System.out.println("vous avez trouv� le bon mot qui �tait : "+ fruits[randomIndexFruit]);
		}
		else {
			System.out.println("vous n'avez pas trouv� le mot qui �tait : "+ fruits[randomIndexFruit]);
		}
	}



	//---------------------------------------------------------------------------------------------------------
	// Fonction
	//---------------------------------------------------------------------------------------------------------

	public static String lettersOrder(String word) {

		//conversion du string du tableau en un tableau de char 
		char[] letters = word.toCharArray();

		// d�termination du nombre de lettres dans le mot
		int lettersNumber = letters.length;

		// boucle FOR pour inverser les lettres un certain nombres d'iterations
		for (int i = 0; i < lettersNumber * 4; i++) {

			// choix aleatoire des 2 lettres a inverser
			int l1 = random.nextInt(lettersNumber);
			int l2 = random.nextInt(lettersNumber);

			// cr�ation variable temporaire (temp) pour inverser deux lettres
			char temp = letters[l1];
			letters[l1] = letters[l2];
			letters[l2] = temp;
		}
		// renvoie du tableau de char avec les lettres invers�es
		return new String(letters);
	}
}
//---------------------------------------------------------------------------------------------------------



/*


package coursqualiteapplication;

import java.util.Random;

public class BadMaximot {

	public static String mixer(String mot) {
		Random r = new Random();
		char[] m = mot.toCharArray();
		int l = m.length;
		for (int i = 0; i < l * 4; i++) {int p1 = r.nextInt(l);
		int p2 = r.nextInt(l);
		char temp = m[p1];
		m[p1] = m[p2];
		m[p2] = temp;}
		return new String(m);}

	public static void main(String[] args) {
		String[] dic = {"FRAISE","BANANE","ORANGE"};
		Random r = new Random();
		int randomIndex = r.nextInt(dic.length);
		String mot = dic[randomIndex];
		String mix = mixer(mot);
		System.out.println(mix);}
}


 */