import javax.swing.*;
import java.awt.*;

public class SimpleSwingApp {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Swing App");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel(new GridLayout(3, 2));
        p.add(new JLabel("Name:"));
        JTextField n = new JTextField(20);
        p.add(n);
        p.add(new JLabel("Age:"));
        p.add(new JSpinner(new SpinnerNumberModel(18, 0, 120, 1)));

        JButton b = new JButton("Submit");
        p.add(b);

        b.addActionListener(e -> JOptionPane.showMessageDialog(f,
                "Name: " + n.getText() + "\nAge: " + ((JSpinner.DefaultEditor) ((JSpinner) p.getComponent(3)).getEditor()).getTextField().getText()));

        f.add(p);
        f.setSize(300, 150);
        f.setVisible(true);
    }
}
