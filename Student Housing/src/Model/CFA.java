package Model;

import util.ModelType;

public class CFA extends Model{
    int cfaID;
    String accessibilityAccommodation;

    public CFA(int cfaID, String accessibilityAccommodation) {
        this.cfaID = cfaID;
        this.accessibilityAccommodation = accessibilityAccommodation;
        this.type = ModelType.CFA;
    }

    public int getCfaID() {
        return this.cfaID;
    }

    public String getAccessibilityAccommodation() {
        return this.accessibilityAccommodation;
    }
}
