package abstractfactory;

public class NetworkService implements Service{

  @Override
  public String runService() {
    return "Network service running";
  }
  
}
