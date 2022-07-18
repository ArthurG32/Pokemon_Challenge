import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.print("Escolhe a posi��o onde o Ash come�a! \nPosi��o X: " );
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		System.out.print("Posi��o Y: " );
		int y = scanner.nextInt();
		
		Ash ash = new Ash(new Position(x, y));
		Game game = new Game(ash);
		
		System.out.print("O Ash est� na posi��o " + ash.getPosition() + "\nMove o Ash para uma nova posi��o: ");
		String direction = scanner.next().toLowerCase();
	
		int pokedex = game.processInput(direction);
		
		System.out.println("O Ash est� agora na posi��o " + ash.getPosition() + " e apanhou " + pokedex + " pokemons.");
		
		scanner.close();
	}

}
