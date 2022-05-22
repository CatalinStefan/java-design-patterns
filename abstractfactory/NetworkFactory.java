package abstractfactory;

public class NetworkFactory implements DataSourceAbstractFactory{

  @Override
  public Service createService() {
    return new NetworkService();
  }

  @Override
  public Response createResponse() {
    return new NetworkResponse();
  }
  
}
