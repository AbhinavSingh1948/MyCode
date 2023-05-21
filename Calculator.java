import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame {
    private JTextField displayField;
    private double result;
    private String operator;
    private boolean isOperatorClicked;

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        displayField = new JTextField(15);
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font(Font.DIALOG, Font.BOLD, 20));

            if (Character.isDigit(label.charAt(0)) || label.equals("0")) {
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        numberButtonActionPerformed(label);
                    }
                });
            } else if (label.equals("C")) {
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        clearButtonActionPerformed();
                    }
                });
            } else if (label.equals("=")) {
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        equalsButtonActionPerformed();
                    }
                });
            } else {
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        operatorButtonActionPerformed(label);
                    }
                });
            }

            buttonPanel.add(button);
        }

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(10, 10));
        contentPane.add(displayField, BorderLayout.NORTH);
        contentPane.add(buttonPanel, BorderLayout.CENTER);
    }

    private void numberButtonActionPerformed(String number) {
        if (isOperatorClicked) {
            displayField.setText(number);
            isOperatorClicked = false;
        } else {
            String currentText = displayField.getText();
            displayField.setText(currentText + number);
        }
    }

    private void operatorButtonActionPerformed(String operator) {
        this.operator = operator;
        result = Double.parseDouble(displayField.getText());
        isOperatorClicked = true;
    }

    private void equalsButtonActionPerformed() {
        double secondOperand = Double.parseDouble(displayField.getText());

        if (operator.equals("+")) {
            result += secondOperand;
        } else if (operator.equals("-")) {
            result -= secondOperand;
        } else if (operator.equals("*")) {
            result *= secondOperand;
        } else if (operator.equals("/")) {
            result /= secondOperand;
        }

        displayField.setText(String.valueOf(result));
        isOperatorClicked = true;
    }

    private void clearButtonActionPerformed() {
        displayField.setText("");
        result = 0;
        isOperatorClicked = false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Calculator calculator = new Calculator();
                calculator.setVisible(true);
            }
        });
    }
}
