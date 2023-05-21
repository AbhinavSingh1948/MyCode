import java.awt.*;
import java.awt.event.*;

public class FeedbackForm extends Frame {
    private Label nameLabel, emailLabel, commentLabel;
    private TextField nameField, emailField;
    private TextArea commentArea;
    private Button submitButton;

    public FeedbackForm() {
        super("Feedback Form");

        nameLabel = new Label("Name:");
        emailLabel = new Label("Email:");
        commentLabel = new Label("Comments:");

        nameField = new TextField(30);
        emailField = new TextField(30);

        commentArea = new TextArea(10, 30);

        submitButton = new Button("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Send the feedback to the server or save it to a file
                System.out.println("Feedback submitted.");
                dispose();
            }
        });

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(emailLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(commentLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(commentArea, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(submitButton, gbc);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        FeedbackForm form = new FeedbackForm();
        form.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
