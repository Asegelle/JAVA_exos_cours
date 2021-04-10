package fr.ibformation.exos.fonctions;

import java.util.Scanner;


public class LauncherExo1 {

	// --------------------- fonction println pour affichage des variables ------------------------------------
	
	public static void ValuesVariables(int v1, int v2, int v3, int v4, int v5) {
		System.out.println("A : "+v1+";	B : "+v2+";	C : "+v3+";	D : "+v4+";	E : "+v5);
	}
	
	// --------------------- fonction println pour affichage des variables ------------------------------------

	
	
	
	public static void main(String[] args) {
		/* �Exercice 6 : Soit les variables A, B, C, D, E
						Faire l'algorithme permettant d'effectuer les �tapes indiqu�es par chaque ligne :
						Attention: les valeurs des variables sont des valeurs exemples. L�algorithme devra permettre:
							�La saisie des ces valeurs au d�but
							�Faire les �tapes demand�es
							�Pr�senter le r�sultat � chaque �tape */

					// �tape 1 : d�claration des variables
		int temp;
		int iniA, iniB, iniC, iniD, iniE;
					// �tape 2 : demander la saisie des 5 variables
					// peut faire une boucle !
		System.out.println("Saisie du nombre A : ");
		Scanner values = new Scanner(System.in);
		int valueA = values.nextInt();
		System.out.println("Saisie du nombre B : ");
		int valueB = values.nextInt();
		System.out.println("Saisie du nombre C : ");
		int valueC = values.nextInt();
		System.out.println("Saisie du nombre D : ");
		int valueD = values.nextInt();
		System.out.println("Saisie du nombre E : ");
		int valueE = values.nextInt();
		values.close();
		System.out.println("les valeurs saisies sont : 		");
		ValuesVariables(valueA, valueB, valueC, valueD, valueE);
		iniA = valueA;
		iniB = valueB;
		iniC = valueC;
		iniD = valueD;
		iniE = valueE;
					// �tape 3 : inversion de A et B
		temp = valueA;
		valueA = valueB;
		valueB = temp;
					// �tape 4 : affichage des 5 nouvelles valeurs de A � E
		System.out.println("apr�s (A<-->B) les valeurs sont : 	");
		ValuesVariables(valueA, valueB, valueC, valueD, valueE);
					// �tape 5 : inversion de B et C
		temp = valueB;
		valueB = valueC;
		valueC = temp;
					// �tape 6 : affichage des 5 nouvelles valeurs de A � E
		System.out.println("apr�s (B<-->C) les valeurs sont : 	");
		ValuesVariables(valueA, valueB, valueC, valueD, valueE);
					// �tape 7 : calcul de C = A + B
		valueC = valueA+valueB;
					// �tape 8 : affichage des 5 nouvelles valeurs de A � E
		System.out.println("apr�s (C = A + B) les valeurs sont : 	");
		ValuesVariables(valueA, valueB, valueC, valueD, valueE);
					// �tape 9 : inversion de C et E
		temp = valueC;
		valueC = valueE;
		valueE = temp;
					// �tape 10 : affichage des 5 nouvelles valeurs de A � E
		System.out.println("apr�s (C<-->E) les valeurs sont : 	");
		ValuesVariables(valueA, valueB, valueC, valueD, valueE);
					// �tape 11 : retour � l'�tat initial
		valueA = iniA;
		valueB = iniB;
		valueC = iniC;
		valueD = iniD;
		valueE = iniE;
		System.out.println("apr�s (C<-->E) les valeurs sont : 	");
		ValuesVariables(valueA, valueB, valueC, valueD, valueE);
					// �tape finale : affichage des 5 nouvelles valeurs de A � E
		}

}




/*	
	------------------------------------------------------------------------------------------------------------
	------------------------------------------- Exo initial ----------------------------------------------------
	------------------------------------------------------------------------------------------------------------

	public static void main(String[] args) {


				// �tape 1 : d�claration des variables
		int temp;
		int iniA, iniB, iniC, iniD, iniE;
				// �tape 2 : demander la saisie des 5 variables
				// peut faire une boucle !
		System.out.println("Saisie du nombre A : ");
		Scanner values = new Scanner(System.in);
		int valueA = values.nextInt();
		System.out.println("Saisie du nombre B : ");
		int valueB = values.nextInt();
		System.out.println("Saisie du nombre C : ");
		int valueC = values.nextInt();
		System.out.println("Saisie du nombre D : ");
		int valueD = values.nextInt();
		System.out.println("Saisie du nombre E : ");
		int valueE = values.nextInt();
		values.close();
		System.out.println("les valeurs saisies sont : 		A : "+valueA+";	B : "+valueB+";	C : "+valueC+";	D : "+valueD+";	E : "+valueE);
		iniA = valueA;
		iniB = valueB;
		iniC = valueC;
		iniD = valueD;
		iniE = valueE;
				// �tape 3 : inversion de A et B
		temp = valueA;
		valueA = valueB;
		valueB = temp;
				// �tape 4 : affichage des 5 nouvelles valeurs de A � E
		System.out.println("apr�s (A<-->B) les valeurs sont : 	A : "+valueA+";	B : "+valueB+";	C : "+valueC+";	D : "+valueD+";	E : "+valueE);
				// �tape 5 : inversion de B et C
		temp = valueB;
		valueB = valueC;
		valueC = temp;
				// �tape 6 : affichage des 5 nouvelles valeurs de A � E
		System.out.println("apr�s (B<-->C) les valeurs sont : 	A : "+valueA+";	B : "+valueB+";	C : "+valueC+";	D : "+valueD+";	E : "+valueE);
				// �tape 7 : calcul de C = A + B
		valueC = valueA+valueB;
				// �tape 8 : affichage des 5 nouvelles valeurs de A � E
		System.out.println("apr�s (C = A + B) les valeurs sont : 	A : "+valueA+";	B : "+valueB+";	C : "+valueC+";	D : "+valueD+";	E : "+valueE);
				// �tape 9 : inversion de C et E
		temp = valueC;
		valueC = valueE;
		valueE = temp;
				// �tape 10 : affichage des 5 nouvelles valeurs de A � E
		System.out.println("apr�s (C<-->E) les valeurs sont : 	A : "+valueA+";	B : "+valueB+";	C : "+valueC+";	D : "+valueD+";	E : "+valueE);			
				// �tape 11 : retour � l'�tat initial
		System.out.println("apr�s (C<-->E) les valeurs sont : 	A : "+iniA+";	B : "+iniB+";	C : "+iniC+";	D : "+iniD+";	E : "+iniE);			
				// �tape finale : affichage des 5 nouvelles valeurs de A � E
	}

}
	------------------------------------------------------------------------------------------------------------
	------------------------------------------- Exo initial ----------------------------------------------------
	------------------------------------------------------------------------------------------------------------
*/
