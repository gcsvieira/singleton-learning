package studies.singleton.types;

/**
 * <p>Enum singletons suit 90% of use cases.</p>
 * <p>They are naturally thread-safe, secure, immutable and simple to read by design.</p>
 * <p>Keep in mind they're eager, and not lazy, which means they'll probably be instantiated when they're not needed. But that's fine honestly.</p>
 * <p>Their use is heavily recommended, but there are situations where you'll need your singleton class as an object.</p>
 * <p>For example: Enums naturally inherit the Java Enum class, so using another inheritance with them is out of the question. Also, if you need to pass arguments, they need to be known at compile time.</p>
 */
public enum ESingleton {
    INSTANCE;

    private String importantData = "important credentials";

    public void connect() {
        System.out.printf("Connecting to important data using {}", importantData);
    }

    public String getImportantData() {
        return importantData;
    }
}
