package DemoClasses;

public class Some {
    private static int sum = 0;

    synchronized public void syncMethod() {
        try {
            sum = sum + 100;
            Thread.sleep((int) (1000 * Math.random()));
            System.out.println("SyncMethod sum is " + sum);
        } catch (InterruptedException e) {
            return;
        }

    }

    synchronized public static void staticSyncMethod() {
        try {
            sum = sum + 100;
            Thread.sleep((int) (1000 * Math.random()));
            System.out.println("Static SyncMethod sum is " + sum);
        } catch (InterruptedException e) {
            return;
        }
    }

    public void method() {
        try {
            sum = sum + 100;
            Thread.sleep((int) (1000 * Math.random()));
        } catch (InterruptedException e) {
            return;
        }

        System.out.println("Method sum is " + sum);

    }
}
