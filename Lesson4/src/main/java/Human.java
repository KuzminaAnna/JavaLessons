import java.util.Scanner;

public class Human implements Player {

  private String playerName;
  private char symbol;

  public Human(String playerName, char symbol) {
    this.playerName = playerName;
    this.symbol = symbol;
  }

  public String getName() {
    return playerName;
  }

  public char getSymbol() {
    return symbol;
  }

  public int[] move() {
    Scanner scan = new Scanner(System.in);
    String index = scan.next();
    int x = (int) index.charAt(0) - 48;
    int y = (int) index.charAt(1) - 48;
    int[] result = {x, y};
    return result;
  }



}
