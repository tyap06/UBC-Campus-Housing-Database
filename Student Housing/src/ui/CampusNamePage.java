package ui;

import javax.swing.*;
import java.awt.*;

public class CampusNamePage extends JFrame {
    JLabel campusLabel = new JLabel();
    JPanel panel = new JPanel();

    //constructor
    CampusNamePage(String s) {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Residence Information");
        setSize(400, 200);
        panel.setLayout(new GridLayout(0, 1));

        campusLabel.setText("Campus Names: " + s);

        panel.add(campusLabel);

        add(panel);
    }
}
