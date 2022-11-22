package Model;

public class Amenities extends Model {
    int amenityID;
    String amenityName;

    public Amenities(int amenityID, String amenityName) {
        this.amenityID = amenityID;
        this.amenityName = amenityName;
    }

    public int getAmenityID() {
        return this.amenityID;
    }

    public String getAmenityName() {
        return this.amenityName;
    }

}
