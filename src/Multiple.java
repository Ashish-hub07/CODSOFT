interface A {
    void show();
}

interface B {
    void show();
}

public class Multiple implements A, B {
    @Override
    public void show() {
        System.out.println("Implementing interfaces A and B");
    }

    public static void main(String[] args) {
        Multiple m = new Multiple();
        m.show();
    }
}

