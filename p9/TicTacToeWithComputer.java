package p9_multiconditionalarray;

import java.util.Scanner;

public class TicTacToeWithComputer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};

        while (true) {
            for (int i = 0; i < 3; i++) {
                System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                if (i < 2) System.out.println("---------");
            }
            System.out.println();

            System.out.println("Player's turn");
            System.out.print("Enter a row (0,1 or 2): ");
            int r = in.nextInt();
            System.out.print("Enter a column (0,1 or 2): ");
            int c = in.nextInt();

            if (r < 0 || r > 2 || c < 0 || c > 2 || board[r][c] != ' ') continue;
            board[r][c] = 'X';

            if ((board[0][0]=='X'&&board[1][1]=='X'&&board[2][2]=='X') ||
                (board[0][2]=='X'&&board[1][1]=='X'&&board[2][0]=='X') ||
                (board[0][0]=='X'&&board[0][1]=='X'&&board[0][2]=='X') ||
                (board[1][0]=='X'&&board[1][1]=='X'&&board[1][2]=='X') ||
                (board[2][0]=='X'&&board[2][1]=='X'&&board[2][2]=='X') ||
                (board[0][0]=='X'&&board[1][0]=='X'&&board[2][0]=='X') ||
                (board[0][1]=='X'&&board[1][1]=='X'&&board[2][1]=='X') ||
                (board[0][2]=='X'&&board[1][2]=='X'&&board[2][2]=='X')) {
                System.out.println("\nGame ended, Player Win");
                for (int i = 0; i < 3; i++) {
                    System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                    if (i < 2) System.out.println("---------");
                }
                System.out.println();
                break;
            }

            boolean full = true;
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    if (board[i][j] == ' ') full = false;
            if (full) {
                System.out.println("\nGame ended, Draw");
                for (int i = 0; i < 3; i++) {
                    System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                    if (i < 2) System.out.println("---------");
                }
                System.out.println();
                break;
            }

            int cr = -1, cc = -1;
            outer:
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    if (board[i][j] == ' ') { cr = i; cc = j; break outer; }
            board[cr][cc] = 'O';

            if ((board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O') ||
                (board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O') ||
                (board[0][0]=='O'&&board[0][1]=='O'&&board[0][2]=='O') ||
                (board[1][0]=='O'&&board[1][1]=='O'&&board[1][2]=='O') ||
                (board[2][0]=='O'&&board[2][1]=='O'&&board[2][2]=='O') ||
                (board[0][0]=='O'&&board[1][0]=='O'&&board[2][0]=='O') ||
                (board[0][1]=='O'&&board[1][1]=='O'&&board[2][1]=='O') ||
                (board[0][2]=='O'&&board[1][2]=='O'&&board[2][2]=='O')) {
                System.out.println("\nGame ended, CPU Win");
                for (int i = 0; i < 3; i++) {
                    System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                    if (i < 2) System.out.println("---------");
                }
                System.out.println();
                break;
            }
        }
    }
}
