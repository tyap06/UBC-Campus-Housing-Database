package ui;

import controller.Housing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResidenceInfoPage extends JFrame implements ActionListener {

     Housing housing = new Housing();
    String residenceList[] = {"Brock Commons", "Exchange", "Marine Drive", "Ponderosa Commons", "Thunderbird"};
    String minMaxList[] = {"Min", "Max"};
    JPanel Panel = new JPanel();
    JLabel residenceDropdownLabel = new JLabel();
    JLabel minOrMaxDropdownLabel = new JLabel();
    JLabel campusNameLabel = new JLabel();
    JLabel amenityLabel = new JLabel();
    JLabel averageLabel = new JLabel();
    JLabel divisionLabel = new JLabel();
    JButton findInfoButton = new JButton("Find Info");
    JButton findInfoMaxButton = new JButton("Find Rent Info");
    JButton findInfoCampusNameButton = new JButton("Find Campus Names");
    JButton findInfoAmenityButton = new JButton("Find Residences With The Given Amenity");
    JButton findAvgRentButton = new JButton("Find Average Rent");
    JButton divisionButton = new JButton("Find Residences With All Amenities");
    JComboBox resDropdown = new JComboBox(residenceList);
    JComboBox minOrMaxDropdown = new JComboBox(minMaxList);
    JTextField campusNameTextField = new JTextField(30);
    JTextField amenityTextField = new JTextField(30);
    JTextField averageTextField = new JTextField(30);






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
        averageLabel.setText("Enter a residence name below to find the average rent:");
        Panel.add(averageLabel);
        Panel.add(averageTextField);
        Panel.add(findAvgRentButton);
        divisionLabel.setText("To find all residences with all amenities, click the button below:");
        Panel.add(divisionLabel);
        Panel.add(divisionButton);

        add(Panel,BorderLayout.CENTER);

        // Perform action when on button clicks
        findInfoMaxButton.addActionListener(this);
        findInfoCampusNameButton.addActionListener(this);
        findInfoAmenityButton.addActionListener(this);
        findAvgRentButton.addActionListener(this);
        divisionButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
       String selectedMinOrMax = minOrMaxDropdown.getSelectedItem().toString();// gets selected residence into a string
        String campusNameUserValue = campusNameTextField.getText();
        String amenityUserValue = amenityTextField.getText();
        System.out.println(amenityUserValue);
        String averageUserValue = averageTextField.getText();
        String minOrMaxQueryString = new String();
        String campusNameQueryString = new String();
        String amenityQueryString = new String();
        String averageQueryString = new String();
        String divisionQueryString = new String();

        if (ae.getSource() == findInfoMaxButton ) {

            minOrMaxQueryString = housing.groupByQuery(selectedMinOrMax);
            MinMaxPage minMaxPage = new MinMaxPage(minOrMaxQueryString);
            minMaxPage.setVisible(true);
        } else if (ae.getSource() == findInfoCampusNameButton) {

            campusNameQueryString = housing.havingQuery(Integer.parseInt(campusNameUserValue));
            CampusNamePage campusNamePage = new CampusNamePage(campusNameQueryString);
            campusNamePage.setVisible(true);
        } else if (ae.getSource() == findInfoAmenityButton) {

            amenityQueryString = housing.joinQuery(amenityUserValue);
            AmenityPage amenityPage = new AmenityPage(amenityQueryString);
            amenityPage.setVisible(true);
        } else if (ae.getSource() == findAvgRentButton) {

            averageQueryString = housing.nestedAggQuery(averageUserValue);
            AveragePage averagePage = new AveragePage(averageQueryString);
            averagePage.setVisible(true);
        } else if (ae.getSource() == divisionButton) {
            divisionQueryString = housing.divisionQuery();
            DivisionPage divisionPage = new DivisionPage(divisionQueryString);
            divisionPage.setVisible(true);
        }
        else {
            // show error message
            System.out.println("Please enter valid userId or click a button");
        }
    }
}
