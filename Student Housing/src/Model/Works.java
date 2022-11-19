package Model;

public class Works{
    int residenceStaffID;
    int residenceID;

    public Works(int residenceStaffID, int residenceID) {
        this.residenceStaffID = residenceStaffID;
        this.residenceID = residenceID;
    }

    public int getResidenceStaffID() {
        return this.residenceStaffID;
    }

    public int getResidenceID() {
        return this.residenceID;
    }
}
