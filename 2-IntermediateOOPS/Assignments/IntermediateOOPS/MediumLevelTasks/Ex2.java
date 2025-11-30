import java.util.Scanner;

class Game {
    void startGame() {
        System.out.println("Welcome to the Game!");
    }
}

class TicTacToe extends Game {
    char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    boolean isWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }

    void playGame() {
        Scanner sc = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameRunning = true;

        System.out.println("Tic-Tac-Toe Game between Player X and Player O!");
        printBoard();

        while (gameRunning) {
            System.out.print("Player " + currentPlayer + ", enter row (0-2): ");
            int row = sc.nextInt();
            System.out.print("Player " + currentPlayer + ", enter column (0-2): ");
            int col = sc.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Invalid move, try again!");
                continue;
            }

            board[row][col] = currentPlayer;
            printBoard();

            if (isWinner(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameRunning = false;
            } else if (isBoardFull()) {
                System.out.println("It's a tie!");
                gameRunning = false;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }
}

public class Ex2 {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.startGame();
        game.playGame();
    }
}
