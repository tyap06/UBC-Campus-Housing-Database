package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ResidenceInfoPage extends JFrame implements ActionListener {
    String residenceList[] = {"Brock Commons", "Exchange", "Marine Drive", "Ponderosa Commons", "Thunderbird"};
    JPanel Panel = new JPanel();
    JLabel residenceDropdownLabel = new JLabel();
    JButton findInfoButton = new JButton("Find Info");
    JButton divisionButton = new JButton("Division Button");
    JComboBox resDropdown = new JComboBox(residenceList);




    //constructor
    ResidenceInfoPage() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Residences");
        setSize(400,200);
        Panel.setLayout(new GridLayout(0, 1));

        residenceDropdownLabel.setText("Choose a Residence below to find information on:");
        Panel.add(residenceDropdownLabel);
        Panel.add(resDropdown);
        Panel.add(findInfoButton);
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
