package composite;

import java.util.ArrayList;

public class Composite extends Equipment {
  private ArrayList<Equipment> equipments = new ArrayList<>();

  public Composite(String name) {
    super(name, 0);
  }

  public Composite add(Equipment equipment) {
    equipments.add(equipment);
    return this;
  }

  @Override
  public int getPrice() {
    int sum = 0;
    for (Equipment equipment : equipments) {
      sum += equipment.getPrice();
    }
    return sum;
  }
}
