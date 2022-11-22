package Database;

import Model.AmenitiesInResidence;
import Model.Model;
import util.Constants;

import java.sql.*;
import java.util.ArrayList;
public class AmenitiesInResidenceHandler implements ModelHandler{

    @Override
    public void insert(Model model, Connection connection) {
        AmenitiesInResidence amenity = (AmenitiesInResidence) model;
        String query = "INSERT INTO amenitiesInResidence VALUES (?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, amenity.getAmenityID());
            ps.setInt(2, amenity.getResidenceID());
            ps.setInt(3, amenity.getNoOfRooms());
            ps.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }
    }

    @Override
    public void update(Model model, Connection connection) {
        System.out.println(Constants.WARNING_TAG + " AmenitiesInResidence table should not be updated; only inserted and deleted");

    }

    @Override
    public void delete(Model model, Connection connection) {
        AmenitiesInResidence amenitiesInResidence = (AmenitiesInResidence) model;
        String query = "DELETE FROM amenitiesInResidence WHERE AmenityID = ? AND ResidenceID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, amenitiesInResidence.getAmenityID());
            ps.setInt(2, amenitiesInResidence.getResidenceID());
            int numOfRows = ps.executeUpdate();
            if (numOfRows == 0) {
                System.out.println(
                        Constants.WARNING_TAG +
                                " Amenity in Residence {AmenityID: " +
                                amenitiesInResidence.getAmenityID() +
                                "; ResidenceID: " +
                                amenitiesInResidence.getResidenceID() +
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
        ArrayList<AmenitiesInResidence> res = new ArrayList<>();
        String query = "SELECT * FROM amenitiesInResidence";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                AmenitiesInResidence amenitiesInResidence = new AmenitiesInResidence(
                        resultSet.getInt("AmenityID"),
                        resultSet.getInt("ResidenceID"),
                        resultSet.getInt("NoOfRooms")
                );
                res.add(amenitiesInResidence);
            }
            resultSet.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }
        return res.toArray(new AmenitiesInResidence[0]);
    }

}
