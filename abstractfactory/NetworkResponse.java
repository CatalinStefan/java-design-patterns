package abstractfactory;

public class NetworkResponse implements Response {

  @Override
  public String getResponse() {
    return "Network response";
  }
}
