

import DemoClasses.Some;

public class BlockThread {
    public static void main(String[] args) {
        Some s = new Some();
        Runnable r = () -> {
            s.syncMethod();

            // Don't use static
            // Some.staticSyncMethod();


            // will block invoke s.method()
            synchronized (s) {
                s.method();
            }
        };
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
    }
}
