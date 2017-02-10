import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
  public static void main(String args[]) {
    Character[][] board = new Character[3][3];
    fillBoard(board);
    printBoard(board);
    char currentPlayer = setPlayer();
    while (!gameOver(board)) {
      String index = move();
      fillCell(currentPlayer, index, board);
      currentPlayer = changePlayer(currentPlayer);
      printBoard(board);
    }
    String result = calculateWinner(board);
    System.out.println(result);
  }

  public static boolean gameOver(Character[][] a) {
    for (int i=0; i <= 2; i++) {
      if ((a[i][0] == a[i][1]) && (a[i][1] == a[i][2]) && (a[i][2] != ' ')) {
        return true;
      }
      if ((a[0][i] == a[1][i]) && (a[1][i] == a[2][i]) && (a[2][i] != ' ')) {
        return true;
      }

    }
    return false;

  }

  public static void fillCell(char currentPlayer, String index, Character[][] board) {
    int firstPos = (int) index.charAt(0) - 48;
    int secondPos = (int) index.charAt(1) - 48;
    board[firstPos][secondPos] = currentPlayer;

  }

  public static char changePlayer(char player) {
    if (player == 'O') {
      return 'X';
    }
    return 'O';
  }

  public static String calculateWinner(Character[][] a) {
    for (int i=0; i <= 2; i++) {
      if ((a[i][0] == a[i][1]) && (a[i][1] == a[i][2])) {
        return "The winner is: player " + a[i][2];
      }
      if ((a[0][i] == a[1][i]) && (a[1][i] == a[2][i])) {
        return "The winner is: player " + a[2][i];
      }

      }
      return "Draw! No winners this time, sorry.";
  }

  public static void printBoard(Character[][] board) {
    for (int i = 0; i <= 2; i++) {
      StringJoiner line = new StringJoiner(",", "[", "]");
      for (int j = 0; j <= 2; j++) {
        line.add(String.valueOf(board[i][j]));
      }
      System.out.println(line.toString());
        }
  }
  public static char setPlayer() {
      return 'X';
  }
  public static String move() {
    Scanner scan = new Scanner(System.in);
    return scan.next();
  }

  public static void fillBoard(Character[][] board) {
    for (int i = 0; i <=2; i++) {
      for (int j = 0; j <= 2; j++) {
        board[i][j] = ' ';
      }

    }
  }
}
