import java.util.HashSet;
import java.util.Set;

public class Game {
	//Atributos
	private Ash ash;
	private Set<Position> positionsLog = new HashSet<>();
	
	//Construtor
	public Game(Ash ash) {
		this.ash = ash;
		positionsLog.add(ash.getPosition());
	}

	//Getters
	public Ash getAsh() {
		return ash;
	}

	public Set<Position> getPositionsLog() {
		return positionsLog;
	}
	
	//Métodos
	public int processInput(String input) {	
		String[] multipleDirections = input.split("");
		
		for (String singleDirection: multipleDirections) {
			ash.move(singleDirection);
			positionsLog.add(ash.getPosition());
		}
		System.out.println(positionsLog);
		return positionsLog.size();
	}
	
}
