package Database;

import Model.Campus;
import Model.Model;
import util.Constants;

import java.sql.*;
import java.util.ArrayList;

public class CampusHandler implements ModelHandler{
    @Override
    public void insert(Model model, Connection connection) {
        System.out.println("DeezNUTS");
    }

    @Override
    public void update(Model model, Connection connection) {
        System.out.println("HonoreDeBalzac");
    }

    @Override
    public void delete(Model model, Connection connection) {
        System.out.println("Sugma");
    }

    @Override
    public Model[] getInfo(Connection connection) {
        ArrayList<Campus> res = new ArrayList<>();
        String query = "SELECT * FROM Campus";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                Campus campus = new Campus(
                        resultSet.getInt("CampusID"),
                        resultSet.getString("campusName"),
                        resultSet.getString("campusAddress")
                );
                res.add(campus);
            }
            resultSet.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }
        return res.toArray(new Campus[0]);
    }
}
