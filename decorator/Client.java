package decorator;

public class Client {
  public static void main(String[] args) {
    NormalCoffeeMachine normal = new NormalCoffeeMachine();
    EnhancedCoffeeMachine enhanced = new EnhancedCoffeeMachine(normal);

    normal.makeSmallCoffee();
    normal.makeLargeCoffee();
    enhanced.makeSmallCoffee();
    enhanced.makeLargeCoffee();
    enhanced.makeMilkCoffee();
  }
}
