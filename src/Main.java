abstract class Shape {
    int sides;

    Shape(int s) {
        sides = s;
    }

    abstract void display();
}

class Rectangle extends Shape {
    Rectangle() {
        super(4);
    }

    void display() {
        System.out.println("Rectangle  sides"+ sides);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.display();
    }
}

