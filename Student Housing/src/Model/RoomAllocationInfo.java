package Model;

import util.ModelType;


public class RoomAllocationInfo extends Model{
    String house;
    int unitNumber;
    int residentID;
    int residenceID;

    public RoomAllocationInfo(String house, int unitNumber, int residentID, int residenceID) {
        this.house = house;
        this.unitNumber = unitNumber;
        this.residentID = residentID;
        this.residenceID = residenceID;
        this.type = ModelType.ROOMALLOCATIONINFO;
    }

    public String getHouse() {
        return this.house;
    }

    public int getUnitNumber() {
        return this.unitNumber;
    }

    public int getResidentID() {
        return this.residentID;
    }

    public int getResidenceID() {
        return this.residenceID;
    }
}
