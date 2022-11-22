package Model;

public class ResidenceOnCampus {
    int campusID;
    int residenceID;

    public ResidenceOnCampus(int campusID, int residenceID) {
        this.campusID = campusID;
        this.residenceID = residenceID;
    }

    public int getCampusID() {
        return this.campusID;
    }

    public int getResidenceID() {
        return this.residenceID;
    }
}
