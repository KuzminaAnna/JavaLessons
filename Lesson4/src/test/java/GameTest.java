import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameTest {

  Player player1 = new Human("Stas", 'x');
  Player player2 = new ComputerPlayer('o');

  @Test
  public void testGameOver() {
    Board testBoard = new TestBoard();
    TicTacToeGame game = new TicTacToeGame(testBoard, player1, player2);
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

      public boolean isFreeCell(int x, int y) {
        return true;
      }
    }
  }
