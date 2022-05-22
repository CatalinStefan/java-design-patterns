package chainofresponsibility;

public class Client {
  public static void main(String[] args) {
    AuthenticationHandler auth = new AuthenticationHandler("12345");
    ContentTypeHandler type = new ContentTypeHandler("json");
    PayloadHandler payload = new PayloadHandler("Body: {\"username\" = \"john\"}");

    auth.next = type;
    type.next = payload;

    String withAuthentication = auth.addHandler("Headers with authentication");
    System.out.println(withAuthentication);

    System.out.println("");
    String withoutAuthentication = type.addHandler("Headers without authentication");
    System.out.println(withoutAuthentication);
  }
}
