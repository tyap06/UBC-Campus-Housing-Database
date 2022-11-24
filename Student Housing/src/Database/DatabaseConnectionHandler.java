package Database;

import Model.*;
import Database.ResidenceOnCampusHandler;
import util.Constants;
import util.ModelType;

import java.sql.*;
import java.util.Date;

public class DatabaseConnectionHandler {
    private Connection connection = null;


    public DatabaseConnectionHandler() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
        }
    }

    public void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
            }
        }
    }

    public boolean login(String username, String password) {
        try {
            if (connection != null) {
                connection.close();
            }

            connection = DriverManager.getConnection(Constants.ORACLE_URL, username, password);
            connection.setAutoCommit(false);

            System.out.println("\nConnected to Oracle!");
            return true;
        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
            return false;
        }
    }

    public void delete(Model model) {
        switch (model.type) {
            case AMENITIES -> {
                AmenitiesHandler amenitiesHandler = new AmenitiesHandler();
                amenitiesHandler.delete(model, connection);
            }
            case AMENITIESINRESIDENCE -> {
                AmenitiesInResidenceHandler amenitiesInResidenceHandler = new AmenitiesInResidenceHandler();
                amenitiesInResidenceHandler.delete(model, connection);
            }
            case APPLICATION -> {
                ApplicationHandler applicationHandler = new ApplicationHandler();
                applicationHandler.delete(model, connection);
            }
            case CAMPUS -> {
                CampusHandler campusHandler = new CampusHandler();
                campusHandler.delete(model, connection);
            }
            case RESIDENCE -> {
                ResidenceHandler residenceHandler = new ResidenceHandler();
                residenceHandler.delete(model, connection);
            }
            case RESIDENCEONCAMPUS -> {
                ResidenceOnCampusHandler residenceOnCampusHandler = new ResidenceOnCampusHandler();
                residenceOnCampusHandler.delete(model, connection);
            }
            case RESIDENT -> {
                ResidentHandler residentHandler = new ResidentHandler();
                residentHandler.delete(model, connection);
            }
            case ROOMALLOCATIONINFO -> {
                RoomAllocationInfoHandler roomAllocationInfoHandler = new RoomAllocationInfoHandler();
                roomAllocationInfoHandler.delete(model, connection);
            }
            case ROOMINFO -> {
                RoomInfoHandler roomInfoHandler = new RoomInfoHandler();
                roomInfoHandler.delete(model, connection);
            }
            default -> {

            }
        }
    }

    public void update(Model model) {
        switch (model.type) {
            case AMENITIES -> {
                AmenitiesHandler amenitiesHandler = new AmenitiesHandler();
                amenitiesHandler.update(model, connection);
            }
            case AMENITIESINRESIDENCE -> {
                AmenitiesInResidenceHandler amenitiesInResidenceHandler = new AmenitiesInResidenceHandler();
                amenitiesInResidenceHandler.update(model, connection);
            }
            case APPLICATION -> {
                ApplicationHandler applicationHandler = new ApplicationHandler();
                applicationHandler.update(model, connection);
            }
            case CAMPUS -> {
                CampusHandler campusHandler = new CampusHandler();
                campusHandler.update(model, connection);
            }
            case RESIDENCE -> {
                ResidenceHandler residenceHandler = new ResidenceHandler();
                residenceHandler.update(model, connection);
            }
            case RESIDENCEONCAMPUS -> {
                ResidenceOnCampusHandler residenceOnCampusHandler = new ResidenceOnCampusHandler();
                residenceOnCampusHandler.update(model, connection);
            }
            case RESIDENT -> {
                ResidentHandler residentHandler = new ResidentHandler();
                residentHandler.update(model, connection);
            }
            case ROOMALLOCATIONINFO -> {
                RoomAllocationInfoHandler roomAllocationInfoHandler = new RoomAllocationInfoHandler();
                roomAllocationInfoHandler.update(model, connection);
            }
            case ROOMINFO -> {
                RoomInfoHandler roomInfoHandler = new RoomInfoHandler();
                roomInfoHandler.update(model, connection);
            }
            default -> {

            }
        }
    }

    public void insert(Model model) {
        switch (model.type) {
            case AMENITIES -> {
                AmenitiesHandler amenitiesHandler = new AmenitiesHandler();
                amenitiesHandler.insert(model, connection);
            }
            case AMENITIESINRESIDENCE -> {
                AmenitiesInResidenceHandler amenitiesInResidenceHandler = new AmenitiesInResidenceHandler();
                amenitiesInResidenceHandler.insert(model, connection);
            }
            case APPLICATION -> {
                ApplicationHandler applicationHandler = new ApplicationHandler();
                applicationHandler.insert(model, connection);
            }
            case CAMPUS -> {
                CampusHandler campusHandler = new CampusHandler();
                campusHandler.insert(model, connection);
            }
            case RESIDENCE -> {
                ResidenceHandler residenceHandler = new ResidenceHandler();
                residenceHandler.insert(model, connection);
            }
            case RESIDENCEONCAMPUS -> {
                ResidenceOnCampusHandler residenceOnCampusHandler = new ResidenceOnCampusHandler();
                residenceOnCampusHandler.insert(model, connection);
            }
            case RESIDENT -> {
                ResidentHandler residentHandler = new ResidentHandler();
                residentHandler.insert(model, connection);
            }
            case ROOMALLOCATIONINFO -> {
                RoomAllocationInfoHandler roomAllocationInfoHandler = new RoomAllocationInfoHandler();
                roomAllocationInfoHandler.insert(model, connection);
            }
            case ROOMINFO -> {
                RoomInfoHandler roomInfoHandler = new RoomInfoHandler();
                roomInfoHandler.insert(model, connection);
            }
            default -> {

            }
        }
    }

    public Model[] getInfo(ModelType type) {
        switch (type) {
            case AMENITIES -> {
                AmenitiesHandler amenitiesHandler = new AmenitiesHandler();
                amenitiesHandler.getInfo(connection);
            }
            case AMENITIESINRESIDENCE -> {
                AmenitiesInResidenceHandler amenitiesInResidenceHandler = new AmenitiesInResidenceHandler();
                amenitiesInResidenceHandler.getInfo(connection);
            }
            case APPLICATION -> {
                ApplicationHandler applicationHandler = new ApplicationHandler();
                applicationHandler.getInfo(connection);
            }
            case CAMPUS -> {
                CampusHandler campusHandler = new CampusHandler();
                campusHandler.getInfo(connection);
            }
            case RESIDENCE -> {
                ResidenceHandler residenceHandler = new ResidenceHandler();
                residenceHandler.getInfo(connection);
            }
            case RESIDENCEONCAMPUS -> {
                ResidenceOnCampusHandler residenceOnCampusHandler = new ResidenceOnCampusHandler();
                residenceOnCampusHandler.getInfo(connection);
            }
            case RESIDENT -> {
                ResidentHandler residentHandler = new ResidentHandler();
                residentHandler.getInfo(connection);
            }
            case ROOMALLOCATIONINFO -> {
                RoomAllocationInfoHandler roomAllocationInfoHandler = new RoomAllocationInfoHandler();
                roomAllocationInfoHandler.getInfo(connection);
            }
            case ROOMINFO -> {
                RoomInfoHandler roomInfoHandler = new RoomInfoHandler();
                roomInfoHandler.getInfo(connection);
            }
            default -> {

            }
        }
        return null;
    }


}


