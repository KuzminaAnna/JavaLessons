import java.util.Scanner;

public class TicTacToeGame {

  public Board gameBoard;
  public Player player1;
  public Player player2;
  public Player currentPlayer;

  public TicTacToeGame(Board gameBoard) {
    this.gameBoard = gameBoard;
    player1 = new Player("Stas", 'X');
    player2 = new Player("Anna", 'O');
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
    Scanner scan = new Scanner(System.in);
    String index = scan.next();
    int x = (int) index.charAt(0) - 48;
    int y = (int) index.charAt(1) - 48;
    gameBoard.fillCell(x , y, currentPlayer.getSymbol());
    changePlayer();
  }

  public String calculateWinner() {
    return "The winner is " + currentPlayer.getName();
  }
}
