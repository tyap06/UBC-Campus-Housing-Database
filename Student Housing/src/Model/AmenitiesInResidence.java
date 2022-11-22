package Model;

public class AmenitiesInResidence extends Model {
    int amenityID;
    int residenceID;
    int noOfRooms;

    public AmenitiesInResidence(int amenityID, int residenceID, int noOfRooms) {
        this.amenityID = amenityID;
        this.residenceID = residenceID;
        this.noOfRooms = noOfRooms;
    }

    public int getAmenityID() {
        return this.amenityID;
    }

    public int getResidenceID() {
        return this.residenceID;
    }

    public int getNoOfRooms() {
        return this.noOfRooms;
    }
}
