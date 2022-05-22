package observer;

public class LogOpenListener implements EventListener {

  @Override
  public void notify(String eventType, String file) {
    System.out.println("LogOpenListener: " + eventType + " performed on file " + file);
  }
  
}
