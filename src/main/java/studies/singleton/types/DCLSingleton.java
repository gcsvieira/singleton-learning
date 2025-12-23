package studies.singleton.types;

/**
 * <p>Double-Checked Locking singletons are considered dated and complex to use.</p>
 * <p>They achieve thread-safety by using the synchronized and volatile keywords.</p>
 * <p>They have their constructors private by design, preventing creation of new instances.</p>
 * <p>They do a double null check in case two threads need access to it at the same time. The synchronized call locks the operation within to guarantee only one thread does it at a time. After it finishes, the other thread won't pass the second null check and the instance returned will be the same.</p>
 * <p>The caveat of this is: complexity, reflections and serialization. Thread safety is handled by the developer, which can lead to errors.
 * Bill Pugh Singleton solves this with a few adjustments.</p>
 */
public class DCLSingleton {
    private static volatile DCLSingleton instance;
    
    private DCLSingleton(){
    }

    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (HSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
