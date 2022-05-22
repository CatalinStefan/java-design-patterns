package strategy;

public class Executor {
  public PrintStrategy strategy;

  public Executor(PrintStrategy strategy) {
    this.strategy = strategy;
  }

  public void printString(String input) {
    System.out.println(strategy.formatString(input));
  }
}
