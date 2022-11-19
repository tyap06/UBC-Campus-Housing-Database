package Model;

public class Amenities {
    int amenityID;
    String amenityName;
    int noOfRooms;

    public Amenities(int amenityID, String amenityName, int noOfRooms) {
        this.amenityID = amenityID;
        this.amenityName = amenityName;
        this.noOfRooms = noOfRooms;
    }

    public int getAmenityID() {
        return this.amenityID;
    }

    public String getAmenityName() {
        return this.amenityName;
    }

    public int getNoOfRooms() {
        return this.noOfRooms;
    }
}
