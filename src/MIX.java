import java.awt.*;
import java.awt.event.*;

public class MIX extends Frame implements ActionListener {
    Button b;
    TextField txt;

    MIX() {
        b = new Button("Click me");
        b.setBounds(200, 50, 50, 50);
        add(b);

        Label l = new Label();
        l.setBounds(100, 50, 50, 50);
        l.setText("Button");
        add(l);

        txt = new TextField();
        txt.setBounds(300, 100, 500, 100);
        txt.setText("if you want to know me then cliclk");
        add(txt);

        MenuBar mb = new MenuBar();
        Menu m = new Menu("Menu");
       setMenuBar(mb);

        mb.add(m);

        MenuItem i1 = new MenuItem("File");
        MenuItem i2 = new MenuItem("Edit");
        MenuItem i3 = new MenuItem("Format");
        m.add(i1);
        m.add(i2);
        m.add(i3);


        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        txt.setText("follow me on insta cool_ishan");
    }

    public static void main(String[] args) {
        new MIX();
    }
}
