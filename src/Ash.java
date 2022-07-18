
public class Ash {
	//Atributos
	Position p;
	int pokedex = 1;
	
	Game game = new Game(this);

	
	//Construtor
	public Ash(Position p) {
		this.p = p;
	}

	//Getters
	public Position getPosition() {
		return p;
	}

	public int getPokedex() {
		return pokedex;
	}

	//Metodos
	public void newPokemon() {		
		game.getPositionsLog().add(getPosition());
		pokedex++;
	}
	
	public Position Move(String direction) {
		Direction d = Direction.directionFor(direction);
		
		if (d == Direction.N) {
			p.y++;
		} else if (d == Direction.S) {
			p.y--;
		} else if (d == Direction.E) {
			p.x++;
		} else if (d == Direction.O) {
			p.x--;
		}
			
		return getPosition();
	}
	
	
}
