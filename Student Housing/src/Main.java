import ui.LoginWindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            // create instance of the LoginWindow
            LoginWindow loginWindow = new LoginWindow();
            loginWindow.CreateLoginForm();
            loginWindow.setSize(300,100); // set size of frame
            loginWindow.setVisible(true);
        }
        catch (Exception e) {
            // handle exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}