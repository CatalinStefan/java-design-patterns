package singleton;
public class SingletonLazyTest {
  
  public static void main(String [] args) {
    SingletonLazy lazyInstance1 = SingletonLazy.getInstance();
    SingletonLazy lazyInstance2 = SingletonLazy.getInstance();

    System.out.println(lazyInstance1);
    System.out.println(lazyInstance2);
  }
}
