package prototype;

public abstract class Vehicle {
  public int wheels;
  public long price;

  public Vehicle() {

  }

  public Vehicle(Vehicle target) {
    if(target != null) {
      this.wheels = target.wheels;
      this.price = target.price;
    }
  }

  public abstract Vehicle clone();

  public abstract boolean isClone(Vehicle target);
  
}
