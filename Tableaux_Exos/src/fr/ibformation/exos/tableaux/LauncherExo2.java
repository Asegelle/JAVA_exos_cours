package fr.ibformation.exos.tableaux;

public class LauncherExo2 {

	public static void main(String[] args) {
					/* �Exercice 2 : Une course a eu lieu. Un algorithme permet de faire la chose suivante :
								�Saisir les 5 premiers de la course dans un tableau 
								�Afficher le commentaire d'arriv�e gr�ce � ce tableau
								�Horreur, le premier a trich�, il est �limin�. Vous devez mettre le classement � jour		*/

					// �tape 1 : d�claration des variables
	/*	String[] raceRanking = new String[6];
					// �tape 2 : attribution des variables dans un tableau
		raceRanking[0] = "Erwan";
		raceRanking[1] = "Alex";
		raceRanking[2] = "Nezha";
		raceRanking[3] = "Romain";
		raceRanking[4] = "Renaud";
		raceRanking[5] = "Yousra";	*/
		String[] raceRanking = new String[]{"Erwan","Alex","Nezha","Romain","Renaud","Yousra"};
					// �tape 3 : affichage du tableau
		System.out.println("Voici le classement du TOP 5 � l'arriv�e de la course :		"+raceRanking[0]+"; "+raceRanking[1]+"; "+raceRanking[2]+"; "+raceRanking[3]+"; "+raceRanking[4]);
					// �tape 4 : prise en compte du tricheur
		raceRanking[0] = raceRanking[1];
		raceRanking[1] = raceRanking[2];
		raceRanking[2] = raceRanking[3];
		raceRanking[3] = raceRanking[4];
		raceRanking[4] = raceRanking[5];
					// �tape finale : affichage du tableau apr�s correction
		System.out.println("Voici le nouveau classement du TOP 5 � l'arriv�e de la course :	"+raceRanking[0]+"; "+raceRanking[1]+"; "+raceRanking[2]+"; "+raceRanking[3]+"; "+raceRanking[4]);
		
	}

}
