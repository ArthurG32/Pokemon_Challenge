import java.util.ArrayList;


public class Game {
	//Atributos
	Ash ash;
	ArrayList<Position> PositionsLog = new ArrayList<>();
	Position newPosition;
	
	//Construtor
	public Game(Ash ash) {
		this.ash = ash;
		PositionsLog.add(ash.getPosition());
	}

	//Getters
	public Ash getAsh() {
		return ash;
	}

	public ArrayList<Position> getPositionsLog() {
		return PositionsLog;
	}
	
	//Métodos
	public void processInput(String input) {	
		
		if (input.length() == 1) {
			System.out.println(PositionsLog);
			newPosition = ash.Move(input);
			System.out.println(newPosition);

			if (PositionsLog.contains(newPosition)) {
				System.out.println("entra aqui");
				ash.newPokemon();
			}
				
		} else if (input.length() > 1) {
			String[] multipleDirections = input.split("");
		
			for (String s : multipleDirections) {
				processInput(s);
			}
		}		
	}
	
	

}
