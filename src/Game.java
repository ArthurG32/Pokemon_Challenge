import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Game {
	//Atributos
	Ash ash;
	Set<Position> positionsLog = new HashSet<>();
	
	//Construtor
	public Game(Ash ash) {
		this.ash = ash;
	}

	//Getters
	public Ash getAsh() {
		return ash;
	}

	public Set<Position> getPositionsLog() {
		return positionsLog;
	}
	
	//Métodos
	public void processInput(String input) {	

		positionsLog.add(ash.getPosition());
		
		String[] multipleDirections = input.split("");
		
		for (String singleDirection: multipleDirections) {
			positionsLog.add(ash.Move(singleDirection));
			ash.newPosition();
		}

		System.out.println(positionsLog.size());
		System.out.println(positionsLog);
	}
	
	

}
