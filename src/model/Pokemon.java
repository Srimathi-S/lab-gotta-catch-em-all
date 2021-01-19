package model;

//PROGRESSION - 1 
//Go to JAVA Resouces - src/model and create a parent class called Pokemon inside the model package - with the following arguments
//String pokemonName
//Int pokemonNumber
//
//Generate appropriate getters and setters.
//Generate a two-argument constructor in the Pokemon class
public class Pokemon
{
	protected String pokemonName;
	protected int pokemonNumber;
	
	
	//Constructor 
	public Pokemon(String pokemonName, int pokemonNumber) {
		super();
		this.pokemonName = pokemonName;
		this.pokemonNumber = pokemonNumber;
	}
	
	//getters and setters of pokemon name
	public String getPokemonName() {
		return pokemonName;
	}
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	
	//getters and setters of pokemon number
	public int getPokemonNumber() {
		return pokemonNumber;
	}
	public void setPokemonNumber(int pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}
	
	
	
}

