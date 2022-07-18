public class Ash {
	//Atributos
	Position p;
	int pokedex = 1;
	
	//Construtor
	public Ash(Position p) {
		this.p = p;
	}

	//Getters
	public Position getPosition() {
		return p;
	}
	
	public void setPosition(Position p) {
		this.p = p;
	}

	public int getPokedex() {
		return pokedex;
	}

	//Metodos
	public void newPosition() {		
		pokedex++;
	}
	
	public Position Move(String direction) {
		Direction d = Direction.directionFor(direction);
		
		if (d == Direction.N) {
			System.out.println(p);
			p.setY(p.y++);
			System.out.println(p);
		} else if (d == Direction.S) {
			p.setY(p.y--);
		} else if (d == Direction.E) {
			p.setX(p.x++);
		} else if (d == Direction.O) {
			p.setX(p.x--);
		}
			
		return getPosition();
	}
	
}
