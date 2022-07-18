
public class Position {
	//Atributos
	private int x;
	private int y;
	
	//Construtor
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//Getters e Setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	//Métodos
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Position))
			return false;

		Position objCompare = (Position)obj;

		return objCompare.x == this.x && objCompare.y == this.y;
	}
}
