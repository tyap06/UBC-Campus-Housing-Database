package ui;

import javax.swing.*;
import java.awt.*;

public class AveragePage extends JFrame {
    JLabel residencesLabel = new JLabel();
    JPanel panel = new JPanel();

    //constructor
    AveragePage(String s) {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Residence Information");
        setSize(400, 200);
        panel.setLayout(new GridLayout(0, 1));

        residencesLabel.setText("Residences and their average rent: " + s);

        panel.add(residencesLabel);

        add(panel);
    }
}
