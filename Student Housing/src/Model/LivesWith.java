package Model;

public class LivesWith {
    int residentID;
    int otherResidentID;

    public LivesWith(int residentID, int otherResidentID) {
        this.residentID = residentID;
        this.otherResidentID = otherResidentID;
    }

    public int getResidentID() {
        return this.residentID;
    }

    public int getOtherResidentID() {
        return this.otherResidentID;
    }




}
