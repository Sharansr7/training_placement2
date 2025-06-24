import java.util.*;

public class TicTacToe {
    static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    static char current = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;

        while (true) {
            printBoard();
            System.out.print("Enter row and column (0-2): ");
            row = sc.nextInt(); col = sc.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = current;
                if (checkWin()) {
                    printBoard();
                    System.out.println("Player " + current + " wins!");
                    break;
                }
                current = current == 'X' ? 'O' : 'X';
            } else {
                System.out.println("Cell already filled!");
            }
        }
    }

    static boolean checkWin() {
        for (int i = 0; i < 3; i++)
            if (board[i][0] == current && board[i][1] == current && board[i][2] == current) return true;
        for (int i = 0; i < 3; i++)
            if (board[0][i] == current && board[1][i] == current && board[2][i] == current) return true;
        return (board[0][0] == current && board[1][1] == current && board[2][2] == current)
            || (board[0][2] == current && board[1][1] == current && board[2][0] == current);
    }

    static void printBoard() {
        for (char[] row : board)
            System.out.println(Arrays.toString(row));
    }
}
