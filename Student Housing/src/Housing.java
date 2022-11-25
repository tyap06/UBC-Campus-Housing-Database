package controller;

import Database.DatabaseConnectionHandler;
import java.util.List;

public class Housing {
    private static DatabaseConnectionHandler dbHandler;
    private int uniqueID = 1000;

    public Housing(){
        dbHandler = new DatabaseConnectionHandler();
        dbHandler.login("","");
    }


    public void insertQuery(String applicantName, String residentType, String firstPrefRoom, String secondPrefRoom, String firstPrefResidence, String secondPrefResidence, String housingSession,
                            String CWL, int studentNumber, String program, String emailAddress, String lengthOfStay, int employeeNumber, int noOfAccompanyingFamilyMembers){
        dbHandler.addNewApplication(applicantName, residentType, firstPrefRoom, secondPrefRoom, firstPrefResidence, secondPrefResidence, housingSession, CWL, studentNumber, program, emailAddress, lengthOfStay, employeeNumber, noOfAccompanyingFamilyMembers);
    }

    public void deleteQuery(int studentNumber, int employeeNumber){
        dbHandler.deleteResident(studentNumber, employeeNumber);
    }

    public void updateQuery(String emailAddress, String lengthOfStay){
        dbHandler.updateVisitor(emailAddress, lengthOfStay);
    }


    // output = {name, housing session,house, unit number, residence name, room type, rent}
    public List<String> selectionProjectionQuery(int studentNumber, int employeeNumber, String emailAddress){
        return dbHandler.getResidentDisplayInfo(studentNumber, employeeNumber, emailAddress);
    }

    // function: finds the minimum or maximum rent for each residence
    // input: should be either "Min" or "Max"
    // output: string of residence names and respective rents
    public String groupByQuery(String minOrMax){
        return dbHandler.getMinMaxRentByResidence(minOrMax);
    }

    //function: Find the names of all campuses where there is at least BLANK residences
    //input : int
    //output: string of campus names
    public String havingQuery(int noOfRes){
        return dbHandler.getCampusNames(noOfRes);
    }

    //function:Find all residences that have the given amenity
    //input : string
    //output: string of residence names
    public String joinQuery(String amenity){
        return dbHandler.getResForAmenity(amenity);
    }

    //function:Finds the residences that have all the amenities
    //input : no input
    //output: string of residence names
    public String divisionQuery(){
        return dbHandler.getAllResWithAllAmenities();

    }





}
