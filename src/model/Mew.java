package model;

//PROGRESSION - 5
//Go to JAVA Resouces - src/model and create a child class called Mew inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Mew must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class.
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Mew
//pokemonNumber = 151
//characteristics = "Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine."
//type = "PSYCHIC"
//evolution = "NONE"
//baseExp = "64" 

public class Mew extends Pokemon
{
	String characteristics; 
	String type;
	String evolution;
	String baseExp;
	
	//Non paramerterised constructor that calls for parameterised constructor
	
	
	public Mew(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution,String baseExp) {
		super(pokemonName, pokemonNumber);
		this.characteristics = characteristics;
		this.type = type;
		this.evolution = evolution;
		this.baseExp = baseExp;
	}
	/*public Bulbasaur()
	{
		String Bulbasaurcharacteristics="Bulbasaur is a Grass/Poison-type Pokemon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pok�mon in the Kanto region.";
		 Bulbasaur("Bulbasaur",001,Bulbasaurcharacteristics,"POISON","IVYSAUR","64" );
	}*/
	
	//Getters and setters for characteristics
	public String getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	
	//Getters and setters for type
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//Getters and setters for evolution
	public String getEvolution() {
		return evolution;
	}
	public void setEvolution(String evolution) {
		this.evolution = evolution;
	}
	
	//Getters and setters for base expression
	public String getBaseExp() {
		return baseExp;
	}
	public void setBaseExp(String baseExp) {
		this.baseExp = baseExp;
	}
	
	
}

