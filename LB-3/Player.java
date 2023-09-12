import java.util.Scanner;

public class Player {
    public String name;
    public char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public int[] makeMove() {
        int[] move = new int[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println(name + ", введiть номер рядка (0, 1, 2): ");
        move[0] = scanner.nextInt();

        System.out.println(name + ", введiть номер стовпця (0, 1, 2): ");
        move[1] = scanner.nextInt();

        return move;
    }

    public void displayInfo() {
        System.out.println("Гравець: " + name);
        System.out.println("Символ: " + symbol);
    }
}

