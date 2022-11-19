package Model;

public class RoomInfo {
    String house;
    int unitNumber;
    String roomType;
    int rent;

    public RoomInfo(String house, int unitNumber, String roomType, int rent) {
        this.house = house;
        this.unitNumber = unitNumber;
        this.roomType = roomType;
        this.rent = rent;
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
}
