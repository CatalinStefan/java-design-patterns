package singleton;
public class SingletonBillPughTest {
  public static void main(String [] args) {
    SingletonBillPugh lazyInstance1 = SingletonBillPugh.getInstance();
    SingletonBillPugh lazyInstance2 = SingletonBillPugh.getInstance();

    System.out.println(lazyInstance1);
    System.out.println(lazyInstance2);
  }
}
