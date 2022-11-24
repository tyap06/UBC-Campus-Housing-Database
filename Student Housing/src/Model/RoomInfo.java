package Model;

import util.ModelType;

public class RoomInfo extends Model{
    String house;
    int unitNumber;
    String roomType;
    int rent;
    int residenceID;

    public RoomInfo(String house, int unitNumber, String roomType, int rent, int residenceID) {
        this.house = house;
        this.unitNumber = unitNumber;
        this.roomType = roomType;
        this.rent = rent;
        this.residenceID = residenceID;
        this.type = ModelType.ROOMINFO;

    }

    public String getHouse() {
        return this.house;
    }

    public int getUnitNumber() {
        return this.unitNumber;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public int getRent() {
        return this.rent;
    }

    public int getResidenceID() {
        return this.residenceID;
    }
}
