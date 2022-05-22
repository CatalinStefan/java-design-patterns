package command;

public class OrderExecuteCommand implements Command {

  int id;

  public OrderExecuteCommand(int id) {
    this.id = id;
  }

  @Override
  public void execute() {
    System.out.println("Order " + id + " executed");
  }
  
}
