import java.util.ArrayList;


public class Game {
	//Atributos
	Ash ash;
	ArrayList<Position> PositionsLog = new ArrayList<>();
	
	//Construtor
	public Game(Ash ash) {
		this.ash = ash;
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
		PositionsLog.add(ash.getPosition());

		String[] multipleDirections = input.split("");
		for (String singleDirection : multipleDirections) {
			PositionsLog.add(ash.Move(singleDirection));
		}		
		System.out.println(PositionsLog);
		System.out.println(PositionsLog.size());
	}
	
	

}
