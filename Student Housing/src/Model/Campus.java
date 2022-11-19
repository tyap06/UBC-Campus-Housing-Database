package Model;

public class Campus {
    int campusID;
    String campusName;
    String campusAddress;

    public Campus(int campusID, String campusName, String campusAddress) {
        this.campusID = campusID;
        this.campusName = campusName;
        this.campusAddress = campusAddress;

    }

    public int getCampusID() {
        return this.campusID;
    }

    public String getCampusName() {
        return this.campusName;
    }

    public String getCampusAddress() {
        return this.campusAddress;
    }

}
