package Model;

import util.ModelType;

public class Works extends Model{
    int residenceStaffID;
    int residenceID;

    public Works(int residenceStaffID, int residenceID) {
        this.residenceStaffID = residenceStaffID;
        this.residenceID = residenceID;
        this.type = ModelType.WORKS;
    }

    public int getResidenceStaffID() {
        return this.residenceStaffID;
    }

    public int getResidenceID() {
        return this.residenceID;
    }
}
