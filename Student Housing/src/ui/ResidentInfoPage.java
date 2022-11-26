package ui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ResidentInfoPage extends JFrame {
    JLabel nameLabel = new JLabel();
    JLabel housingSessionLabel = new JLabel();
    JLabel houseLabel = new JLabel();
    JLabel unitNumLabel = new JLabel();
    JLabel residenceNameLabel = new JLabel();
    JLabel roomTypeLabel = new JLabel();
    JLabel rentLabel = new JLabel();
    JLabel visitorUpdateLabel = new JLabel();
    JLabel visitorUpdateLabel2 = new JLabel();
    JTextField visitorUpdateTextField = new JTextField(30);
    JButton visitorUpdateButton = new JButton("Update");
    JPanel panel = new JPanel();


    //constructor
    ResidentInfoPage(List<String> ls) {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resident Information");
        setSize(500,300);
        panel.setLayout(new GridLayout(0, 1));

        nameLabel.setText("Name: " + ls.get(0));
        housingSessionLabel.setText("Session: " + ls.get(1));
        houseLabel.setText("House: " + ls.get(2));
        unitNumLabel.setText("Unit Number: " + ls.get(3));
        residenceNameLabel.setText("Residence Name: " + ls.get(4));
        roomTypeLabel.setText("Room Type: " + ls.get(5));
        rentLabel.setText("Rent: " + ls.get(6));
        visitorUpdateLabel.setText("For Visitors Only: If you would like to update your length of stay,");
        visitorUpdateLabel2.setText("Enter the updated length of stay below:");

        panel.add(nameLabel);
        panel.add(housingSessionLabel);
        panel.add(houseLabel);
        panel.add(unitNumLabel);
        panel.add(residenceNameLabel);
        panel.add(roomTypeLabel);
        panel.add(rentLabel);
        panel.add(visitorUpdateLabel);
        panel.add(visitorUpdateLabel2);
        panel.add(visitorUpdateTextField);
        panel.add(visitorUpdateButton);

        add(panel);

    }
}
