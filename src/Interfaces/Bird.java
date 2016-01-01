package Interfaces;

public class Bird implements ISpecies{
	
	private String species ;
	
	@Override
	public void showSpecies() {
		System.out.println("Species is : " + this.species);
	}

	public Bird(String species) {
		this.species = species;
	}

}
