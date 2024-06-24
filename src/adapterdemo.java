import java.awt.*;
import java.awt.event.*;

public class adapterdemo extends MouseAdapter{
 Frame f;
    public adapterdemo () {
        f= new Frame();
        f.addMouseListener(this);
        f.setSize(300, 300);
       f. setTitle("Mouse Event Demo");
       f. setVisible(true);
    }

    public void mouseClicked(MouseEvent e)
    {

        System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
    }



    public static void main(String[] args) {
        new adapterdemo();
    }
}

