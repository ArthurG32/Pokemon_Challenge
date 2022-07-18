import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.print("Escolhe a posição onde o Ash começa! \nPosição X: " );
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		System.out.print("Posição Y: " );
		int y = scanner.nextInt();
		
		Ash ash = new Ash(new Position(x, y));
		Game game = new Game(ash);
		
		System.out.print("O Ash está na posição " + ash.getPosition() + "\nMove o Ash para uma nova posição: ");
		String direction = scanner.next().toLowerCase();
	
		int pokedex = game.processInput(direction);
		
		System.out.println("O Ash está agora na posição " + ash.getPosition() + " e apanhou " + pokedex + " pokemons.");
		
		scanner.close();
	}

}
