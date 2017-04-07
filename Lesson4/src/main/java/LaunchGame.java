public class LaunchGame {

  public static void main(String[] args) {
    Board gameBoard = new BasicBoard();
    Player player1 = new Human("Stas", 'x');
    Player player2 = new ComputerPlayer('o');
    TicTacToeGame game = new TicTacToeGame(gameBoard, player1, player2);
    game.startGame();

  }
}
