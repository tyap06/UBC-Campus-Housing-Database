package Model;

import util.ModelType;

public class Campus extends Model{
    int campusID;
    String campusName;
    String campusAddress;

    public Campus(int campusID, String campusName, String campusAddress) {
        this.campusID = campusID;
        this.campusName = campusName;
        this.campusAddress = campusAddress;
        this.type = ModelType.CAMPUS;

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
