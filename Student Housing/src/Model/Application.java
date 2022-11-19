package Model;

public class Application {
    int applicationID;
    String applicantName;
    String residentType;
    String firstPrefRoom;
    String secondPrefRoom;
    String firstPrefResidence;
    String secondPrefResidence;

    public Application(int applicationID, String applicantName, String residentType, String firstPrefRoom, String secondPrefRoom, String firstPrefResidence, String secondPrefResidence) {
        this.applicationID = applicationID;
        this.applicantName = applicantName;
        this.residentType = residentType;
        this.firstPrefRoom = firstPrefRoom;
        this.secondPrefRoom = secondPrefRoom;
        this.firstPrefResidence = firstPrefResidence;
        this.secondPrefResidence = secondPrefResidence;
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
}

