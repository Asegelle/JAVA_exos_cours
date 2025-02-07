package fr.ibformation.poo.students.bo;

public class Student {


	// d�claration des variables
	private String name;
	private int age;
	private String school;





	// constructeurs
	public Student () {
		this.name = null;
		this.age = 0;
		this.school = null;
	}

	public Student (String name, int age, String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}



	// m�thodes
public String description () {
	String description = this.name+", "+this.age+" ans, "+this.school;
	return description;
}





@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
}

	// ------------------------------------ getters / setters --------------------------------------------------


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getSchool() {
		return school;
	}




	public void setSchool(String school) {
		this.school = school;
	}



}
