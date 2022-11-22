package Model;

public class Application {
    int applicationID;
    String applicantName;
    String residentType;
    String firstPrefRoom;
    String secondPrefRoom;
    String firstPrefResidence;
    String secondPrefResidence;
    String housingSession;
    String CWL;
    int studentNumber;
    String program;
    String emailAddress;
    String lengthOfStay;
    int employeeNumber;
    int noOfAccompanyingFamilyMembers;

    public Application(int applicationID, String applicantName, String residentType, String firstPrefRoom, String secondPrefRoom, String firstPrefResidence, String secondPrefResidence, String housingSession;
    String CWL, int studentNumber, String program, String emailAddress, String lengthOfStay, int employeeNumber, int noOfAccompanyingFamilyMembers) {
        this.applicationID = applicationID;
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

