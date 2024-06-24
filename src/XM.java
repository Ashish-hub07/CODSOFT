import javax.swing.*;
import java.awt.event.*;

public class XM extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    XM() {
        setTitle("Swing Application");
        setSize(400, 200);
       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        button = new JButton("Click me");
        button.setBounds(20, 60, 100, 30);
        button.addActionListener(this);
        add(button);

        textField = new JTextField();
        textField.setBounds(20, 100, 200, 30);
        textField.setEditable(false);
        add(textField);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            textField.setText("welcome");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new XM();
            }
        });
    }
}
