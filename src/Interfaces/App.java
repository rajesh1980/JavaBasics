package Interfaces;

public class App {

	public static void main(String[] args) {
		
		Animal dog = new Animal("Canine") ;
		Bird sparrow = new Bird ("small bird") ;
		ISpecies cat = new Animal("Feline") ;
		ISpecies crow = new Bird("big bird");
		
		dog.showSpecies();
		sparrow.showSpecies();
		cat.showSpecies();
		crow.showSpecies();
		
		System.out.println("");
		
		dispSpecies(dog);
		dispSpecies(sparrow);
		dispSpecies(cat);
		dispSpecies(crow);
		
	}

	private static void dispSpecies(ISpecies species) {
		species.showSpecies();
	}
}
