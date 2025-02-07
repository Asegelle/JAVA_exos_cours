package fr.ibformation.poo.avion.exos.bo;

public class ExoAvion {

/*
	�Exercice Avion : Fabriquer un Avion qui a comme caract�ristique :
			�Un numeroSerie qui ne contient que des chiffres
			�Une compagnie
			�Un nombre de place maximum dans l'avion.
			�Tester la cr�ation d'une instance d�Avion dans un launcher
*/	
	
	
	// d�claration des variables
	
	public long SerialNumber;
	public String company;
	public int planePlaces;
	
	
	// Constructeurs
	public ExoAvion() {
		SerialNumber = 0000;
		company = "inconnue";
		planePlaces = 00;
	}
	
	public ExoAvion(long SerialNumber, String company, int planePlaces) {
		this.SerialNumber = SerialNumber;
		this.company = company;
		this.planePlaces = planePlaces;
	}
	
	// d�claration des m�thodes
	
	public String planeInfos () {
		return ("Informations sur l'avion :\nNum�ro de S�rie : "+SerialNumber +"\nCompagnie a�rienne : "+company+"\nNombre de places max : "+planePlaces+"\n");
	}
	
	public String planeInfos2 (long SerialNumber, String company, int planePlaces) {
		return ("Informations sur l'avion :\nNum�ro de S�rie : "+this.SerialNumber +"\nCompagnie a�rienne : "+this.company+"\nNombre de places max : "+this.planePlaces+"\n");
	}
	
	
}
