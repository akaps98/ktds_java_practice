package jan_23th_asm;

public class Cat {
	public String name;
	public String species;
	public double size;
	
	public Cat(String name, String species, double size) {
		this.name = name;
		this.species = species;
		this.size = size;
	}
	
	public void introduce() {
		System.out.println("Cat's Name: " + this.name + "\n"
						 + "Cat's species: " + this.species + "\n");
	}
}
