package builder;

public class ApartmentBuilder {
  private int sqm = -1;
  private int rooms = -1;
  private String city = "";
  private String area = "";
  private boolean kitchen = false;

  public ApartmentBuilder setSqm(int sqm) {
    this.sqm = sqm;
    return this;
  }

  public ApartmentBuilder setRooms(int rooms) {
    this.rooms = rooms;
    return this;
  }

  public ApartmentBuilder setCity(String city) {
    this.city = city;
    return this;
  }

  public ApartmentBuilder setArea(String area) {
    this.area = area;
    return this;
  }

  public ApartmentBuilder setKitchen(boolean kitchen) {
    this.kitchen = kitchen;
    return this;
  }

  public Aparment build() {
    Aparment ap = new Aparment(sqm, rooms, city, area, kitchen);
    sqm = -1;
    rooms = -1;
    city = "";
    area = "";
    kitchen = false;
    return ap;
  }

}
