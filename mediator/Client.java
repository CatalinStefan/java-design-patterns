package mediator;

public class Client {
  public static void main(String[] args) {
    Mediator mediator = new Mediator();
    ChatUser alice = new ChatUser("Alice", mediator);
    ChatUser bob = new ChatUser("Bob", mediator);
    ChatUser carol = new ChatUser("Carol", mediator);

    mediator.addUser(alice).addUser(bob).addUser(carol);

    carol.sendMessage("Hello everyone!");
  }
}
