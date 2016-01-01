package Interfaces;

public class Animal implements ISpecies{
	
	private String species; 
	@Override
	public void showSpecies() {
		System.out.println("Species is : " + this.species);
	}
	public Animal(String species){
		this.species = species;
	}


	
}
