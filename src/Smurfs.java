// Copyright Wintriss Technical Schools 2013
/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurfs {

	private String name;

	Smurfs(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurfs wears a red hat, all the others are white. */
	public String getHatColor() {
		if(name.equals("Papa")){
		
		return "This smurf's hat is red.";
	}
		else{
			
		return "This smurf has a white hat.";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if(name.equals("Smurfette")){
		
		return "This smurf is a girl.";
		}
		else{
		return "This smurf is a boy.";
	}

	}
}






