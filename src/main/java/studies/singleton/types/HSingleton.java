package studies.singleton.types;

public class HSingleton {

    /**
     * <p>Bill Pugh Singletons are the best solution for lazy singletons. They are considered an evolution of the DCL Singleton.</p>
     * <p>They delegate thread-safety to the JVM, preventing developers of committing type mistakes.</p>
     * <p>They delegate the instance to an inner class that will only be loaded when it is explicitly called.</p>
     * <p>They are also simple to read and aren't heavily nested. Overall, if you need a lazy singleton, this is the go-to.</p>
     * <p>The caveats are: even though their constructors are private, you can still access them using reflections. Or, if your singleton implements serialization, saving it to a file and loading it back will create a new object.</p>
     * <p>To fix the Reflection issue, you can add an if check on the constructor.</p>
     * <p>To fix the serialization issue, you can add a readResolve function.</p>
     */
    private HSingleton() {
        if (InstanceHolder.instance != null) {
            throw new IllegalStateException("Instance already exists!");
        }
    }

    private static final class InstanceHolder {
        private static final HSingleton instance = new HSingleton();
    }

    public static HSingleton getInstance() {
        return InstanceHolder.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}

