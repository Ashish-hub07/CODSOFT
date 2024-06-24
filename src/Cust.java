class Bus implements Runnable {
    int available = 1, passanger;

    Bus(int passanger) {
        this.passanger = passanger;
    }

    public synchronized void run() {
        String name = Thread.currentThread().getName();
       
        if (available >= passanger) {
            System.out.println(name + "seat neigala ");
            available=available-passanger;
        } else {
            System.out.println("sorry au seat nhi");
        }
    }
}
class Cust
{
    public static void main(String[] args) {
        Bus c1=new Bus(1);
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c1);
        Thread t3=new Thread(c1);
        t1.setName("ashi");
        t2.setName("manas");
        t3.setName("tukula");
        t1.start();
        t2.start();
        t3.start();
    }
}






