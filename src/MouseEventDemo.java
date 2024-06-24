import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener {

    public MouseEventDemo() {
        addMouseListener(this);
        setSize(300, 300);
        setTitle("Mouse Event Demo");
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered at: " + e.getX() + ", " + e.getY());
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited at: " + e.getX() + ", " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed at: " + e.getX() + ", " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released at: " + e.getX() + ", " + e.getY());
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}

