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
    private JButton loginButton;
    private JButton newAppButton;
    private JButton seeResInfoButton;
    private JPanel newPanel;
    private JLabel userIdLabel;


    public LoginWindow() {
        super("User Login");
    }

    //calling constructor
    public void CreateLoginForm(){

        //create label for userID
        userIdLabel = new JLabel();
        userIdLabel.setText("Please enter ResidentID, StaffID, or VisitorID"); //set label value for textField

        //create text field to get userId from the user
        userIDField = new JTextField(15); //set length of the text


        //create login button
        loginButton = new JButton("Login");     //set label to login button
        newAppButton = new JButton("Start New Application");
        seeResInfoButton = new JButton("See Residence Information");

        //create panel to put form elements
        newPanel = new JPanel(new GridLayout(5,1));
        newPanel.add(userIdLabel); //set username label to panel
        newPanel.add(userIDField); //set text field to panel
        newPanel.add(loginButton); //set button to panel
        newPanel.add(newAppButton);
        newPanel.add(seeResInfoButton);

        //set border to panel
        add(newPanel, BorderLayout.CENTER);

        //perform action on button click
        loginButton.addActionListener(this);
        newAppButton.addActionListener(this);
        seeResInfoButton.addActionListener(this);
        setTitle("Login");
    }


    public void actionPerformed(ActionEvent ae) {
        String userValue = userIDField.getText();    // get user entered userID

        if (ae.getSource() == loginButton) {
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
        } else if (ae.getSource() == newAppButton) {
            NewApplicantPage newApplicantPage = new NewApplicantPage();
            newApplicantPage.setVisible(true);
        } else if (ae.getSource() == seeResInfoButton ) {
            ResidenceInfoPage residenceInfoPage = new ResidenceInfoPage();
            residenceInfoPage.setVisible(true);
        }
        else {
            // show error message
            System.out.println("Please enter valid userId or click a button");
        }
    }
}
