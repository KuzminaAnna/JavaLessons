import java.util.StringJoiner;

public class Board {

  Character[] board = new Character[9];

  public Board() {
    for (int i = 0; i < 9; i++) {
      board[i] = ' ';
    }
  }

  public void fillCell(int x, int y, char symb) {
    int index = 3 * x + y - 4;
    board[index] = symb;
  }

  public char getElement(int x, int y) {
    int index = 3 * x + y - 4;
    return board[index];
  }

  public void printBoard() {
    for (int i = 1; i < 4; i++) {
      for (int j = 1; j < 4; j++) {
        StringJoiner line = new StringJoiner(",", "[", "]");
        int index = 3 * x + y - 4;
        line.add(String.valueOf(board[index]);
        System.out.println(line.toString());
      }
    }
  }
}
