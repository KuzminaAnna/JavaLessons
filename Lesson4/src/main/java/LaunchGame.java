public class LaunchGame {

  public static void main(String[] args) {
    Board gameBoard = new BasicBoard();
    TicTacToeGame game = new TicTacToeGame(gameBoard);
    game.startGame();
  }
}
