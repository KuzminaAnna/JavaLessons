import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestMocGame {

  @Mock
  private Board testBoard;

  @Mock
  private Player player1;

  @Test
  public void testGameOver() {
    when(testBoard.checkHorizontalLines()).thenReturn(true);
    when(testBoard.checkVerticalLines()).thenReturn(false);
    when(testBoard.checkDiagonals()).thenReturn(false);
    TicTacToeGame game = new TicTacToeGame(testBoard, player1, player1);
    boolean gameComplete = game.gameOver();
    assertThat(gameComplete, is(true));
    }


  }
