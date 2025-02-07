package fr.ibformation.poo.villes.exos.launcher;

import fr.ibformation.poo.villes.exos.bo.Monument;
import fr.ibformation.poo.villes.exos.bo.Ville2;

public class LauncherExoVilles {

	/*
	Exercice Villes :
	�Cr�ation d'un objet Ville
		�nom String)
		�pays (String
		�nombre d'habitants (entier)

	�Cr�er 3 instances de villes
		�Honolulu, Quiberon, New York

	�Afficher les 3 villes

	�Syst�me de cat�gories par rapport au nombre
	d'habitants
		�A < 1000
		�1000 < B < 10 000
		�10 000 < C < 100 000
		�100 000 < D

	�Cr�er une m�thode pour comparer 2 objets ville par rapport au nombre d'habitants
	�Cr�er une m�thode qui permet de dire si deux villes ont le m�me nom
	�Ajouter � la ville une variable monument de Type Monument
	�Chaque monument a un nom et une ann�e de construction
	 */


	public static void main(String[] args) {
		
		
		Ville2 Honolulu = new Ville2 ("Honolulu", "Etat-Unis",337256,null);
		Ville2 Quiberon = new Ville2 ("Quiberon", "France",4938,null);
		Ville2 NewYork = new Ville2 ("New York","Etat Unis",8336817, new Monument ("statut de la libert�", 1885));
		Ville2 Shangai = new Ville2 ();


		System.out.println(Honolulu);
		System.out.println(Quiberon);
		System.out.println(NewYork);
		System.out.println("");
		System.out.println(Honolulu.description());
		System.out.println(Quiberon.description());
		System.out.println(NewYork.description());
		System.out.println(Shangai.description());
		System.out.println("");
		System.out.println(Honolulu.compareCitySize(NewYork));
		System.out.println(Quiberon.compareCitySize(Quiberon));
		System.out.println(NewYork.compareCitySize(Quiberon));
		System.out.println("");
		System.out.println(Honolulu.compareCityName(NewYork));
		System.out.println(Quiberon.compareCityName(Quiberon));
		System.out.println(NewYork.compareCityName(Quiberon));

	}

}
