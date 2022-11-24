package Model;

import util.ModelType;

public class ResidenceOnCampus extends Model{
    int campusID;
    int residenceID;

    public ResidenceOnCampus(int campusID, int residenceID) {
        this.campusID = campusID;
        this.residenceID = residenceID;
        this.type = ModelType.RESIDENCEONCAMPUS;
    }

    public int getCampusID() {
        return this.campusID;
    }

    public int getResidenceID() {
        return this.residenceID;
    }
}
