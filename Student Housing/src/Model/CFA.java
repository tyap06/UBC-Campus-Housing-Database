package Model;

public class CFA extends Model{
    int cfaID;
    String accessibilityAccommodation;

    public CFA(int cfaID, String accessibilityAccommodation) {
        this.cfaID = cfaID;
        this.accessibilityAccommodation = accessibilityAccommodation;
    }

    public int getCfaID() {
        return this.cfaID;
    }

    public String getAccessibilityAccommodation() {
        return this.accessibilityAccommodation;
    }
}
