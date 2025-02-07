package fr.ibformation.todolist.Launcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.ibformation.todolist.bo.Course;


public class LauncherTodolist {


	// ------------------------------ variables globales -----------------------------------------------------------

	public static Scanner scanner = new Scanner(System.in);
	public static boolean isEnd = false;

	public static final String SHOW = "Afficher la liste des �l�ments";
	public static final String ADD = "Ajouter un �l�ment";
	public static final String DELETE = "Supprimer un �l�ment";
	public static final String SET = "Modifier un �l�ment";
	public static final String LEAVE = "Quitter le programme";




	// ------------------------------ main ---------------------------------------------------------------------

	public static void main(String[] args) {


		List<Course> shoppingList = new ArrayList<Course>();
		int index = 0;

		do {	
			displayMenu();
			int inputMenu = scanner.nextInt();
			Course course = new Course();
			System.out.println("vous venez de saisir : "+inputMenu+"\n");
			switch (inputMenu) {
			case 1 :
				System.out.println("vous souhaitez : "+SHOW+"\n");
				displayProducts(shoppingList);
				break;

			case 2 :
				System.out.println("vous souhaitez : "+ADD+"\n");
				System.out.println("produit que vous souhaitez ajouter : ");
				course.setName(scanner.next());
				System.out.println("quantit� de ce produit : ");
				course.setQuantity(scanner.nextInt());
				index += 1;
				course.setId(index);
				shoppingList.add(course);
				displayProducts(shoppingList);
				break;

			case 3 :
				System.out.println("vous souhaitez : "+DELETE+"\n");
				System.out.println("produit que vous souhaitez supprimer : ");
				course.setName(scanner.next());
				for (int i=0; i < shoppingList.size(); i++) {
					if (shoppingList.get(i).getName().equalsIgnoreCase(course.getName())) {
						shoppingList.remove(i);
						break;
					}
				}
				displayProducts(shoppingList);
				break;

			case 4 :
				System.out.println("vous souhaitez : "+SET+"\n");
				System.out.println("produit que vous souhaitez modifier : ");
				course.setName(scanner.next());
				for (int i=0; i < shoppingList.size(); i++) {
					System.out.println("souhaitez vous modifier le nom du produit ? (true/false) ");
					boolean modifName = scanner.nextBoolean();
					if (modifName==true) {
						System.out.println("nom du nouveau produit : ");
						course.setName(scanner.next());
						shoppingList.get(i).setName(course.getName());
					}
					System.out.println("souhaitez vous modifier la quantit� du produit ? (true/false) ");
					boolean modifQuantity = scanner.nextBoolean();
					if (modifQuantity==true) {
						System.out.println("nouvelle quantit� du produit : ");
						course.setQuantity(scanner.nextInt());
						shoppingList.get(i).setQuantity(course.getQuantity());
					}
					else {
						break;
					}
				}
				displayProducts(shoppingList);
				break;

			case 5 :
				isEnd = true;
				System.out.println("vous avez choisi : "+LEAVE+"\n");
				System.out.println("A bientot !");
				break;

			default :
				System.out.println("vous avez fait une erreur de saisie !\n");
				break;
			}
		}
		while (!isEnd);

		
	}




	// --------------------------------------------------------------------------------------------------------------
	// --------------------------------------- Fonctions affichage liste de courses ---------------------------------
	// --------------------------------------------------------------------------------------------------------------

	public static void displayProducts(List<Course> products) {
		for(Course element : products) {
			System.out.println(element);
		}
	}

	// --------------------------------------------------------------------------------------------------------------
	// --------------------------------------- Fonctions affichage menu ---------------------------------------------
	// --------------------------------------------------------------------------------------------------------------

	public static void displayMenu () {
		System.out.println("\nVotre action : \n"
				+ "1 - "+SHOW+"\n"
				+ "2 - "+ADD+"\n"
				+ "3 - "+DELETE+"\n"
				+ "4 - "+SET+"\n"
				+ "5 - "+LEAVE+"\n");
	}

	// --------------------------------------------------------------------------------------------------------------
	// --------------------------------------- Fonctions modif name/quantity ----------------------------------------
	// --------------------------------------------------------------------------------------------------------------
	
	
	/*
	
	
	System.out.println("souhaitez vous modifier le nom du produit ? (true/false) ");
	boolean modifName = scanner.nextBoolean();
	if (modifName==true) {
		System.out.println("nom du nouveau produit : ");
		course.setName(scanner.next());
		shoppingList.get(i).setName(course.getName());
	}
	
	
	
	System.out.println("souhaitez vous modifier la quantit� du produit ? (true/false) ");
	boolean modifQuantity = scanner.nextBoolean();
	if (modifQuantity==true) {
		System.out.println("nouvelle quantit� du produit : ");
		course.setQuantity(scanner.nextInt());
		shoppingList.get(i).setQuantity(course.getQuantity());
	}
	
	
	
	*/
	
	
	
	// --------------------------------------------------------------------------------------------------------------

}
