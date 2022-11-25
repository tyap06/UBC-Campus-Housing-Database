package ui;

import javax.swing.*;
import java.awt.*;


public class NewApplicantPage extends JFrame {
    JPanel newPanel = new JPanel();
    JPanel studentPanel = new JPanel();
    JPanel staffPanel = new JPanel();
    JPanel visitorPanel = new JPanel();
    JLabel nameLabel = new JLabel();
    JLabel prefResLabel1 = new JLabel();
    JLabel prefResLabel2 = new JLabel();
    JLabel prefRoomLabel1 = new JLabel();
    JLabel prefRoomLabel2 = new JLabel();
    JLabel residentTypeLabel = new JLabel();
    JLabel studentLabel = new JLabel();
    JLabel studentNumberLabel = new JLabel();
    JLabel studentCwlLabel = new JLabel();
    JLabel studentProgramLabel = new JLabel();
    JLabel studentSessionLabel = new JLabel();
    JLabel studentCfaIdLabel = new JLabel();

    //staff labels
    JLabel staffLabel = new JLabel();
    JLabel staffEmployeeNumLabel = new JLabel();
    JLabel staffNumOfAccFamLabel = new JLabel();
    JLabel staffSessionLabel = new JLabel();
    JLabel staffCfaLabel = new JLabel();

    // visitor labels
    JLabel visitorLabel = new JLabel();
    JLabel visitorEmailLabel = new JLabel();
    JLabel visitorStartLabel = new JLabel();
    JLabel visitorEndLabel = new JLabel();

    JCheckBox studentBox = new JCheckBox("Student");
    JCheckBox staffBox = new JCheckBox("Staff");
    JCheckBox visitorBox = new JCheckBox("Visitor");
    JTextField nameTextField = new JTextField(30);
    JTextField studentNumberTextField = new JTextField(30);
    JTextField studentCwlTextField = new JTextField(30);
    JTextField studentProgramTextField = new JTextField(30);
    JTextField studentSessionTextField = new JTextField(30);
    JTextField studentCfaTextField = new JTextField(30);
    JTextField staffEmployeeNumTextField = new JTextField(30);
    JTextField staffNumOfAccFamTextField = new JTextField(30);
    JTextField staffSessionTextField = new JTextField(30);

    // visitor text fields
    JTextField visitorEmailTextField = new JTextField(30);
    JTextField visitorStartTextField = new JTextField(30);
    JTextField visitorEndTextField = new JTextField(30);
    String residenceList[] = {"Brock Commons", "Exchange", "Marine Drive", "Ponderosa Commons", "Thunderbird"};
    String roomTypeList[] = {"Studio", "1 Bedroom", "2 Bedrooms", "4 Bedrooms"};
    JComboBox prefResDropdown1 = new JComboBox(residenceList);
    JComboBox prefResDropdown2 = new JComboBox(residenceList);
    JComboBox prefRoomDropdown1 = new JComboBox(roomTypeList);
    JComboBox prefRoomDropdown2 = new JComboBox(roomTypeList);
    JButton submitButton = new JButton("Submit Application");



    //constructor
    NewApplicantPage() {
        setLayout(new GridLayout(0,1, 5, 5));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Application");
        setSize(450,1000);
        studentPanel.setLayout(new GridLayout(0, 1, 5, 5));
        staffPanel.setLayout(new GridLayout(0, 1, 5, 5));
        visitorPanel.setLayout(new GridLayout(0,1,5,5));

        // general info Panel
        residentTypeLabel.setText("Which Resident are you?");
        newPanel.add(residentTypeLabel);
        newPanel.add(studentBox);
        newPanel.add(staffBox);
        newPanel.add(visitorBox);
        nameLabel.setText("Enter First and Last Name");
        newPanel.add(nameLabel);
        newPanel.add(nameTextField);
        prefResLabel1.setText("1st Choice of Preferred Residence");
        prefResLabel2.setText("2nd Choice of Preferred Residence");
        newPanel.add(prefResLabel1);
        newPanel.add(prefResDropdown1);
        newPanel.add(prefResLabel2);
        newPanel.add(prefResDropdown2);
        prefRoomLabel1.setText("1st Choice of Preferred Room Type");
        prefRoomLabel2.setText("2nd Choice of Preferred Room Type");
        newPanel.add(prefRoomLabel1);
        newPanel.add(prefRoomDropdown1);
        newPanel.add(prefRoomLabel2);
        newPanel.add(prefRoomDropdown2);

        // student fill-in info panel
        studentLabel.setText("If you are a student please complete the following:");
        studentPanel.add(studentLabel);
        studentNumberLabel.setText("Student Number");
        studentPanel.add(studentNumberLabel);
        studentPanel.add(studentNumberTextField);
        studentCwlLabel.setText("CWL");
        studentPanel.add(studentCwlLabel);
        studentPanel.add(studentCwlTextField);
        studentProgramLabel.setText("Program");
        studentPanel.add(studentProgramLabel);
        studentPanel.add(studentProgramTextField);
        studentSessionLabel.setText("Session");
        studentPanel.add(studentSessionLabel);
        studentPanel.add(studentSessionTextField);
        studentCfaIdLabel.setText("CFA ID (If Applicable)");
        studentPanel.add(studentCfaIdLabel);
        studentPanel.add(studentCfaTextField);

        // staff fill-in info panel
        staffLabel.setText("If you are staff please complete the following:");
        staffPanel.add(staffLabel);
        staffEmployeeNumLabel.setText("Employee Number");
        staffPanel.add(staffEmployeeNumLabel);
        staffPanel.add(staffEmployeeNumTextField);
        staffNumOfAccFamLabel.setText("Number of Accompanying Family Members");
        staffPanel.add(staffNumOfAccFamLabel);
        staffPanel.add(staffNumOfAccFamTextField);
        staffSessionLabel.setText("Session");
        staffPanel.add(staffSessionLabel);
        staffPanel.add(staffSessionTextField);

        // visitor fill-in info panel
        visitorLabel.setText("If you are a visitor please complete the following:");
        visitorPanel.add(visitorLabel);
        visitorEmailLabel.setText("Email Address");
        visitorPanel.add(visitorEmailLabel);
        visitorPanel.add(visitorEmailTextField);
        visitorStartLabel.setText("Start Date");
        visitorPanel.add(visitorStartLabel);
        visitorPanel.add(visitorStartTextField);
        visitorEndLabel.setText("End Date");
        visitorPanel.add(visitorEndLabel);
        visitorPanel.add(visitorEndTextField);

        // submit button
        // TODO fix size of button
        submitButton.setPreferredSize(new Dimension(40, 40));

        add(newPanel);
        add(studentPanel);
        add(staffPanel);
        add(visitorPanel);
        add(submitButton);

    }

    //TODO action handler for checkboxes and button

}
