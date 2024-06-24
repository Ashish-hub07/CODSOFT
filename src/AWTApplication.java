import java.awt.*;
import java.awt.event.*;

public class AWTApplication extends Frame {
    private Label nameLabel, ageLabel;
    private TextField nameTextField, ageTextField;
    private Button submitButton;
    private MenuBar menuBar;
    private Menu fileMenu, helpMenu;
    private MenuItem exitItem, aboutItem;

    public AWTApplication() {
        setTitle("AWT Application");
        setSize(300, 200);

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

        setLayout(new GridLayout(3, 2));

        add(nameLabel);
        add(nameTextField);
        add(ageLabel);
        add(ageTextField);
        add(submitButton);

        setMenuBar(menuBar);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String age = ageTextField.getText();
                System.out.println("Name: " + name + ", Age: " + age);
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement About dialog box or information display
                System.out.println("About...");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTApplication();
    }
}

