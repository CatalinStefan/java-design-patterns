package prototype;

public class Bicycle extends Vehicle {
  private boolean cityBike;

  public Bicycle(int wheels, long price, boolean cityBike) {
    this.cityBike = cityBike;
    this.wheels = wheels;
    this.price = price;
  }

  public Bicycle(Bicycle target) {
    super(target);
    if (target != null) {
      this.cityBike = target.cityBike;
    }
  }

  @Override
  public Vehicle clone() {
    return new Bicycle(this);
  }

  @Override
  public boolean isClone(Vehicle target) {
    if (target instanceof Bicycle) {
      Bicycle t = (Bicycle) target;
      if (cityBike == t.cityBike && wheels == t.wheels && price == t.price) {
        System.out.println(this + " and " + t + " are clones");
        return true;
      }
    }
    System.out.println(this + " and " + target + " are NOT clones");
    return false;
  }
  
}
