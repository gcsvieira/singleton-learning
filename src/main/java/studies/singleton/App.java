package studies.singleton;

import studies.singleton.types.DCLSingleton;
import studies.singleton.types.ESingleton;
import studies.singleton.types.HSingleton;

public class App {
    public static void main(String[] args) {
        // Enum Singleton (1st)
        ESingleton singleton5 = ESingleton.INSTANCE;
        ESingleton singleton6 = ESingleton.INSTANCE;

        if (singleton5 == singleton6) {
            System.out.println("ESingleton 5 and 6 are the same.");
        }

        // Holder Singleton (2nd)
        HSingleton singleton1 = HSingleton.getInstance();
        HSingleton singleton2 = HSingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("HSingleton 1 and 2 are the same.");
        }

        // Double-Checked Locking Singleton (not recommended)
        DCLSingleton singleton3 = DCLSingleton.getInstance();
        DCLSingleton singleton4 = DCLSingleton.getInstance();

        if (singleton3 == singleton4) {
            System.out.println("DCLSingleton 3 and 4 are the same.");
        }
    }
}