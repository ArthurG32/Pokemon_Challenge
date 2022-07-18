public class Ash {
	//Atributos
	private Position p;
	
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

	//Metodos
	public Position move(String direction) {
		Direction d = Direction.directionFor(direction);
		
		if (d == Direction.N) {
			p = new Position(p.getX(), p.getY()+1);
		} else if (d == Direction.S) {
			p = new Position(p.getX(), p.getY()-1);
		} else if (d == Direction.E) {
			p = new Position(p.getX()+1, p.getY());
		} else if (d == Direction.O) {
			p = new Position(p.getX()-1, p.getY());
		}
		return p ;
	}
	
}
