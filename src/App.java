public class App {
    public static void main(String[] args) throws Exception {
        // anonymous
        Runnable r = ()->{
            System.out.println("Hello, World! in Runnable");
        };
        r.run();
        r.run();

        Thread t = new Thread(new HelloWorld());
        t.start();

        Thread t2 = new Thread(r);
        t2.start();
        // Thread can't be started twice
        // t2.start();


        System.out.println("Hello, World! in main");
    }
}
