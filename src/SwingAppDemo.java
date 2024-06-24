import javax.swing.*;
import java.awt.*;

public class SwingAppDemo {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Add JLabel
        JLabel nameLabel = new JLabel("Name:");
        panel.add(nameLabel);

        // Add JTextField
        JTextField nameField = new JTextField(20);
        panel.add(nameField);

        // Add JLabel
        JLabel ageLabel = new JLabel("Age:");
        panel.add(ageLabel);

        // Add JSpinner for age
        SpinnerModel ageModel = new SpinnerNumberModel(18, 0, 120, 1);
        JSpinner ageSpinner = new JSpinner(ageModel);
        panel.add(ageSpinner);

        // Add JButton
        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        // Add ActionListener to JButton
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            int age = (int) ageSpinner.getValue();
            JOptionPane.showMessageDialog(frame, "Name: " + name + "\nAge: " + age);
        });

        // Add panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}

