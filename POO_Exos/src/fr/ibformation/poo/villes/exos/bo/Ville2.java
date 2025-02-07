package fr.ibformation.poo.villes.exos.bo;

import fr.ibformation.poo.villes.exos.enums.Categories;

public class Ville2 {

	// d�claration des variables
	private String name;
	private String country;
	private int nbrCitizen;
	private Categories category;
	private boolean isSameName;
	private Monument monument;
	
	private static final int NBR_CITIZEN_FIRST_CATEGORY = 1000;
	private static final int NBR_CITIZEN_SECOND_CATEGORY = 10000;
	private static final int NBR_CITIZEN_THIRD_CATEGORY = 100000;


	// constructors
	public Ville2 () {
		this.name = null;
		this.country = null;
		this.nbrCitizen = 0;
		this.monument = null;
	}

	public Ville2 (String name, String country, int nbrCitizen, Monument monument) {
		this.name = name;
		this.country = country;
		this.nbrCitizen = nbrCitizen;
		 if (monument != null) {
		 this.monument = monument;
		 }
	}



	// -------------------------------------------- methodes-------------------------------------------------
	// methode pour renvoyer d�tails de la ville
	public String description () {
		String citydetails = 
				this.name +", "+
						this.country+", "+
						this.nbrCitizen+" habitants, categorie : "+
						this.sizeCategory()+", Monument : ";
				if (this.monument != null) {
					citydetails += this.monument.getName()+" "+this.monument.getBuildYear();
				}
		return citydetails;
	}

	// methode pour d�terminer cat�gorie de la ville par rapport nbr habitants
	public Categories sizeCategory () {
		if (this.nbrCitizen <NBR_CITIZEN_FIRST_CATEGORY) {
			return this.category = Categories.A;
		}
		else if (this.nbrCitizen <NBR_CITIZEN_SECOND_CATEGORY) {
			return this.category = Categories.B;
		}
		else if (this.nbrCitizen <NBR_CITIZEN_THIRD_CATEGORY) {
			return this.category = Categories.C;
		}
		else  {
			return this.category = Categories.D;
		}
	}

	// methode pour comparer taille de 2 villes
	public String compareCitySize (Ville2 cityToCompare) {
		if (this.nbrCitizen < cityToCompare.getNbrCitizen()) {
			return "la ville de "+this.name+" est plus petite que la ville de "+ cityToCompare.getName();
		}
		else if (this.nbrCitizen > cityToCompare.getNbrCitizen()) {
			return "la ville de "+this.name+" est plus grande que la ville de "+ cityToCompare.getName();
		}
		else {
			return "la ville de "+this.name+" est de la m�me taille que la ville de "+ cityToCompare.getName();
		}
	}

	// methode pour dire si 2 villes ont le m�me nom
	public boolean compareCityName (Ville2 cityToCompare) {
		if (this.name.equalsIgnoreCase (cityToCompare.getName())) {
			System.out.println("les deux villes ont elles le m�me nom ?");
			return this.isSameName = true;
//			return "la ville de "+this.name+" a t elle le m�me nom que la ville de "+ cityToCompare.getName()+" ? "+this.isSameName != null;
		}
		else {
			System.out.println("les deux villes ont elles le m�me nom ?");
			return this.isSameName = false;
//			return "la ville de "+this.name+" a t elle le m�me nom que la ville de "+ cityToCompare.getName()+" ? "+this.isSameName != null;
		}
	}


	
	
	


	@Override
	public String toString() {
		return "Ville2 [name=" + name + ", country=" + country + ", nbrCitizen=" + nbrCitizen + "]";
	}



	// --------------------------------------------- Getters / Setters ------------------------------------


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNbrCitizen() {
		return nbrCitizen;
	}

	public void setNbrCitizen(int nbrCitizen) {
		this.nbrCitizen = nbrCitizen;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	public static int getNbrCitizenFirstCategory() {
		return NBR_CITIZEN_FIRST_CATEGORY;
	}

	public static int getNbrCitizenSecondCategory() {
		return NBR_CITIZEN_SECOND_CATEGORY;
	}

	public static int getNbrCitizenThirdCategory() {
		return NBR_CITIZEN_THIRD_CATEGORY;
	}

	public boolean isSameName() {
		return isSameName;
	}

	public void setSameName(boolean isSameName) {
		this.isSameName = isSameName;
	}

	public Monument getMonument() {
		return monument;
	}

	public void setMonument(Monument monument) {
		this.monument = monument;
	}







}
