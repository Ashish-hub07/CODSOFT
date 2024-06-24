import java.awt.*;
import java.awt.event.*;

public class SimpleAWTApplication extends Frame implements ActionListener {
    private Label nameLabel, ageLabel;
    private TextField nameTextField, ageTextField;
    private Button submitButton;
    private MenuBar menuBar;
    private Menu fileMenu, helpMenu;
    private MenuItem exitItem, aboutItem;

    public SimpleAWTApplication() {
        setTitle("Simple AWT Application");
        setSize(400, 300);

        nameLabel = new Label("Name:");
        nameTextField = new TextField(20);
        ageLabel = new Label("Age:");
        ageTextField = new TextField(5);
        submitButton = new Button("Submit");

        menuBar = new MenuBar();
        fileMenu = new Menu("File");
        helpMenu = new Menu("Help");
        exitItem = new MenuItem("Exit");
        aboutItem = new MenuItem("About");

        fileMenu.add(exitItem);
        helpMenu.add(aboutItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        setLayout(new FlowLayout());

        add(nameLabel);
        add(nameTextField);
        add(ageLabel);
        add(ageTextField);
        add(submitButton);

        setMenuBar(menuBar);

        submitButton.addActionListener(this);
        exitItem.addActionListener(this);
        aboutItem.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameTextField.getText();
            String age = ageTextField.getText();
            System.out.println("Name: " + name + ", Age: " + age);
        } else if (e.getSource() == exitItem) {
            System.exit(0);
        } else if (e.getSource() == aboutItem) {
            // Implement About dialog box or information display
            System.out.println("plese contact with our sir");
        }
    }

    public static void main(String[] args) {
        new SimpleAWTApplication();
    }
}
