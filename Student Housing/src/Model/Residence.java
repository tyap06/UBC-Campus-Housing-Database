package Model;

public class Residence extends Model{
    int residenceID;
    String residenceAddress;
    String residenceName;

    public Residence(int residenceID, String residenceAddress, String residenceName) {
        this.residenceID = residenceID;
        this.residenceAddress = residenceAddress;
        this.residenceName = residenceName;
    }

    public int getResidenceID() {
        return this.residenceID;
    }

    public String getResidenceAddress() {
        return this.residenceAddress;
    }

    public String getResidenceName() {
        return this.residenceName;
    }
}
