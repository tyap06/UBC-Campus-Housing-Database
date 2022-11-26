package ui;


import controller.Housing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ResidentInfoPage extends JFrame implements ActionListener {
   Housing housing = new Housing();
    JLabel nameLabel = new JLabel();
    JLabel housingSessionLabel = new JLabel();
    JLabel houseLabel = new JLabel();
    JLabel unitNumLabel = new JLabel();
    JLabel residenceNameLabel = new JLabel();
    JLabel roomTypeLabel = new JLabel();
    JLabel rentLabel = new JLabel();
    JLabel visitorUpdateLabel = new JLabel();
    JLabel visitorUpdateLabel2 = new JLabel();
    JLabel visitorEmailLabel = new JLabel();
    JLabel studentDeleteLabel = new JLabel();
    JLabel studentDeleteLabel2 = new JLabel();
    JLabel staffDeleteLabel = new JLabel();
    JLabel staffDeleteLabel2 = new JLabel();
    JTextField visitorEmailTextField = new JTextField(30);
    JTextField visitorUpdateTextField = new JTextField(30);
    JTextField studentNumTextField = new JTextField(30);
    JTextField staffIdTextField = new JTextField(30);

    JButton visitorUpdateButton = new JButton("Update");
    JButton studentDeleteButton = new JButton("Move Out");
    JButton staffDeleteButton = new JButton("Move Out");
    JPanel panel = new JPanel();


    //constructor
    ResidentInfoPage(List<String> ls) {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resident Information");
        setSize(500,600);
        panel.setLayout(new GridLayout(0, 1));

        nameLabel.setText("Name: " + ls.get(0));
        housingSessionLabel.setText("Session: " + ls.get(1));
        houseLabel.setText("House: " + ls.get(2));
        unitNumLabel.setText("Unit Number: " + ls.get(3));
        residenceNameLabel.setText("Residence Name: " + ls.get(4));
        roomTypeLabel.setText("Room Type: " + ls.get(5));
        rentLabel.setText("Rent: " + ls.get(6));
        visitorUpdateLabel.setText("For Visitors Only: If you would like to update your length of stay,");
        visitorEmailLabel.setText("Enter email address below:");
        visitorUpdateLabel2.setText("Enter the updated length of stay below:");
        studentDeleteLabel.setText("For Students Only: If you would like to move out: ");
        studentDeleteLabel2.setText("Enter Student Number below: ");
        staffDeleteLabel.setText("For Staff Only: If you would like to move out: ");
        staffDeleteLabel2.setText("Enter Staff ID below: ");


        panel.add(nameLabel);
        panel.add(housingSessionLabel);
        panel.add(houseLabel);
        panel.add(unitNumLabel);
        panel.add(residenceNameLabel);
        panel.add(roomTypeLabel);
        panel.add(rentLabel);
        panel.add(visitorUpdateLabel);
        panel.add(visitorEmailLabel);
        panel.add(visitorEmailTextField);
        panel.add(visitorUpdateLabel2);
        panel.add(visitorUpdateTextField);
        panel.add(visitorUpdateButton);
        panel.add(studentDeleteLabel);
        panel.add(studentDeleteLabel2);
        panel.add(studentNumTextField);
        panel.add(studentDeleteButton);
        panel.add(staffDeleteLabel);
        panel.add(staffDeleteLabel2);
        panel.add(staffIdTextField);
        panel.add(staffDeleteButton);

        //perform action on button click
        visitorUpdateButton.addActionListener(this);
        studentDeleteButton.addActionListener(this);
        staffDeleteButton.addActionListener(this);

        add(panel);

    }
    public void actionPerformed(ActionEvent ae){
        String updateEmailValue = visitorEmailTextField.getText(); // gets email address from visitor
        String updateUserValue = visitorUpdateTextField.getText(); // gets updated length of stay from user input
        String studentNum = studentNumTextField.getText();
        String staffId = staffIdTextField.getText();

        if(ae.getSource() == visitorUpdateButton) {
            housing.updateQuery(updateEmailValue, updateUserValue);
            JOptionPane confirmationPane = new JOptionPane();
            confirmationPane.setMessage("Length of stay updated");
        } else if (ae.getSource() == studentDeleteButton){
            housing.deleteQuery(Integer.parseInt(studentNum), 0);
        } else if (ae.getSource() == staffDeleteButton) {
            housing.deleteQuery(0, Integer.parseInt(staffId));
        }
    }

}
