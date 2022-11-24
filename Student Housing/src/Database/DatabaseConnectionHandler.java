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
            case AMENITIES:
                AmenitiesHandler amenitiesHandler = new AmenitiesHandler();
                amenitiesHandler.delete(model, connection);
                break;
            case AMENITIESINRESIDENCE:
                AmenitiesInResidenceHandler amenitiesInResidenceHandler = new AmenitiesInResidenceHandler();
                amenitiesInResidenceHandler.delete(model, connection);
                break;
            case APPLICATION:
                ApplicationHandler applicationHandler = new ApplicationHandler();
                applicationHandler.delete(model, connection);
                break;
            case CAMPUS:
                CampusHandler campusHandler = new CampusHandler();
                campusHandler.delete(model, connection);
                break;
            case RESIDENCE:
                ResidenceHandler residenceHandler = new ResidenceHandler(this);
                residenceHandler.delete(model, connection);
                break;
            case RESIDENCEONCAMPUS:
                ResidenceOnCampusHandler residenceOnCampusHandler = new ResidenceOnCampusHandler();
                residenceOnCampusHandler.delete(model, connection);
                break;
            case RESIDENT:
                ResidentHandler residentHandler = new ResidentHandler();
                residentHandler.delete(model, connection);
                break;
            case ROOMALLOCATIONINFO:
                RoomAllocationInfoHandler roomAllocationInfoHandler = new RoomAllocationInfoHandler();
                roomAllocationInfoHandler.delete(model, connection);
                break;
            case ROOMINFO:
                RoomInfoHandler roomInfoHandler = new RoomInfoHandler();
                roomInfoHandler.delete(model, connection);
                break;
            default:

            }
        }



    public void update(Model model) {
        switch (model.type) {
            case AMENITIES:
                AmenitiesHandler amenitiesHandler = new AmenitiesHandler();
                amenitiesHandler.update(model, connection);
                break;
            case AMENITIESINRESIDENCE:
                AmenitiesInResidenceHandler amenitiesInResidenceHandler = new AmenitiesInResidenceHandler();
                amenitiesInResidenceHandler.update(model, connection);
                break;
            case APPLICATION:
                ApplicationHandler applicationHandler = new ApplicationHandler();
                applicationHandler.update(model, connection);
                break;
            case CAMPUS:
                CampusHandler campusHandler = new CampusHandler();
                campusHandler.update(model, connection);
                break;
            case RESIDENCE:
                ResidenceHandler residenceHandler = new ResidenceHandler(this);
                residenceHandler.update(model, connection);
                break;
            case RESIDENCEONCAMPUS:
                ResidenceOnCampusHandler residenceOnCampusHandler = new ResidenceOnCampusHandler();
                residenceOnCampusHandler.update(model, connection);
                break;
            case RESIDENT:
                ResidentHandler residentHandler = new ResidentHandler();
                residentHandler.update(model, connection);
                break;
            case ROOMALLOCATIONINFO:
                RoomAllocationInfoHandler roomAllocationInfoHandler = new RoomAllocationInfoHandler();
                roomAllocationInfoHandler.update(model, connection);
                break;
            case ROOMINFO:
                RoomInfoHandler roomInfoHandler = new RoomInfoHandler();
                roomInfoHandler.update(model, connection);
                break;
            default:
        }
    }

    public void insert(Model model) {
        switch (model.type) {
            case AMENITIES:
                AmenitiesHandler amenitiesHandler = new AmenitiesHandler();
                amenitiesHandler.insert(model, connection);
                break;
            case AMENITIESINRESIDENCE:
                AmenitiesInResidenceHandler amenitiesInResidenceHandler = new AmenitiesInResidenceHandler();
                amenitiesInResidenceHandler.insert(model, connection);
                break;
            case APPLICATION:
                ApplicationHandler applicationHandler = new ApplicationHandler();
                applicationHandler.insert(model, connection);
                break;
            case CAMPUS:
                CampusHandler campusHandler = new CampusHandler();
                campusHandler.insert(model, connection);
                break;
            case RESIDENCE:
                ResidenceHandler residenceHandler = new ResidenceHandler(this);
                residenceHandler.insert(model, connection);
                break;
            case RESIDENCEONCAMPUS:
                ResidenceOnCampusHandler residenceOnCampusHandler = new ResidenceOnCampusHandler();
                residenceOnCampusHandler.insert(model, connection);
                break;
            case RESIDENT:
                ResidentHandler residentHandler = new ResidentHandler();
                residentHandler.insert(model, connection);
                break;
            case ROOMALLOCATIONINFO:
                RoomAllocationInfoHandler roomAllocationInfoHandler = new RoomAllocationInfoHandler();
                roomAllocationInfoHandler.insert(model, connection);
                break;
            case ROOMINFO:
                RoomInfoHandler roomInfoHandler = new RoomInfoHandler();
                roomInfoHandler.insert(model, connection);
                break;
            default:
        }
    }

    public Model[] getInfo(ModelType type) {
        switch (type) {
            case AMENITIES:
                AmenitiesHandler amenitiesHandler = new AmenitiesHandler();
                amenitiesHandler.getInfo(connection);
                break;
            case AMENITIESINRESIDENCE:
                AmenitiesInResidenceHandler amenitiesInResidenceHandler = new AmenitiesInResidenceHandler();
                amenitiesInResidenceHandler.getInfo(connection);
                break;
            case APPLICATION:
                ApplicationHandler applicationHandler = new ApplicationHandler();
                applicationHandler.getInfo(connection);
                break;
            case CAMPUS:
                CampusHandler campusHandler = new CampusHandler();
                campusHandler.getInfo(connection);
                break;
            case RESIDENCE:
                ResidenceHandler residenceHandler = new ResidenceHandler(this);
                residenceHandler.getInfo(connection);
                break;
            case RESIDENCEONCAMPUS:
                ResidenceOnCampusHandler residenceOnCampusHandler = new ResidenceOnCampusHandler();
                residenceOnCampusHandler.getInfo(connection);
                break;
            case RESIDENT:
                ResidentHandler residentHandler = new ResidentHandler();
                residentHandler.getInfo(connection);
                break;
            case ROOMALLOCATIONINFO:
                RoomAllocationInfoHandler roomAllocationInfoHandler = new RoomAllocationInfoHandler();
                roomAllocationInfoHandler.getInfo(connection);
                break;
            case ROOMINFO:
                RoomInfoHandler roomInfoHandler = new RoomInfoHandler();
                roomInfoHandler.getInfo(connection);
                break;
            default:

        }
        return null;
    }
    
    
    public void addNewApplication(String applicantName, String residentType, String firstPrefRoom, String secondPrefRoom, String firstPrefResidence, String secondPrefResidence, String housingSession,
                                  String CWL, int studentNumber, String program, String emailAddress, String lengthOfStay, int employeeNumber, int noOfAccompanyingFamilyMembers){

        ApplicationHandler appHandler = new ApplicationHandler();
        Application newApp = new Application(applicantName, residentType, firstPrefRoom, secondPrefRoom, firstPrefResidence, secondPrefResidence, housingSession, CWL, studentNumber, program, emailAddress, lengthOfStay, employeeNumber, noOfAccompanyingFamilyMembers);
        appHandler.insert(newApp, connection);
    }


}


