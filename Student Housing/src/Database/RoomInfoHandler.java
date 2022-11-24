package Database;

import Model.Model;
import Model.RoomInfo;


import java.sql.*;
import util.Constants;
import java.util.ArrayList;

public class RoomInfoHandler implements ModelHandler {

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
        ArrayList<RoomInfo> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM RoomInfo";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                RoomInfo roomInfo = new RoomInfo(rs.getString("House"),
                        rs.getInt("unitNumber"),
                        rs.getString("roomType"),
                        rs.getInt("rent"),
                        rs.getInt("residenceID"));
                result.add(roomInfo);
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }

        return result.toArray(new RoomInfo[0]);
    }
}