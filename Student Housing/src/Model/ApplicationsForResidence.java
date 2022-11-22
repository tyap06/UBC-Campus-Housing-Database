package Model;

public class ApplicationsForResidence {
    int residenceID;
    int applicationID;

    public ApplicationsForResidence(int residenceID, int applicationID) {
        this.residenceID = residenceID;
        this.applicationID = applicationID;
    }

    public int getResidenceID() {
        return this.residenceID;
    }

    public int getApplicationID() {
        return this.applicationID;
    }
}
