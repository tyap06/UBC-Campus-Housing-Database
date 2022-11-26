package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ResidenceInfoPage extends JFrame implements ActionListener {
    String residenceList[] = {"Brock Commons", "Exchange", "Marine Drive", "Ponderosa Commons", "Thunderbird"};
    String minMaxList[] = {"Min", "Max"};
    JPanel Panel = new JPanel();
    JLabel residenceDropdownLabel = new JLabel();
    JLabel minOrMaxDropdownLabel = new JLabel();
    JLabel campusNameLabel = new JLabel();
    JLabel amenityLabel = new JLabel();
    JLabel divisionLabel = new JLabel();
    JButton findInfoButton = new JButton("Find Info");
    JButton findInfoMaxButton = new JButton("Find Rent Info");
    JButton findInfoCampusNameButton = new JButton("Find Campus Names");
    JButton findInfoAmenityButton = new JButton("Find Residences With The Given Amenity");
    JButton divisionButton = new JButton("Find Residences With All Amenities");
    JComboBox resDropdown = new JComboBox(residenceList);
    JComboBox minOrMaxDropdown = new JComboBox(minMaxList);
    JTextField campusNameTextField = new JTextField(30);
    JTextField amenityTextField = new JTextField(30);






    //constructor
    ResidenceInfoPage() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Residences");
        setSize(600,500);
        Panel.setLayout(new GridLayout(0, 1));

        residenceDropdownLabel.setText("Enter the following information below to the corresponding sections to find the desired information:");
        minOrMaxDropdownLabel.setText("Choose Min or Max to find the corresponding rent for each residence");
        Panel.add(residenceDropdownLabel);
        //Panel.add(resDropdown);
        //Panel.add(findInfoButton);
        Panel.add(minOrMaxDropdownLabel);
        Panel.add(minOrMaxDropdown);
        Panel.add(findInfoMaxButton);
        campusNameLabel.setText("Enter a number to find campus names that have the number of residences below:");
        Panel.add(campusNameLabel);
        Panel.add(campusNameTextField);
        Panel.add(findInfoCampusNameButton);
        amenityLabel.setText("Enter an amenity to find all residences with that amenity:");
        Panel.add(amenityLabel);
        Panel.add(amenityTextField);
        Panel.add(findInfoAmenityButton);
        divisionLabel.setText("To find all residences with all amenities, click the button below:");
        Panel.add(divisionLabel);
        Panel.add(divisionButton);

        add(Panel,BorderLayout.CENTER);

        // Perform action when on button clicks
        findInfoButton.addActionListener(this);
        divisionButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
       String selectedRes = resDropdown.getSelectedItem().toString();// gets selected residence into a string
        System.out.println(selectedRes);

        if (ae.getSource() == findInfoButton) {
            // check whether credentials are authentic or not
            // Resident or Staff or Visitor
            //TODO
            if(selectedRes.equals("1")) {

            }
            else {
                //show error message
                System.out.println("Please enter valid userID");
            }
        } else if (ae.getSource() == divisionButton) {

            DivisionPage divisionPage = new DivisionPage();
            divisionPage.setVisible(true);
        }
        else {
            // show error message
            System.out.println("Please enter valid userId or click a button");
        }
    }
}
