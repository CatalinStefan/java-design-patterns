package chainofresponsibility;

public class ContentTypeHandler implements HandlerChain {

  String contentType;
  public HandlerChain next;

  public ContentTypeHandler(String contentType) {
    this.contentType = contentType;
  }

  @Override
  public String addHandler(String inputHeader) {
    String outputHeader = inputHeader + "\nContentType: " + contentType;
    if (next == null)
      return outputHeader;
    else
      return next.addHandler(outputHeader);
  }
  
}
