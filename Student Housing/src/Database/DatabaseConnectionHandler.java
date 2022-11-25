package Database;

import Model.*;
import util.Constants;
import util.ModelType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
                ResidenceHandler residenceHandler = new ResidenceHandler();
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
                ResidenceHandler residenceHandler = new ResidenceHandler();
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
                ResidenceHandler residenceHandler = new ResidenceHandler();
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
                ResidenceHandler residenceHandler = new ResidenceHandler();
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
    
    // insert query
    public void addNewApplication(String applicantName, String residentType, String firstPrefRoom, String secondPrefRoom, String firstPrefResidence, String secondPrefResidence, String housingSession,
                                  String CWL, int studentNumber, String program, String emailAddress, String lengthOfStay, int employeeNumber, int noOfAccompanyingFamilyMembers){

        ApplicationHandler appHandler = new ApplicationHandler();
        Application newApp = new Application(applicantName, residentType, firstPrefRoom, secondPrefRoom, firstPrefResidence, secondPrefResidence, housingSession, CWL, studentNumber, program, emailAddress, lengthOfStay, employeeNumber, noOfAccompanyingFamilyMembers);
        appHandler.insert(newApp, connection);
    }
    
    //delete query
    public void deleteResident(int studentNumber, int employeeNumber) {
        ResidentHandler residentHandler = new ResidentHandler();

        if(studentNumber != 0) {
            Resident resident = new Resident(0,"","","",studentNumber,"","","",0,0);
            residentHandler.delete(resident,connection);
        }
        else if (employeeNumber != 0) {
            Resident resident = new Resident(0,"","","",0,"","","",employeeNumber,0);
            residentHandler.delete(resident,connection);
        }

    }
    
    //update query
    public void updateVisitor(String emailAddress, String lengthOfStay) {
        ResidentHandler residentHandler = new ResidentHandler();

        Resident visitor = new Resident(0,"","","",0,"",emailAddress,lengthOfStay,0,0);
        residentHandler.update(visitor,connection);
    }
    
    // selection and projection query
    public List<String> getResidentDisplayInfo(int studentNumber, int employeeNumber, String emailAddress){
        List<String> output = new ArrayList<String>(); // output = {name, housing session,house, unit number, residence name, room type, rent}
        int residentID = 0;
        int residenceID = 0;
        String house = "";
        int unitNumber = 0;

        if(studentNumber != 0) {
            String query1 = "SELECT residentID, residentName, housingSession FROM Resident WHERE studentNumber = ?";

            try{
                PreparedStatement ps = connection.prepareStatement(query1);
                ps.setInt(1,studentNumber);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    residentID = rs.getInt("residentID");

                    output.add(rs.getString("residentName"));
                    output.add(rs.getString("housingSession"));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }
            ////////////////
            String query2 = "SELECT House, unitNumber, residenceID FROM RoomAllocationInfo WHERE residentID = ?";

            try{
                PreparedStatement ps = connection.prepareStatement(query2);
                ps.setInt(1,residentID);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    residenceID = rs.getInt("residenceID");
                    house = rs.getString("House");
                    unitNumber= rs.getInt("unitNumber");

                    output.add(house);
                    output.add(String.valueOf(unitNumber));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }
            /////////////////////////////
            String query3 = "SELECT residenceName FROM Residence WHERE residenceID = ?";

            try{
                PreparedStatement ps = connection.prepareStatement(query3);
                ps.setInt(1,residenceID);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    output.add(rs.getString("residenceName"));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }
            ///////////////////////////
            String query4 = "SELECT roomType, Rent FROM RoomInfo WHERE House = ? AND unitNumber = ?";

            try{
                PreparedStatement ps = connection.prepareStatement(query4);
                ps.setString(1, house);
                ps.setInt(2, unitNumber);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    output.add(rs.getString("roomType"));
                    output.add(String.valueOf(rs.getInt("Rent")));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }

            return output;

        }
        else if(employeeNumber != 0){
            String query1 = "SELECT residentID, residentName, housingSession FROM Resident WHERE EmployeeNumber = ?";

            try{
                PreparedStatement ps = connection.prepareStatement(query1);
                ps.setInt(1,employeeNumber);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    residentID = rs.getInt("residentID");

                    output.add(rs.getString("residentName"));
                    output.add(rs.getString("housingSession"));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }
            ////////////////
            String query2 = "SELECT House, unitNumber, residenceID FROM RoomAllocationInfo WHERE residentID = ?";

            try{
                PreparedStatement ps = connection.prepareStatement(query2);
                ps.setInt(1,residentID);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    residenceID = rs.getInt("residenceID");
                    house = rs.getString("House");
                    unitNumber= rs.getInt("unitNumber");

                    output.add(house);
                    output.add(String.valueOf(unitNumber));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }
            /////////////////////////////
            String query3 = "SELECT residenceName FROM Residence WHERE residenceID = ?";

            try{
                PreparedStatement ps = connection.prepareStatement(query3);
                ps.setInt(1,residenceID);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    output.add(rs.getString("residenceName"));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }
            ///////////////////////////
            String query4 = "SELECT roomType, Rent FROM RoomInfo WHERE House = ? AND unitNumber = ?";

            try{
                PreparedStatement ps = connection.prepareStatement(query4);
                ps.setString(1, house);
                ps.setInt(2, unitNumber);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    output.add(rs.getString("roomType"));
                    output.add(String.valueOf(rs.getInt("Rent")));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }

            return output;

        }
        else if(emailAddress != "") {
            String query1 = "SELECT residentID, residentName, housingSession FROM Resident WHERE EmailAddress = ?";

            try{
                PreparedStatement ps = connection.prepareStatement(query1);
                ps.setString(1,emailAddress);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    residentID = rs.getInt("residentID");

                    output.add(rs.getString("residentName"));
                    output.add(rs.getString("housingSession"));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }
            ////////////////
            String query2 = "SELECT House, unitNumber, residenceID FROM RoomAllocationInfo WHERE residentID = ?";

            try{
                PreparedStatement ps = connection.prepareStatement(query2);
                ps.setInt(1,residentID);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    residenceID = rs.getInt("residenceID");
                    house = rs.getString("House");
                    unitNumber= rs.getInt("unitNumber");

                    output.add(house);
                    output.add(String.valueOf(unitNumber));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }
            /////////////////////////////
            String query3 = "SELECT residenceName FROM Residence WHERE residenceID = ?";

            try{
                PreparedStatement ps = connection.prepareStatement(query3);
                ps.setInt(1,residenceID);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    output.add(rs.getString("residenceName"));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }
            ///////////////////////////
            String query4 = "SELECT roomType, Rent FROM RoomInfo WHERE House = ? AND unitNumber = ?";

            try{
                PreparedStatement ps = connection.prepareStatement(query4);
                ps.setString(1, house);
                ps.setInt(2, unitNumber);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    output.add(rs.getString("roomType"));
                    output.add(String.valueOf(rs.getInt("Rent")));
                }
                rs.close();
                ps.close();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }

            return output;

        }
        return null;
    }
    
    
    // Aggregation with GROUP BY query
    // input should be either "Min" or "Max"
    public String getMinMaxRentByResidence(String minOrMax){
        StringBuilder output = new StringBuilder();

        if(minOrMax == "Min"){
            String query1 = "SELECT residenceName, MIN(Rent) AS Rent FROM RoomInfo INNER JOIN Residence ON RoomInfo.residenceID = Residence.residenceID GROUP BY residenceName";

            try{
                PreparedStatement ps = connection.prepareStatement(query1);
                ResultSet rs = ps.executeQuery();

                while (rs.next()){
                   output.append("Minimum rent for" + rs.getString("residenceName") + "is" + rs.getInt("Rent") + "$" + "\n");
                }

                rs.close();
                ps.close();

                return output.toString();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }

        }
        else if(minOrMax == "Max"){
            String query1 = "SELECT residenceName, MAX(Rent) AS Rent FROM RoomInfo INNER JOIN Residence ON RoomInfo.residenceID = Residence.residenceID GROUP BY residenceName";

            try{
                PreparedStatement ps = connection.prepareStatement(query1);
                ResultSet rs = ps.executeQuery();

                while (rs.next()){
                    output.append("Maximum rent for" + rs.getString("residenceName") + "is" + rs.getInt("Rent") + "$" + "\n");
                }

                rs.close();
                ps.close();

                return output.toString();

            } catch (SQLException e) {
                System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
                return null;
            }

        }
        return null;

    }
    
    //Aggregation with HAVING Query
    // Find the names of all campuses where there is atleast BLANK residences
    public String getCampusNames(int noOfRes){
        String query = "SELECT campusName FROM ((residenceOnCampus INNER JOIN Campus ON residenceOnCampus.CampusID = Campus.CampusID) INNER JOIN Residence ON residenceOnCampus.ResidenceID = Residence.residenceID) GROUP BY campusName HAVING COUNT(*) >= ?";
        StringBuilder output = new StringBuilder();
        try{
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,noOfRes);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                output.append(rs.getString("campusName") + "\n");
            }
            
            rs.close();
            ps.close();
            
            return output.toString();
            

        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
            return "There are no campuses with that many residences";
        }

    }
    
    //Join query
    //Find all residences that have the given amenity
    public String getResForAmenity(String amenity){
        String query = "SELECT residenceName FROM ((amenitiesInResidence INNER JOIN Amenities  ON amenitiesInResidence.AmenityID = Amenities.amenityID) INNER JOIN Residence ON amenitiesInResidence.ResidenceID = Residence.residenceID) WHERE amenityName = ?";
        StringBuilder output = new StringBuilder();

        try{
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,amenity);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                output.append(rs.getString("residenceName" + "\n"));
            }

            rs.close();
            ps.close();

            return output.toString();

        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
            return "There are no residences with that amenity";
        }

    }
    
    //Division query
    // Finds the residences that have all the amenities
    public String getAllResWithAllAmenities(){
        String query = "SELECT residenceName FROM Residence WHERE NOT EXISTS ((SELECT AmenityID FROM Amenities) EXCEPT (SELECT AmenityID FROM amenitiesInResidence WHERE amenitiesInResidence.ResidenceID = residence.ResidenceID))";
        StringBuilder output = new StringBuilder();

        try{
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                output.append(rs.getString("residenceName") + "\n");
            }

            rs.close();
            ps.close();
            return output.toString();

        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
            return "There are no residences with all the amenities";
        }
    }
    
    // Nested Aggregation with GROUP BY Query
    public String getAvgRentPerRoomForResidence(String residenceName){
        String query = "SELECT roomType, AVG(rent) as Rent FROM RoomInfo WHERE residenceID IN (SELECT residenceID FROM Residence WHERE residenceName = ?) GROUP BY roomType";
        StringBuilder output = new StringBuilder();

        try{
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,residenceName);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                output.append("Average Rent for a" + rs.getString("roomType") + "in" + residenceName + "is" + rs.getInt("Rent")+"$" + "\n");
            }

            rs.close();
            ps.close();
            return output.toString();

        } catch (SQLException e) {
            System.out.println(Constants.EXCEPTION_TAG + " " + e.getMessage());
            return "This residence does not exist";
        }


    }


}


 

