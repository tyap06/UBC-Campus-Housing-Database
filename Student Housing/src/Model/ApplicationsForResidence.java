package Model;

import util.ModelType;

public class ApplicationsForResidence extends Model{
    int residenceID;
    int applicationID;

    public ApplicationsForResidence(int residenceID, int applicationID) {
        this.residenceID = residenceID;
        this.applicationID = applicationID;
        this.type = ModelType.APPLICATIONSFORRESIDENCE;

    }

    public int getResidenceID() {
        return this.residenceID;
    }

    public int getApplicationID() {
        return this.applicationID;
    }
}
