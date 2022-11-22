package database;

import model.model;
import model.Residence;


import java.sql.*;
import util.Constants;
import java.util.ArrayList;


public class ResidenceHandler implements ModelHandler {
    private final DatabaseConnectionHandler dbHandler;

    public ResidenceHandler(DatabaseConnectionHandler dbHandler) {
        this.dbHandler = dbHandler;
    }

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
        ArrayList<Residence> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM Residence";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Residence residence = new Residence(rs.getInt("residenceID"),
                        rs.getString("residenceAddress"),
                        rs.getString("residenceName"));
                result.add(residence);
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }

        return result.toArray(new Residence[0]);
    }
}
