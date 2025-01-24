package jan_23th_asm;

public class Animal {
	public String name;
	public String species;
	public String sound;
	
	public Animal(String name, String species, String sound) {
		this.name = name;
		this.species = species;
		this.sound = sound;
	}
	
	public void introduce() {
		System.out.println("Animal's name: " + this.name + "\n"
						 + "Animal's species: " + this.species + "\n");
	}
	
	public void cry() {
		System.out.println(this.sound + "~~~");
	}
}
