package fr.ibformation.poo.students.launcher;

import java.util.ArrayList;
import java.util.List;

import fr.ibformation.poo.students.bo.Student;

public class LauncherStudent {

	public static void main(String[] args) {


		/*
		L'id�e est de r�aliser la gestion d'une liste d'�l�ves dans une classe
		Cr�er une liste d'�l�ves avec nom, classe (CP, CE1, etc...), �ge
		- Cr�er 5 �l�ves :
			Yoann, CP, 6 ans
			Emma, CP, 6 ans
			Erwann, CE1, 7 ans
			Bastien, CP, 8 ans
			Alienor, CE1, 8 ans

		- Afficher la liste des �l�ves
		- Ajouter une nouvelle �l�ve Alicia, CE2, 8 ans
		- Supprimer l��l�ve Erwann
		- Modifier Bastien qui est en CM1 en r�alit�
		- Afficher la liste des �l�ves

		Indice : 
		- Partir sur une ArrayList
		- Une ArrayList peut avoir comme type un Business Object

		 */		

		// creation d'un tableau d'�l�ves
		List<Student> eleves = new ArrayList<Student> ();
		eleves.add(new Student ("Yoann", 6, "CP"));
		eleves.add(new Student ("Emma", 6, "CP"));
		eleves.add(new Student ("Erwann", 7, "CE1"));
		eleves.add(new Student ("Bastien", 8, "CP"));
		eleves.add(new Student ("Alienor", 8, "CE1"));

		// fonction affichage de la liste
		displayProducts(eleves);		

		// ajouter un nouvel �l�ve
		eleves.add(new Student ("Alicia", 8, "CE2"));

		// supprimer un �l�ve
		for (int i=0; i < eleves.size(); i++) {
			if (eleves.get(i).getName() == "Erwann") {
				eleves.remove(i);
				break;
			}
		}

		// modifier un �l�ve
		for (int i=0; i < eleves.size(); i++) {
			if (eleves.get(i).getName() == "Bastien") {
				eleves.get(i).setSchool("CM2"); 
				break;
			}
		}

		// afficher la liste
		displayProducts(eleves);		


	}



	// --------------------------------------------------------------------------------------------------------------
	// --------------------------------------- Fonctions affichage liste de courses ---------------------------------
	// --------------------------------------------------------------------------------------------------------------


	public static void displayProducts(List<Student> students) {
		for(Student �l�ves : students) {
			System.out.println(�l�ves);
		}
		System.out.println("");
	}








	// --------------------------------------------------------------------------------------------------------------

}
