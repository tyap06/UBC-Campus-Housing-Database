package Model;

import util.ModelType;


public class AmenitiesInResidence extends Model {
    int amenityID;
    int residenceID;
    int noOfRooms;

    public AmenitiesInResidence(int amenityID, int residenceID, int noOfRooms) {
        this.amenityID = amenityID;
        this.residenceID = residenceID;
        this.noOfRooms = noOfRooms;
        this.type = ModelType.AMENITIESINRESIDENCE;
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
