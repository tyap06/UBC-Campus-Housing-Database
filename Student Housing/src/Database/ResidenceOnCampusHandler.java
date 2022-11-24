package Database;

import Model.Model;
import Model.ResidenceOnCampus;

import java.sql.*;
import util.Constants;
import java.util.ArrayList;


public class ResidenceOnCampusHandler implements ModelHandler {
    @Override
    public void insert(Model model, Connection connection) {
        System.out.println(Constants.WARNING_TAG + "You cannot insert to this Table");
    }

    @Override
    public void update(Model model, Connection connection) {
        System.out.println(Constants.WARNING_TAG + "You cannot update this Table");
    }

    @Override
    public void delete(Model model, Connection connection) {
        System.out.println(Constants.WARNING_TAG + "You cannot delete from this Table");
    }

    @Override
    public Model[] getInfo(Connection connection) {
        ArrayList<ResidenceOnCampus> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM ResidenceOnCampus";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                ResidenceOnCampus residenceOnCampus = new ResidenceOnCampus(rs.getInt("CampusID"), rs.getInt("ResidenceID"));
                result.add(residenceOnCampus);
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }

        return result.toArray(new ResidenceOnCampus[0]);
    }
}
