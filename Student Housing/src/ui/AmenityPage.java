package ui;

import javax.swing.*;
import java.awt.*;

public class AmenityPage extends JFrame {
    JLabel residencesLabel = new JLabel();
    JPanel panel = new JPanel();

    //constructor
    AmenityPage(String s) {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Residence Information");
        setSize(400, 200);
        panel.setLayout(new GridLayout(0, 1));

        residencesLabel.setText("Residences with amenities: " + s);

        panel.add(residencesLabel);

        add(panel);
    }
}
