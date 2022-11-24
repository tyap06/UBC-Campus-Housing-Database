package Database;

import Model.Amenities;
import Model.Model;
import util.Constants;

import java.sql.*;
import java.util.ArrayList;

public class AmenitiesHandler implements ModelHandler {

    @Override
    public void insert(Model model, Connection connection) {
        Amenities amenity = (Amenities) model;
        String query = "INSERT INTO Amenities VALUES (?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, amenity.getAmenityID());
            ps.setString(2, amenity.getAmenityName());
            ps.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }
    }

    @Override
    public void update(Model model, Connection connection) {
        System.out.println(Constants.WARNING_TAG + " Amenities table should not be updated; only inserted and deleted");
    }



    @Override
    public void delete(Model model, Connection connection) {
        Amenities amenity = (Amenities) model;
        String query = "DELETE FROM Amenities WHERE amenityID = ?"; // AND amenityName = ? <-- to add or not?
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, amenity.getAmenityID());
//            ps.setString(2, amenity.getAmenityName());
            int numOfRows = ps.executeUpdate();
            if (numOfRows == 0) {
                System.out.println(
                        Constants.WARNING_TAG +
                                " Amenity {amenityID: " +
                                amenity.getAmenityID() +
//                                "; amenityName: " +
//                                amenity.getAmenityName() +
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
        ArrayList<Amenities> res = new ArrayList<>();
        String query = "SELECT * FROM Amenities";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                Amenities amenities = new Amenities(
                        resultSet.getInt("amenityID"),
                        resultSet.getString("amenityName")
                );
                res.add(amenities);
            }
            resultSet.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }
        return res.toArray(new Amenities[0]);
    }
}
