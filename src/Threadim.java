public class Threadim implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        Threadim threadImp = new Threadim();
        Thread thread = new Thread(threadImp);
        thread.start();
    }
}

