package Database;

import Model.Application;
import Model.Model;
import util.Constants;

import java.sql.*;
import java.util.ArrayList;

public class ApplicationHandler implements ModelHandler{

    @Override
    public void insert(Model model, Connection connection) {
        Application app = (Application) model;
        String query = "INSERT INTO Application VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, app.getApplicationID());
            ps.setString(2, app.getApplicantName());
            ps.setString(3, app.getResidentType());
            ps.setString(4, app.getFirstPrefRoom());
            ps.setString(5, app.getSecondPrefRoom());
            ps.setString(6, app.getFirstPrefResidence());
            ps.setString(7, app.getSecondPrefResidence());
            ps.setString(8, app.getHousingSession());
            ps.setString(9, app.getCWL());
            ps.setInt(10, app.getStudentNumber());
            ps.setString(11, app.getProgram());
            ps.setString(12, app.getEmailAddress());
            ps.setString(13, app.getLengthOfStay());
            ps.setInt(14, app.getEmployeeNumber());
            ps.setInt(15, app.getNoOfAccompanyingFamilyMembers());
            ps.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }

    }

    @Override
    public void update(Model model, Connection connection) {
        Application app = (Application) model;
        String query = "UPDATE Application SET applicantName = ?, residentType = ?, 1stPrefRoom = ?, 2ndPrefRoom = ?, 1stPrefResidence = ?, 2ndPrefResidence = ?, housingSession = ?, CWL = ?, studentNumber = ?, Program = ?, EmailAddress = ?, LengthofStay = ?, EmployeeNumber = ?, NoOfAccompanysFamilyMembers = ? WHERE applicationID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, app.getApplicantName());
            ps.setString(2, app.getResidentType());
            ps.setString(3, app.getFirstPrefRoom());
            ps.setString(4, app.getSecondPrefRoom());
            ps.setString(5, app.getFirstPrefResidence());
            ps.setString(6, app.getSecondPrefResidence());
            ps.setString(7, app.getHousingSession());
            ps.setString(8, app.getCWL());
            ps.setInt(9, app.getStudentNumber());
            ps.setString(10, app.getProgram());
            ps.setString(6, app.getEmailAddress());
            ps.setString(7, app.getLengthOfStay());
            ps.setInt(8, app.getEmployeeNumber());
            ps.setInt(9, app.getNoOfAccompanyingFamilyMembers());
            ps.setInt(10, app.getApplicationID());
            int numOfRows = ps.executeUpdate();
            if (numOfRows == 0) {
                System.out.println(
                        Constants.WARNING_TAG +
                                " Application {applicationID: " +
                                app.getApplicationID() +
                                "} does not exist!"
                );
            }
            connection.commit();
            ps.close();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }
    }

    @Override
    public void delete(Model model, Connection connection) {
        Application app = (Application) model;
        String query = "DELETE FROM Application WHERE applicationID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, app.getApplicationID());
            int numOfRows = ps.executeUpdate();
            if (numOfRows == 0) {
                System.out.println(
                        Constants.WARNING_TAG +
                                " Application {applicationID: " +
                                app.getApplicationID() +
                                "} does not exist!"
                );
            }
            connection.commit();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }

    }

    @Override
    public Model[] getInfo(Connection connection) {
        ArrayList<Application> res = new ArrayList<>();
        String query = "SELECT * FROM Application";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                Application app = new Application(
                        resultSet.getInt("applicationID"),
                        resultSet.getString("applicantName"),
                        resultSet.getString("residentType"),
                        resultSet.getString("1stPrefRoom"),
                        resultSet.getString("2ndPrefRoom"),
                        resultSet.getString("1stPrefResidence"),
                        resultSet.getString("2ndPrefResidence"),
                        resultSet.getString("housingSession"),
                        resultSet.getString("CWL"),
                        resultSet.getInt("studentNumber"),
                        resultSet.getString("Program"),
                        resultSet.getString("EmailAddress"),
                        resultSet.getString("LengthofStay"),
                        resultSet.getInt("EmployeeNumber"),
                        resultSet.getInt("NoOfAccompanysFamilyMembers")
                );
                res.add(app);
            }
            resultSet.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }
        return res.toArray(new Application[0]);
    }

}
