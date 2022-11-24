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

    @Override
    public void update(Model model, Connection connection) {
        Resident resident = (Resident) model;
        String query = "UPDATE Resident SET residentName = ?, housingSession = ?, CWL = ?, studentNumber = ?, " +
                "Program = ?, EmailAddress = ?, LengthofStay = ?, EmployeeNumber = ?, NoOfAccompanysFamilyMembers = ? " +
                "WHERE residentID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, resident.getResidentName());
            ps.setString(2, resident.getHousingSession());
            ps.setString(3, resident.getCWL());
            ps.setInt(4, resident.getStudentNumber());
            ps.setString(5, resident.getProgram());
            ps.setString(6, resident.getEmailAddress());
            ps.setString(7, resident.getLengthOfStay());
            ps.setInt(8, resident.getEmployeeNumber());
            ps.setInt(9, resident.getNoOfAccompanyingFamilyMembers());
            ps.setInt(10, resident.getResidentID());
            int numOfRows = ps.executeUpdate();
            if (numOfRows == 0) {
                System.out.println(
                        Constants.WARNING_TAG +
                                "This Resident ID " +
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

    @Override
    public void delete(Model model, Connection connection) {
        Resident resident = (Resident) model;
        String query = "DELETE FROM Resident WHERE residentID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, resident.getResidentID());
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

    @Override
    public Model[] getInfo(Connection connection) {
        ArrayList<Resident> res = new ArrayList<>();
        String query = "SELECT * FROM Resident";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                Resident resident = new Resident(
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