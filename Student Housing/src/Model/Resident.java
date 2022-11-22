package Model;

public class Resident extends Model{
    int residentID;
    String residentName;
    String housingSession;
    String CWL;
    int studentNumber;
    String program;
    String emailAddress;
    String lengthOfStay;
    int employeeNumber;
    int noOfAccompanyingFamilyMembers;

    public Resident(int residentID, String residentName, String housingSession, String CWL,
                    int studentNumber, String program, String emailAddress, String lengthOfStay, int employeeNumber,
                    int noOfAccompanyingFamilyMembers) {
        this.residentID = residentID;
        this.residentName = residentName;
        this.housingSession = housingSession;
        this.CWL = CWL;
        this.studentNumber = studentNumber;
        this.program = program;
        this.emailAddress = emailAddress;
        this.lengthOfStay = lengthOfStay;
        this.employeeNumber = employeeNumber;
        this.noOfAccompanyingFamilyMembers = noOfAccompanyingFamilyMembers;
    }

    public int getResidentID() {
        return this.residentID;
    }

    public String getResidentName() {
        return this.residentName;
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
