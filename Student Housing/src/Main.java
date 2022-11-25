import ui.LoginWindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            // create instance of the LoginWindow
            LoginWindow loginWindow = new LoginWindow();
            loginWindow.CreateLoginForm();
            loginWindow.setSize(600,200); // set size of frame
            loginWindow.setVisible(true);
            loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        catch (Exception e) {
            // handle exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}