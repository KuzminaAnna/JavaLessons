import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameTest {

  @Test
  public void testGameOver() {
    Board testBoard = new TestBoard();
    TicTacToeGame game = new TicTacToeGame(testBoard);
    boolean gameComplete = game.gameOver();
    assertThat(gameComplete, is(true));
    }

    private class TestBoard implements Board {
      public void fillCell(int x, int y, char symb) {

      }

      public char getElement(int x, int y) {
        return 0;
      }

      public void printBoard() {

      }

      public boolean checkHorizontalLines() {
        return true;
      }

      public boolean checkVerticalLines() {
        return false;
      }

      public boolean checkDiagonals() {
        return false;
      }
    }
  }
