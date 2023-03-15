public class InterruptThread {
    public static void main(String[] args) throws Exception {
        // anonymous
        Runnable r = () -> {
            Thread ct = Thread.currentThread();
            while (!ct.isInterrupted()) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    return;
                }
            } 

            if(ct.isInterrupted()){
                System.out.println("Interrupt Thread");
            }
        };

        Thread t = new Thread(r);
        t.start();
        t.interrupt();

    }
}
