package Model;

import util.ModelType;

public class CFAResidents extends Model{
    int campusID;
    int residenceID;

    public CFAResidents(int campusID, int residenceID) {
        this.campusID = campusID;
        this.residenceID = residenceID;
        this.type = ModelType.CFARESIDENTS;
    }

    public int getCampusID() {
        return this.campusID;
    }

    public int getResidenceID() {
        return this.residenceID;
    }
}
