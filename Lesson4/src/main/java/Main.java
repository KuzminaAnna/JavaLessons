public class Main {
  public static void main(String args[]) {
    Character[][] board = new Character[3][3];
    while (!gameOver(board)) {
      String index = move();
      fillCell(currentPlayer, index, board);
      currentPlayer = changePlayer(currentPlayer);
      printBoard(board);
    }
    calculateWinner(board);
  }

  public static boolean gameOver() {

  }

  public static void fillCell(...) {

  }

  public static char changePlayer(char player) {

  }

  public static String calculateWinner(...) {

  }

  public static void printBoard(...) {
    
  }

}
