package builder;

public class Client {

  public static void main(String[] args) {
    ApartmentBuilder builder = new ApartmentBuilder();

    Aparment ap1 = builder
      .setSqm(25)
      .setRooms(2)
      .setCity("London")
      .setArea("Kensington")
      .setKitchen(true)
      .build();
    ap1.display();

    Aparment ap2 = builder.setRooms(3).setCity("Paris").build();
    ap2.display();
  }
}
