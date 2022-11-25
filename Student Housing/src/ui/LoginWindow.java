package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// This class is based on the LoginWindow class from the sample project Java from tutorial 6

public class LoginWindow extends JFrame implements ActionListener {

    //initialize button, panel, label, and textfield
    private static final int TEXT_FIELD_WIDTH = 10;
    private JTextField studentUserIDField;
    private  JTextField staffUserIDField;
    private JTextField visitorUserIDField;
    private JButton studentLoginButton;
    private JButton staffLoginButton;
    private JButton visitorLoginButton;
    private JButton newAppButton;
    private JButton seeResInfoButton;
    private JPanel newPanel;
    private JLabel studentUserIdLabel;
    private JLabel staffUserIdLabel;
    private JLabel visitorUserIdLabel;
    private java.util.List<String> residentInfo = new ArrayList<String>();


    public LoginWindow() {
        super("User Login");
    }

    //calling constructor
    public void CreateLoginForm(){

        //create label for userID
        studentUserIdLabel = new JLabel();
        studentUserIdLabel.setText("Please enter Student Number"); //set label value for textField
        staffUserIdLabel = new JLabel();
        staffUserIdLabel.setText("Please enter Staff ID");
        visitorUserIdLabel = new JLabel();
        visitorUserIdLabel.setText("Please enter Email (For Visitors)");


        //create text field to get userId from the user
        studentUserIDField = new JTextField(15); //set length of the text
        staffUserIDField = new JTextField(15);
        visitorUserIDField = new JTextField(15);



        //create login button
        studentLoginButton = new JButton("Student Login");     //set label to login button
        staffLoginButton = new JButton("Staff Login");
        visitorLoginButton = new JButton("Visitor Login");
        newAppButton = new JButton("Start New Application");
        seeResInfoButton = new JButton("See Residence Information");

        //create panel to put form elements
        newPanel = new JPanel(new GridLayout(5,1));
        newPanel.add(studentUserIdLabel); //set username label to panel
        newPanel.add(studentUserIDField); //set text field to panel
        newPanel.add(studentLoginButton); //set button to panel
        newPanel.add(staffUserIdLabel);
        newPanel.add(staffUserIDField);
        newPanel.add(staffLoginButton);
        newPanel.add(visitorUserIdLabel);
        newPanel.add(visitorUserIDField);
        newPanel.add(visitorLoginButton);
        newPanel.add(newAppButton);
        newPanel.add(seeResInfoButton);


        //set border to panel
        add(newPanel, BorderLayout.CENTER);

        //perform action on button click
        studentLoginButton.addActionListener(this);
        staffLoginButton.addActionListener(this);
        visitorLoginButton.addActionListener(this);
        newAppButton.addActionListener(this);
        seeResInfoButton.addActionListener(this);
        setTitle("Login");
        setSize(500, 500);

    }

    public void actionPerformed(ActionEvent ae) {
        String studentUserValue = studentUserIDField.getText();// get user entered userID
        String staffUserValue = staffUserIDField.getText();
        String visitorUserValue = visitorUserIDField.getText();
        residentInfo.add("name");
        residentInfo.add("housing session");
        residentInfo.add("house");
        residentInfo.add("unit number");
        residentInfo.add("residence name");
        residentInfo.add("room type");
        residentInfo.add("rent");

        if (ae.getSource() == studentLoginButton) {
            if(studentUserValue.equals("")){
                System.out.println("Enter userID or click another button");
            } else {
                //todo uncomment when ready
                // residentInfo = selectionProjectionQuery(Integer.parseInt(studentUserValue), null, null); // gives List[String] of Resident info

                //create new instance of User information based on resident, staff, and visitor
                ResidentInfoPage residentInfoPage = new ResidentInfoPage(residentInfo);

                //make page visible to user
                residentInfoPage.setVisible(true);
            }
        } else if (ae.getSource() == staffLoginButton) {
            if (staffUserValue.equals("")){
                System.out.println("Enter userID or click another button");
            } else {
                //todo uncomment
                // residentInfo = selectionProjectionQuery(null, Integer.parseInt(staffUserValue), null); // gives List[String] of Resident info
                ResidentInfoPage residentInfoPage = new ResidentInfoPage(residentInfo);
                residentInfoPage.setVisible(true);
            }
        } else if (ae.getSource() == visitorLoginButton) {
            if (visitorUserValue.equals("")){
                System.out.println("Enter userID or click another button");
            } else {
                //todo uncomment
                // residentInfo = selectionProjectionQuery(null, null, visitorUserValue); // gives List[String] of Resident info
                ResidentInfoPage residentInfoPage = new ResidentInfoPage(residentInfo);
                residentInfoPage.setVisible(true);
            }
        } else if (ae.getSource() == newAppButton) {
            NewApplicantPage newApplicantPage = new NewApplicantPage();
            newApplicantPage.setVisible(true);
        } else if (ae.getSource() == seeResInfoButton ) {
            ResidenceInfoPage residenceInfoPage = new ResidenceInfoPage();
            residenceInfoPage.setVisible(true);
        } else if (ae.getSource() == "") {
            System.out.println("Enter userID or click another button");
        }
        else {
            // show error message
            System.out.println("Please enter valid userId or click a button");
        }
    }
}
