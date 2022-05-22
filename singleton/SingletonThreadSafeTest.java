package singleton;
public class SingletonThreadSafeTest {
  public static void main(String [] args) {
    SingletonThreadSafe lazyInstance1 = SingletonThreadSafe.getInstance();
    SingletonThreadSafe lazyInstance2 = SingletonThreadSafe.getInstance();

    System.out.println(lazyInstance1);
    System.out.println(lazyInstance2);
  }
}
