package fr.ibformation.exos.fonctions;

public class LauncherExo2 {

	
	public static void main(String[] args) {
		/* �Exercice 2 : Une course a eu lieu. Un algorithme permet de faire la chose suivante :
								�Saisir les 5 premiers de la course dans un tableau 
								�Afficher le commentaire d'arriv�e gr�ce � ce tableau
								�Horreur, le premier a trich�, il est �limin�. Vous devez mettre le classement � jour		*/

		// �tape 1 : d�claration des variables
		// �tape 2 : attribution des variables dans un tableau
		String[] raceRanking = new String[5];
		raceRanking = Ranking ("Robert", "Louis", "Anna", "Christelle", "Bob");
		
		// �tape 3 : affichage du tableau
		displayRanking ("Classement temporaire : ", raceRanking);

		// �tape 4 : prise en compte du tricheur
		String[] raceRanking2 =Ranking (raceRanking[1], raceRanking[2], raceRanking[3], raceRanking[4], "Jean Bon");

	//	String[] rankingReturned = cheater (raceRanking);
		// �tape finale : affichage du tableau apr�s correction
		displayRanking ("Classement final : ", raceRanking2);
	}




// --------------------------------------------------------------------------------------------------------
// --------------------- fonction Ranking -----------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------

public static String[] Ranking (String player1,String player2,String player3,String player4,String player5) {
	String[]ranking=new String[5];
	ranking[0] = player1;
	ranking[1] = player2;
	ranking[2] = player3;
	ranking[3] = player4;
	ranking[4] = player5;

	return ranking;
}

// --------------------------------------------------------------------------------------------------------
// --------------------- fonction affichage Ranking ------------------------------------------------
// --------------------------------------------------------------------------------------------------------

public static void displayRanking(String typeRanking, String[] rankingParam) {
	System.out.println(typeRanking);
	System.out.println("1�re place : " + rankingParam[0]);
	System.out.println("2�me place : " + rankingParam[1]);
	System.out.println("3�me place : " + rankingParam[2]);
	System.out.println("4�me place : " + rankingParam[3]);
	System.out.println("5�me place : " + rankingParam[4]);
}	

}



/*
  	------------------------------------------------------------------------------------------------------------
	------------------------------------------- Exo initial ----------------------------------------------------
	------------------------------------------------------------------------------------------------------------
 */
// �tape 1 : d�claration des variables
/*	String[] raceRanking = new String[6];
					// �tape 2 : attribution des variables dans un tableau
		raceRanking[0] = "Erwan";
		raceRanking[1] = "Alex";
		raceRanking[2] = "Nezha";
		raceRanking[3] = "Romain";
		raceRanking[4] = "Renaud";
		raceRanking[5] = "Yousra";	
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
	------------------------------------------------------------------------------------------------------------
	------------------------------------------- Exo initial ----------------------------------------------------
	------------------------------------------------------------------------------------------------------------

 */