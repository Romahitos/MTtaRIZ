import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Iм'я гравця X: ");
        String nameX = scanner.nextLine();
        Player playerX = new Player(nameX, 'X');

        System.out.print("Iм'я гравця O: ");
        String nameO = scanner.nextLine();
        Player playerO = new Player(nameO, 'O');

        GameBoard gameBoard = new GameBoard();
        boolean gameOver = false;
        Player currentPlayer = playerX;

        System.out.println("Починаємо гру Хрестики-Нолiки!");

        while (!gameOver) {
            currentPlayer.displayInfo();
            gameBoard.displayBoard();

            int[] move = currentPlayer.makeMove();
            if (gameBoard.makeMove(move[0], move[1], currentPlayer.symbol)) {
                if (gameBoard.checkWin(currentPlayer.symbol)) {
                    gameBoard.displayBoard();
                    System.out.println(currentPlayer.name + " перемiг!");
                    gameOver = true;
                } else if (isBoardFull(gameBoard)) {
                    gameBoard.displayBoard();
                    System.out.println("Гра закiнчилася в нiчию!");
                    gameOver = true;
                } else {
                    currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
                }
            } else {
                System.out.println("Невiрний хiд. Спробуйте ще раз.");
            }
        }
    }

    public static boolean isBoardFull(GameBoard gameBoard) {
        char[][] board = gameBoard.getBoard();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; 
                }
            }
        }
        return true; 
    }
}

