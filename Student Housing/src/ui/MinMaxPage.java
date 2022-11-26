package ui;

import javax.swing.*;
import java.awt.*;

public class MinMaxPage extends JFrame {
    JLabel residencesLabel = new JLabel();
    JPanel panel = new JPanel();

    //constructor
    MinMaxPage(String s) {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Residence Information");
        setSize(600, 200);
        panel.setLayout(new GridLayout(0, 1));

        residencesLabel.setText("Residences and their rent: " + s);

        panel.add(residencesLabel);

        add(panel);
    }
}
