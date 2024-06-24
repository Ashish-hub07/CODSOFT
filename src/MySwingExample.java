import javax.swing.*;
import java.awt.event.*;

public class MySwingExample extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    public MySwingExample() {
        setTitle("Simple Swing Example");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        label = new JLabel("Hello, Swing!");
        label.setBounds(20, 20, 200, 30);
        add(label);

        button = new JButton("Click me");
        button.setBounds(20, 60, 100, 30);
        button.addActionListener(this);
        add(button);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setText("Button clicked!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MySwingExample();
            }
        });
    }
}
