package myhelpers;

import java.util.Objects;

public class Animal {
	protected String name;
	String gender;
	
	public Animal() {
		
	}
	
	public Animal(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public void makeASound() {
		System.out.println("In Animal");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public boolean equals(Animal animal) {
		return this.name == animal.getName()
				&& this.gender == animal.getGender();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		final Animal other = (Animal) obj;
		
		if(!Objects.equals(this.name, other.name))
			return false;
		
		if(!Objects.equals(this.gender, other.gender))
			return false;
		
		return true;
	}
	
	@Override
	public String toString() {
	    String str = "";

	    str += String.format("%-10s: %s\n", "Name", name);
	    str += String.format("%-10s: %s\n", "Gender", gender);

	    return str;
	}
	
	
}
