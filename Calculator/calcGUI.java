package Projects.Calculator;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class calcGUI {
    private JFrame calcFrame;

    public calcGUI() {

        JFrame calcFrame = new JFrame();
        calcFrame.setTitle("Calulator 1.0");
        calcFrame.setSize(220, 250);
        calcFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        calcFrame.setLayout(null);

        JLabel label = new JLabel("Hello!", JLabel.CENTER);
        calcFrame.add(label);

        //Adds 9 buttons for inputting numbers
        JButton numberOneButton = new JButton("1");
        calcFrame.add(numberOneButton);
        numberOneButton.setBounds(25, 100, 41, 20);

        JButton numberTwoButton = new JButton("2");
        calcFrame.add(numberTwoButton);
        numberTwoButton.setBounds(66, 100, 41, 20);

        JButton numberThreeButton = new JButton("3");
        calcFrame.add(numberThreeButton);
        numberThreeButton.setBounds(107, 100, 41, 20);

        JButton numberFourButton = new JButton("4");
        calcFrame.add(numberFourButton);
        numberFourButton.setBounds(25, 120, 41, 20);

        JButton numberFiveButton = new JButton("5");
        calcFrame.add(numberFiveButton);
        numberFiveButton.setBounds(66, 120, 41, 20);

        JButton numberSixButton = new JButton("6");
        calcFrame.add(numberSixButton);
        numberSixButton.setBounds(107, 120, 41, 20);

        JButton numberSevenButton = new JButton("7");
         calcFrame.add(numberSevenButton);
        numberSevenButton.setBounds(25, 140, 41, 20);

        JButton numberEightButton = new JButton("8");
        calcFrame.add(numberEightButton);
        numberEightButton.setBounds(66, 140, 41, 20);

        JButton numberNineButton = new JButton("9");
        calcFrame.add(numberNineButton);
        numberNineButton.setBounds(107, 140, 41, 20);
            
        JButton numberZeroButton = new JButton("0");
        calcFrame.add(numberZeroButton);
        numberZeroButton.setBounds(66, 160, 41, 20);
        //End of adding numerical buttons

        JButton clearButton = new JButton("C");
        calcFrame.add(clearButton);
        clearButton.setBounds(65, 70, 43, 20);

        JButton addButton = new JButton("+");
        calcFrame.add(addButton);
        addButton.setBounds(150, 90, 41, 20);

        JButton subtractButton = new JButton("-");
        calcFrame.add(subtractButton);
        subtractButton.setBounds(150, 110, 41, 20);

        JButton multiplyButton = new JButton("*");
        calcFrame.add(multiplyButton);
        multiplyButton.setBounds(150, 130, 41, 20);

        JButton divideButton = new JButton("/");
        calcFrame.add(divideButton);
        divideButton.setBounds(150, 150, 41, 20);

        JButton equalsButton = new JButton("=");
        calcFrame.add(equalsButton);
        equalsButton.setBounds(150, 175, 41, 20);
        //End of all buttons

        //Start of text field for numbers
        JTextField calcNumberField = new JTextField();
        calcFrame.add(calcNumberField);
        calcNumberField.setBounds(25, 40, 123, 20);
        //End of text field for numbers

        //Start of actionListeners for buttons
        numberOneButton.addActionListener(e -> calcNumberField.setText(calcNumberField.getText() + "1"));
        numberTwoButton.addActionListener(e -> calcNumberField.setText(calcNumberField.getText() + "2"));
        numberThreeButton.addActionListener(e -> calcNumberField.setText(calcNumberField.getText() + "3"));
        numberFourButton.addActionListener(e -> calcNumberField.setText(calcNumberField.getText() + "4"));
        numberFiveButton.addActionListener(e -> calcNumberField.setText(calcNumberField.getText() + "5"));
        numberSixButton.addActionListener(e -> calcNumberField.setText(calcNumberField.getText() + "6"));
        numberSevenButton.addActionListener(e -> calcNumberField.setText(calcNumberField.getText() + "7"));
        numberEightButton.addActionListener(e -> calcNumberField.setText(calcNumberField.getText() + "8"));
        numberNineButton.addActionListener(e -> calcNumberField.setText(calcNumberField.getText() + "9"));
        numberZeroButton.addActionListener(e -> calcNumberField.setText(calcNumberField.getText() + "0"));
        clearButton.addActionListener(e -> calcNumberField.setText(""));
        //End of actionListeners for buttons

        calcFrame.setVisible(true);
    };
    public void display() {
        calcFrame.setVisible(true);
    }
}