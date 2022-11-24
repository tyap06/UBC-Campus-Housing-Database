package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// This class is based on the LoginWindow class from the sample project Java from tutorial 6

public class LoginWindow extends JFrame implements ActionListener {

    //initialize button, panel, label, and textfield
    private static final int TEXT_FIELD_WIDTH = 10;
    private JTextField userIDField;
    private JButton b1;
    private JPanel newPanel;
    private JLabel userIdLabel;


    public LoginWindow() {
        super("User Login");
    }

    //calling constructor
    public void CreateLoginForm(){

        //create label for userID
        userIdLabel = new JLabel();
        userIdLabel.setText("UserId"); //set label value for textField

        //create text field to get userId from the user
        userIDField = new JTextField(15); //set length of the text

        //create login button
        b1 = new JButton("Login"); //set label to button

        //create panel to put form elements
        newPanel = new JPanel(new GridLayout(3,1));
        newPanel.add(userIdLabel); //set username label to panel
        newPanel.add(userIDField); //set text field to panel
        newPanel.add(b1);          //set button to panel

        //set border to panel
        add(newPanel, BorderLayout.CENTER);

        //perform action on button click
        b1.addActionListener(this);
        setTitle("LOGIN FORM");
    }

    // define abstract method actionPerformed() which will be called on button click
    public void actionPerformed(ActionEvent ae) {
        String userValue = userIDField.getText();    // get user entered userID

        // check whether credentials are authentic or not
        // Resident or Staff or Visitor
        //TODO
        if(userValue.equals("1")) {
            //create new instance of User information based on resident, staff, and visitor

            ResidentInfoPage residentInfoPage = new ResidentInfoPage();

            //make page visible to user
            residentInfoPage.setVisible(true);
        }
        else {
            //show error message
            System.out.println("Please enter valid userID");
        }
    }
}
