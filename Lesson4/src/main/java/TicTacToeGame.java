public class TicTacToeGame {

  private Board gameBoard;
  private Player player1;
  private Player player2;
  private Player currentPlayer;

  public TicTacToeGame(Board gameBoard, Player player1, Player player2) {
    this.gameBoard = gameBoard;
    this.player1 = player1;
    this.player2 = player2;
    currentPlayer = player1;
  }

  public void startGame() {
    gameBoard.printBoard();
    while (!gameOver()) {
      move();
      gameBoard.printBoard();
    }
    String result = calculateWinner();
    System.out.println(result);
  }

  public void changePlayer() {
      if (currentPlayer == player1) {
        currentPlayer = player2;
      } else {
        currentPlayer = player1;
      }
    }


  public boolean gameOver() {
    return gameBoard.checkHorizontalLines()
      || gameBoard.checkVerticalLines()
      || gameBoard.checkDiagonals();
  }

  public void move() {
    int[] moveResult;
    do {
      moveResult = currentPlayer.move();
    } while (!gameBoard.isFreeCell(moveResult[0], moveResult[1]));
    gameBoard.fillCell(moveResult[0], moveResult[1], currentPlayer.getSymbol());
    changePlayer();
  }

  public String calculateWinner() {
    return "The winner is " + currentPlayer.getName();
  }
}
