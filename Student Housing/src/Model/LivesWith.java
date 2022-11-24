package Model;

import util.ModelType;

public class LivesWith extends Model{
    int residentID;
    int otherResidentID;

    public LivesWith(int residentID, int otherResidentID) {
        this.residentID = residentID;
        this.otherResidentID = otherResidentID;
        this.type = ModelType.LIVESWITH;
    }

    public int getResidentID() {
        return this.residentID;
    }

    public int getOtherResidentID() {
        return this.otherResidentID;
    }




}
