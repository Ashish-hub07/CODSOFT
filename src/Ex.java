public class Ex {
    Ex() {
        System.out.println("ashish");
    }

    Ex(int a, int b) {
        System.out.println("add = " + (a + b));
    }

    public void add() {
        System.out.println("ashishh");
    }

    public static void main(String[] args) {
        Ex x = new Ex();
        Ex f=new Ex(5,6);
        x.add();
    }
}
