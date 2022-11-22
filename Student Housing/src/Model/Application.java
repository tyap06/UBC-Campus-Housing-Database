package Model;

import java.util.Random;

public class Application extends Model{
    private final int applicationID;
    private final String applicantName;
    private final String residentType;
    private final String firstPrefRoom;
    private final String secondPrefRoom;
    private final String firstPrefResidence;
    private final String secondPrefResidence;
    private final String housingSession;
    private final String CWL;
    private final int studentNumber;
    private final String program;
    private final String emailAddress;
    private final String lengthOfStay;
    private final int employeeNumber;
    private final int noOfAccompanyingFamilyMembers;

    public Application(String applicantName, String residentType, String firstPrefRoom, String secondPrefRoom, String firstPrefResidence, String secondPrefResidence, String housingSession,
    String CWL, int studentNumber, String program, String emailAddress, String lengthOfStay, int employeeNumber, int noOfAccompanyingFamilyMembers) {
        this.applicationID = getRandom();
        this.applicantName = applicantName;
        this.residentType = residentType;
        this.firstPrefRoom = firstPrefRoom;
        this.secondPrefRoom = secondPrefRoom;
        this.firstPrefResidence = firstPrefResidence;
        this.secondPrefResidence = secondPrefResidence;
        this.housingSession = housingSession;
        this.CWL = CWL;
        this.studentNumber = studentNumber;
        this.program = program;
        this.emailAddress = emailAddress;
        this.lengthOfStay = lengthOfStay;
        this.employeeNumber = employeeNumber;
        this.noOfAccompanyingFamilyMembers = noOfAccompanyingFamilyMembers;
        this.type = ModelType.APPLICATION;
    }

    public int getRandom() {
        Random rand = new Random();
        int upperbound = 100000000;
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }

    public int getApplicationID() {
        return this.applicationID;
    }

    public String getApplicantName() {
        return this.applicantName;
    }

    public String getResidentType() {
        return this.residentType;
    }

    public String getFirstPrefRoom() {
        return this.firstPrefRoom;
    }

    public String getSecondPrefRoom() {
        return this.secondPrefRoom;
    }

    public String getFirstPrefResidence() {
        return this.firstPrefResidence;
    }

    public String getSecondPrefResidence() {
        return this.secondPrefResidence;
    }
    
    public String getHousingSession() {
        return this.housingSession;
    }

    public String getCWL() {
        return this.CWL;
    }

    public  int getStudentNumber() {
        return this.studentNumber;
    }

    public String getProgram() {
        return this.program;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getLengthOfStay() {
        return this.lengthOfStay;
    }

    public int getEmployeeNumber() {
        return this.employeeNumber;
    }

    public int getNoOfAccompanyingFamilyMembers() {
        return this.noOfAccompanyingFamilyMembers;
    }
}

