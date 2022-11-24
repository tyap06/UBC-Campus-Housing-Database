package ui;

import javax.swing.*;


public class ResidenceInfoPage extends JFrame {
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JTextField jt = new JTextField(30);


    //constructor
    ResidenceInfoPage() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome");
        setSize(400,200);
    }
}
