import java.util.StringJoiner;

public class BasicBoard implements Board {

  Character[] board = new Character[9];

  public BasicBoard() {
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
      StringJoiner line = new StringJoiner(",", "[", "]");
      for (int j = 1; j < 4; j++) {
        int index = 3 * i + j - 4;
        line.add(String.valueOf(board[index]));
      }
      System.out.println(line.toString());
    }
  }

  public boolean checkHorizontalLines() {
    return false;
  }

  public boolean checkVerticalLines() {
    return false;
  }

  public boolean checkDiagonals() {
    return false;
  }

  public boolean isFreeCell(int x, int y) {
    return getElement(x, y) == ' ';
  }
}
