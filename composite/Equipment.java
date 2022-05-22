package composite;

public class Equipment {

  private String name;
  private int price;

  public Equipment(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }
  
}
