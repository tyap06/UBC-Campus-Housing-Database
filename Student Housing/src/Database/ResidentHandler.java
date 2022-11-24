package Database;

import Model.Model;
import Model.Resident;

import java.sql.*;
import util.Constants;
import java.util.ArrayList;


public class ResidentHandler implements ModelHandler{

    @Override
    public void insert(Model model, Connection connection) {
        System.out.println(Constants.WARNING_TAG + "You cannot insert to this Table");
    }

    
    //updates the length of stay of a visitor resident
    @Override
    public void update(Model model, Connection connection) {
        Resident resident = (Resident) model;
        String query = "UPDATE Resident SET LengthofStay = ? WHERE EmailAddress = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, resident.getLengthOfStay());
            ps.setString(2, resident.getEmailAddress());
            int numOfRows = ps.executeUpdate();
            if (numOfRows == 0) {
                System.out.println(
                        Constants.WARNING_TAG +
                                "This Resident" +
                                resident.getResidentID() +
                                " does not exist!"
                );
            }
            connection.commit();
            ps.close();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }
    }
    
    // deletes a student or employee resident
    @Override
    public void delete(Model model, Connection connection) {
        Resident resident = (Resident) model;
        if(resident.getStudentNumber() != 0) {
            String query = "DELETE FROM Resident WHERE studentNumber = ?";

            try {
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, resident.getStudentNumber());
                int numOfRows = ps.executeUpdate();
                if (numOfRows == 0) {
                    System.out.println(
                            Constants.WARNING_TAG +
                                    "This Resident " +
                                    resident.getResidentID() +
                                    " does not exist!"
                    );
                }
                connection.commit();
            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
            }

        }

        else if(resident.getEmployeeNumber() != 0) {
            String query = "DELETE FROM Resident WHERE EmployeeNumber = ?";
            try {
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, resident.getEmployeeNumber());
                int numOfRows = ps.executeUpdate();
                if (numOfRows == 0) {
                    System.out.println(
                            Constants.WARNING_TAG +
                                    "This Resident " +
                                    resident.getResidentID() +
                                    " does not exist!"
                    );
                }
                connection.commit();
            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
            }

        }

    }

    @Override
    public Model[] getInfo(Connection connection) {
        ArrayList<Resident> res = new ArrayList<>();
        String query = "SELECT * FROM Resident";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                Resident resident = new Resident(
                        resultSet.getInt("residentID"),
                        resultSet.getString("residentName"),
                        resultSet.getString("housingSession"),
                        resultSet.getString("CWL"),
                        resultSet.getInt("studentNumber"),
                        resultSet.getString("Program"),
                        resultSet.getString("EmailAddress"),
                        resultSet.getString("LengthofStay"),
                        resultSet.getInt("EmployeeNumber"),
                        resultSet.getInt("NoOfAccompanysFamilyMembers")
                );
                res.add(resident);
            }
            resultSet.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }
        return res.toArray(new Resident[0]);
    }

}
