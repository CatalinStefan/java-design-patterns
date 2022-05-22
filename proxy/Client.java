package proxy;

public class Client {
  public static void main(String[] args) {
    Image image = new ProxyImage("test.png");

    image.display();
    System.out.println("");
    image.display();
  }
}
