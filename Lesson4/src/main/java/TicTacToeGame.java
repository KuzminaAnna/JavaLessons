public class TicTacToeGame {

  public Board gameBoard;
  public Player player1;
  public Player player2;
  public Player currentPlayer;

  public TicTacToeGame() {
    gameBoard = new Board();
    player1 = new Player("Stas", 'X');
    player2 = new Player("Anna", 'O');
    currentPlayer = player1;
  }

  public startGame() {
    gameBoard.printBoard();
    while (!gameOver()) {
      move();
      gameBoard.printBoard();
    }
    String result = calculateWinner();
    System.out.println(result);
  }

  public Player changePlayer() {

  }

  public boolean gameOver() {

  }

  public void move() {
    Scanner
    gameBoard.fillCell(x , y, currentPlayer.getSymbol());
    currentPlayer = changePlayer();
  }

  public String calculateWinner() {

  }
}
