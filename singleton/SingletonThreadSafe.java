package singleton;
public class SingletonThreadSafe {
  
  private static SingletonThreadSafe threadSafeInstance;

  private SingletonThreadSafe() {

  }

  public static SingletonThreadSafe getInstance() {
    synchronized(SingletonThreadSafe.class) {
      if(threadSafeInstance == null) {
        threadSafeInstance = new SingletonThreadSafe();
      }
    }

    return threadSafeInstance;
  }
}
