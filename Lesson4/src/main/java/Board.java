public interface Board {

  public void fillCell(int x, int y, char symb);

  public char getElement(int x, int y);

  public void printBoard();

  public boolean checkHorizontalLines();

  public boolean checkVerticalLines();

  public boolean checkDiagonals();
}
