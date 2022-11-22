package Model;

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
