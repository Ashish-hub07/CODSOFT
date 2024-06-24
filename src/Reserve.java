class Reserve extends Thread {

    static int available = 5; // Total number of available berths

    int wanted;

    Reserve(int w) {
        wanted = w;
    }

    public void run() {
        synchronized(Reserve.class) { // Synchronize on a shared object
            System.out.println("Available Berths = " + available);
            if (available >= wanted) {
                System.out.println(wanted + " Berths are reserved for " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                    available -= wanted; // Update the available berths
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("Sorry, no more berths available");
            }
        }
    }
}

 class ThreadSafe {
    public static void main(String[] args) {
        Reserve ob = new Reserve(3); // Initialize Reserve object with the number of wanted berths
        Thread t1 = new Thread(ob, "Hari");
        Thread t2 = new Thread(ob, "Gopal");
        t1.start();
        t2.start();
    }
}
