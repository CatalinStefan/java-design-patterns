package singleton;
public class SingletonEagerTest {
  
  public static void main(String [] args) {
    SingletonEager eagetInstance1 = SingletonEager.getEagerInstance();
    SingletonEager eagetInstance2 = SingletonEager.getEagerInstance();

    System.out.println(eagetInstance1);
    System.out.println(eagetInstance2);
  }
}
