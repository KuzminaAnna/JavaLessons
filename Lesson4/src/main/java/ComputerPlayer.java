import java.util.Random;

public class ComputerPlayer implements Player {

    private char symbol;

    private Random randomizer = new Random();

    public ComputerPlayer(char symbol) {
      this.symbol = symbol;
    }

    public String getName() {
      return "Computer";
    }

    public char getSymbol() {
      return symbol;
    }

    public int[] move() {
      int x = randomizer.nextInt(3);
      int y = randomizer.nextInt(3);
      int[] result = {x, y};
      return result;
    }

}
