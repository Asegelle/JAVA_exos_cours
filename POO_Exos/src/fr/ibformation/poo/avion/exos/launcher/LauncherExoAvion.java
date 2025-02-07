package fr.ibformation.poo.avion.exos.launcher;

import fr.ibformation.poo.avion.exos.bo.ExoAvion;

public class LauncherExoAvion {

	public static void main(String[] args) {

/*
		�Exercice Avion : Fabriquer un Avion qui a comme caract�ristique :
				�Un numeroSerie qui ne contient que des chiffres
				�Une compagnie
				�Un nombre de place maximum dans l'avion.
				�Tester la cr�ation d'une instance d�Avion dans un launcher
*/	
		
		
		// Avion 1
		ExoAvion plane1;										// D�claration d'une variable objet
		plane1 = new ExoAvion(); 								// Affectation d'une instance d'objet de type User
		plane1.SerialNumber = 125348l;							// Affecte une valeur dans la SerieNumber
		plane1.company = "AlexAirways";
		plane1.planePlaces = 84;
		System.out.println(plane1.planeInfos());				// 1 correspond au 1er avion
		
		// Avion 2
		ExoAvion plane2;
		plane2 = new ExoAvion(); 
		System.out.println(plane2.planeInfos());

		// Avion 3
		ExoAvion plane3;
		plane3 = new ExoAvion(); 
		plane3.SerialNumber = 134571l;						
		plane3.company = "AlexAirways";
		System.out.println(plane3.planeInfos());
		
		// Avion 4
		ExoAvion plane4;
		plane4 = new ExoAvion(); 
		System.out.println(plane4.planeInfos2( 213458l, "Airbus",145));
	}

}
