package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bulbasaur;
import model.Charizard;
import model.Dragonite;
import model.Mew;
import model.Pikachu;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";
		String characteristics; 
		String type;
		String evolution;
		String baseExp;
		String pokemonName;
		int pokemonNumber;

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			pokemonName = "Bulbasaur";
			pokemonNumber = 001;
			characteristics = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.";
		    type = "POISON";
			evolution = "IVYSAUR";
			baseExp = "64";
			Bulbasaur bulbasaur=new  Bulbasaur(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp );
			msg = "<center>" + bulbasaur.getPokemonName()+ "  #" + bulbasaur.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1",bulbasaur.getCharacteristics() );
			request.setAttribute("type1",bulbasaur.getType());
			request.setAttribute("evolution1",bulbasaur.getEvolution());
			request.setAttribute("baseExp1",bulbasaur.getBaseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			
			pokemonName = "Charizard";
			pokemonNumber = 006;
			characteristics = "Charizard is fit and strong and has the ability to soar up to ridiculous heights.With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
		    type = "FIRE";
			evolution = "CHARMELEON";
			baseExp = "240";
			Charizard charizard=new  Charizard(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp );
			msg = "<center>" + charizard.getPokemonName()+ "  #" + charizard.getPokemonNumber();
			request.setAttribute("message2",msg);
			request.setAttribute("character2",charizard.getCharacteristics() );
			request.setAttribute("type2",charizard.getType());
			request.setAttribute("evolution2",charizard.getEvolution());
			request.setAttribute("baseExp2",charizard.getBaseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	

			pokemonName = "Dragonite";
			pokemonNumber = 149;
			characteristics = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.";
			type = "DRAGON";
			evolution = "DRATINI";
			baseExp = "270" ;
			Dragonite dragonite=new  Dragonite(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp );
			msg = "<center>" + dragonite.getPokemonName()+ "  #" + dragonite.getPokemonNumber();
			request.setAttribute("message3",msg);
			request.setAttribute("character3",dragonite.getCharacteristics() );
			request.setAttribute("type3",dragonite.getType());
			request.setAttribute("evolution3",dragonite.getEvolution());
			request.setAttribute("baseExp3",dragonite.getBaseExp());
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			pokemonName = "Mew";
			pokemonNumber = 151;
			characteristics = "Mew is a Psychic-type Mythical Pokémon introduced in Generation I.Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
			type = "PSYCHIC";
			evolution = "NONE";
			baseExp = "64" ;
			Mew mew=new  Mew(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp );
			msg = "<center>" + mew.getPokemonName()+ "  #" + mew.getPokemonNumber();
			request.setAttribute("message4",msg);
			request.setAttribute("character4",mew.getCharacteristics() );
			request.setAttribute("type4",mew.getType());
			request.setAttribute("evolution4",mew.getEvolution());
			request.setAttribute("baseExp4",mew.getBaseExp());
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
			pokemonName = "Pikachu";
			pokemonNumber = 25;
			characteristics = "Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.";
			type = "ELECTRIC";
			evolution = "RAICHU";
			baseExp = "112" ;
			Pikachu pikachu=new  Pikachu(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp );
			msg = "<center>" + pikachu.getPokemonName()+ "  #" + pikachu.getPokemonNumber();
			request.setAttribute("message5",msg);
			request.setAttribute("character5",pikachu.getCharacteristics() );
			request.setAttribute("type5",pikachu.getType());
			request.setAttribute("evolution5",pikachu.getEvolution());
			request.setAttribute("baseExp5",pikachu.getBaseExp());
		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
