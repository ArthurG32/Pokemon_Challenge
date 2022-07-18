
public class Position {
	//Atributos
	int x;
	int y;
	
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
}
